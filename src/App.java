import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
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
        myList.addLast("F");

        System.out.println(myList);

        try {
            FileWriter myWriter = new FileWriter("file.dot");
            myWriter.write(myList.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String cmd = "dot -Tpng file.dot > output.png";
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
