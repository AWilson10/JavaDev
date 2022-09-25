package org.example.Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class DataKeys<K,V> {
    private K privateKey;
    private V privateValue;
    public DataKeys(K key, V var){
        this.privateKey = key;
        this.privateValue = var;
    }
    public V getValue() {
        return privateValue;
    }
    public K getKey() {
        return privateKey;
    }
    @Override
    public String toString() {
        return "Data: [Value= " + privateValue + " ]. Key: " + privateKey;
    }
    public  <E, N> void display(E element, N number) {
        System.out.println("element: " + element + "  number: " + number);
    }
}
public class GenKeys {
    public static void main(String[] args) {
        DataKeys data = new DataKeys(1, "Anthony");
        System.out.println("key: " + data.getKey() + " value: " + data.getValue());
        data.display("element", 25);
        data.display("data: ", data.getKey());
    }

}
