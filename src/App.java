import java.io.BufferedReader;
import java.io.InputStreamReader;

import structures.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList<String> myList = new LinkedList<>();
        myList.addFirst("C");
        myList.addFirst("B");
        myList.addFirst("A");
        myList.addLast("D");

        System.out.println(myList);

        String cmd = "echo '" + myList + "' | dot -Tpng > output.png";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
    }
}
