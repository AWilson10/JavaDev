package org.example.ch17;

import java.io.*;

public class StreamBasic {
    public static void main(String[] args) {
        final String outputFolder = "output_folder";
        File dir = new File (outputFolder);
        dir.mkdir();
        File file = new File(outputFolder + "/" + "Study.txt");

          // not necessary but kept  for reference
//        try {
//            file.createNewFile();
//            System.out.println("file created here: " + file.getAbsolutePath());
//        } catch (IOException e) {
//            System.out.println("error creating file here: " + file.getAbsolutePath());
//            throw new RuntimeException(e);
//        }


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Data inside file...");
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("written to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("error writing to file: " + file.getAbsolutePath());
            throw new RuntimeException(e);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(outputFolder + "/" + "Study.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println("line found: " + line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (file.delete()){
            System.out.println("deleted file: " + file);
        }
    }
}
