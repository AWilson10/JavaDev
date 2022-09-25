package org.example.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class GenData {
    public <E> void printListData(List<E> list) {
        for (E element: list) {
            System.out.println(element);
        }
    }

    public <E> void printArrayData(E[] arrayData) {
        for (E element: arrayData) {
            System.out.println(element);
        }
    }

}
public class GenLists {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       GenData data = new GenData();
       data.printListData(list);

       List<String> listArray = new ArrayList<>();
       listArray.add("One");
       listArray.add("Two");
       listArray.add("Three");
       data.printListData(listArray);

       String[] arrayString = {"10", "20", "30"};
       Integer[] arrayInteger = {1,2,3};
       data.printArrayData(arrayString);
       data.printArrayData(arrayInteger);
    }

}

