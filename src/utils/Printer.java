package utils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printer {
    public void print(String dotString, String filename) {
        try {
            FileWriter dotWriter = new FileWriter(filename + ".dot");
            dotWriter.write(dotString);
            dotWriter.close();
            System.out.println("Successfully wrote to the dot.");

            String cmd = "dot -Tpng " + filename + ".dot -o " + filename + ".png";
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);
            pr.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line = "";
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
