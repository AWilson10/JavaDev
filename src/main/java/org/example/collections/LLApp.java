package org.example.collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LLApp {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        List<String> countriesArr = new ArrayList<>();


        countries.add("India");
        countries.add("UK");
        countries.add("France");
        countries.add("Paraguay");
        countries.add("Peru");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("Scotland");
        new LLApp().printInterfaceList(countries);
        System.out.println("--------------");
        countries.add(2,"Canadam");
        System.out.println("--------------");
        new LLApp().printInterfaceList(countries);
        System.out.println("--------------");
        countries.remove(2);
        countries.add(2,"Canada");
        new LLApp().printInterfaceList(countries);
        countries.sort(null);
        new LLApp().printInterfaceList(countries);
        Collections.reverse(countries);
        new LLApp().printInterfaceList(countries);

        countriesArr.add("1");
        countriesArr.add("2");
        (new LLApp()).printInterfaceList(countriesArr);

        new LLApp().iterateList(countries);
        new LLApp().iterateList(countriesArr);
        System.out.println("Compare: " + countries.get(0).compareTo("UK"));

    }
    public static void printList(LinkedList<String> list) {
        for (String str: list) {
            System.out.println(str);
        }
        System.out.println("------------------");
    }
    public static void printInterfaceList(List<String> list) {
        for (String str: list) {
            System.out.println(str);
        }
        System.out.println("------------------");
    }

    public static void iterateList(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Item: " + iterator.next());
        }
        System.out.println("------------------");
    }
}
