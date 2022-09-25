//copy paste start for tutorials

package org.example.ch14;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class MapsData<A,B>{
    private A a;
    private B b;
    public MapsData() {};
    public MapsData(A a,B b) {
        this.a = a;
        this.b = b;
    }

    public Object[] getData() {
        Object [] temp = {a,b};
        return temp;
    }

    public void setData(A a,B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "Data: [obj= " + a + " ] /n" + "[obj= " + b + " ] /n";
    }

}
public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        student.put(3,"Ant");
        student.put(1,"Wilson");
        student.put(2,"Fred");
        for(Map.Entry<Integer,String> entry: student.entrySet()) {
            System.out.println("key: " +entry.getKey() + " value: " +entry.getValue());
        }
        //alternative
        for(Integer element: student.keySet()) {
            System.out.println("key: " +element+ " value: " +student.get(element));
        }
        //alternative 2
        Iterator<Entry<Integer,String>> iter = (student.entrySet().iterator());
        while(iter.hasNext()) {
            Entry<Integer,String> temp = iter.next();
            System.out.println("key: " +temp.getKey()+ " value: " +temp.getValue());
        }
        System.out.println("---------------------");

        Map<MapsData,String> data = new HashMap<>();
        data.put(new MapsData<Integer,String>(1,"one"),"lecture 1");
        data.put(new MapsData<Integer,String>(2,"two"),"lecture 2");
        data.put(new MapsData<Integer,String>(3,"three"),"lecture 3");
        data.put(new MapsData<Integer,String>(4,"four"),"lecture 4");

    }
}

