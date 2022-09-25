package org.example.collections;

import java.util.*;
import java.util.ListIterator;

class Names implements Comparable<Names>{
    private String name;
    public Names(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Names obj){
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
public class CollectApp {

    public static void main(String[] args) {
        List names = new LinkedList();
        names.add(new Names("Anthony"));
        names.add(new Names("Fred"));

        CollectApp app = new CollectApp();
        app.printList(names);

    }


    public static void printList(List<Names> list){
        ListIterator<Names> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Item: " + iterator.next());
        }
        System.out.println("------------------");
    }
}