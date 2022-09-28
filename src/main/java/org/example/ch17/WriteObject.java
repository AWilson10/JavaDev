package org.example.ch17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args){
        Vehicle bike = new Vehicle("bike", 9056);
        Vehicle car = new Vehicle("bike", 1200);
        System.out.println(bike.toString() + "     " + car.toString());
        String fileLocation = "output_folder/vehicles.dat";
        try {
            FileOutputStream fos = new FileOutputStream(fileLocation);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bike);
            oos.writeObject(car);
            System.out.println("Objects written to file: " +  fileLocation);
        } catch (FileNotFoundException e) {
            System.out.println("Error with File output stream");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
