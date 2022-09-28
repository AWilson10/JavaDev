package org.example.ch17;

import java.io.*;
import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args) {
        final String outputFolder = "output_folder";
        File dir = new File (outputFolder);
        dir.mkdir();
        try {
            Scanner file = new Scanner(new File(outputFolder + "/" + "Study.txt"));
            String line;
            while (file.hasNext()) {
                line = file.nextLine();
                System.out.println("line scanned: " + line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
