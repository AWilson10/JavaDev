package org.example.collections;

import java.util.*;
import java.util.ListIterator;

class Names2 implements Comparable<Names2>{
    private String name;
    public Names2(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Names2 obj){
        if(name.length() == obj.name.length()) {
            return 0;
        }
        else if(name.length() < obj.name.length()){
            return -1;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return name;
    }

}
public class GenericApp {

    public static void main(String[] args) {
        List<Object> elements = new LinkedList<>();
        Integer int1 = 1;
        elements.add(new Names("Anthony"));
        elements.add(new Names("Fred"));
        elements.add(int1);
        elements.add("Strings-----");
        elements.add(2.0);

        GenericApp app = new GenericApp();
        app.printList(elements);
    }


    public static void printList(List<Object> list){
        ListIterator<Object> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Item: " + iterator.next());
        }
        System.out.println("------------------");
    }
}