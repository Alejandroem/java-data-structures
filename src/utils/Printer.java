package utils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printer {
    public void print(String dotString, String filename) {
        try {
            FileWriter dotWriter = new FileWriter("assets/" + filename + ".dot");
            dotWriter.write(dotString);
            dotWriter.close();
            System.out.println("Successfully wrote to the assets/" + filename + ".dot");

            String cmd = "dot -Tpng assets/" + filename + ".dot -o assets/" + filename + ".png";
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);
            pr.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line = "";
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Successfully compiled to the assets/" + filename + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
