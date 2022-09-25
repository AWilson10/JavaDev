package org.example.collections;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class IntApp {
    public static void main(String[] args) {
        ArrayList<Wrapper> intNumbers = new ArrayList<>();
        intNumbers.add(new Wrapper(10));
        System.out.println(intNumbers.get(0).getIntValue());
    }
}
