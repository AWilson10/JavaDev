package org.example.ch17;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String type;
    private int number;

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }
}
