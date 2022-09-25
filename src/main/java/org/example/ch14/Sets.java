//copy paste start for tutorials

package org.example.ch14;

import java.util.*;

class SetData<K,V> {
    private K privateKey;
    private V privateValue;

    public SetData(K key, V var){
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
public class Sets {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new LinkedHashSet<>();
        Set<String> setC = new TreeSet<>();
        for(int i = 30; i>0; i--){
            setA.add("A"+i);
            setB.add("A"+i);
            setC.add("A"+i);
        }

        for (String i: setA) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (String i: setB) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (String i: setC) {
            System.out.print(i + "  ");
        }

        /////////////////////////////////////////////////////

        Set<SetData> setData = new LinkedHashSet<>();
        setData.add(new SetData("key", "value"));
        setData.add(new SetData("1", "one"));
        setData.add(new SetData("2", "two"));
        setData.add(new SetData("3", "three"));
        setData.add(new SetData("5", "five"));
        setData.add(new SetData("6", "six"));

        for(SetData element: setData){
            System.out.println(element);
        }

        ///////////////////comparator////////////////////////////////////
        System.out.println("---------- comparators with sets ----------------4");
        Comparator<SetData<Integer,String>> compareKey = new Comparator<SetData<Integer, String>>() {
            @Override
            public int compare(SetData<Integer, String> o1, SetData<Integer, String> o2) {
                if(o1.getKey() < o2.getKey()){
                    return -1;
                }
                if(o1.getKey() > o2.getKey()){
                    return 1;
                }
                return 0;
            }
        };
        Comparator<SetData<Integer,String>> compareNameLength = new Comparator<SetData<Integer, String>>() {
            @Override
            public int compare(SetData<Integer, String> o1, SetData<Integer, String> o2) {
                if(o1.getValue().length() < o2.getValue().length()){
                    return -1;
                }
                if(o1.getValue().length() > o2.getValue().length()){
                    return 1;
                }
                return 0;
            }
        };
        Set<SetData<Integer,String >> setTreeData = new TreeSet<>(compareKey);
        setTreeData.add(new SetData<Integer,String>(1,"one"));
        setTreeData.add(new SetData<Integer,String>(2,"two"));
        setTreeData.add(new SetData<Integer,String>(3,"three"));
        setTreeData.add(new SetData<Integer,String>(4,"four"));
        setTreeData.add(new SetData<Integer,String>(7,"seven"));
        setTreeData.add(new SetData<Integer,String>(6,"six"));
        setTreeData.add(new SetData<Integer,String>(5,"five"));
        for(SetData<Integer,String> element: setTreeData){
            System.out.println(element);
        }

        System.out.println("---------- comparators with custom sets ----------------");
        Set<SetData<Integer,String >> setTreeDataName = new TreeSet<>(compareNameLength);
        setTreeDataName.add(new SetData<Integer,String>(1,"one"));
        setTreeDataName.add(new SetData<Integer,String>(2,"two"));
        setTreeDataName.add(new SetData<Integer,String>(3,"three"));
        setTreeDataName.add(new SetData<Integer,String>(4,"four"));
        setTreeDataName.add(new SetData<Integer,String>(7,"seven"));
        setTreeDataName.add(new SetData<Integer,String>(6,"six"));
        setTreeDataName.add(new SetData<Integer,String>(5,"five"));
        for(SetData<Integer,String> element: setTreeDataName){
            System.out.println(element);
        }
    }
}

