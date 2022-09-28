package org.example.ch17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        String fileLocation = "output_folder/vehicles.dat";
        try {
            FileInputStream fis = new FileInputStream(fileLocation);
            ObjectInputStream ois = new ObjectInputStream((fis));
            Vehicle v1 = (Vehicle)ois.readObject();
            Vehicle v2 = (Vehicle)ois.readObject();
            System.out.println("Objects found: " + v1 + "  " + v2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
