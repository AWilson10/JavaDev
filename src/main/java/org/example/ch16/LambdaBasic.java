package org.example.ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SomeData {
    private String name;

    public SomeData(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }

}
public class LambdaBasic {
    public static void main(String[] args) {

//        Thread thread1 = new Thread(()->{
//            System.out.println("I am inside thread 1");
//        });
//        thread1.start();
//
//    }
        List<SomeData> list = new ArrayList<>();
        list.add(new SomeData("Chaand"));
        list.add(new SomeData("Ed"));
        list.add(new SomeData("Angelica"));
        list.add(new SomeData("Maqbul"));
        list.add(new SomeData("John"));

        Collections.sort(list, (SomeData o1, SomeData o2) -> {

            if(o1.getName().length() < o2.getName().length()){
                return -1;
            }else if(o1.getName().length() > o2.getName().length()){
                return 1;
            }else{
                return 0;
            }
        });

        for (SomeData data : list) {
            System.out.println(data.getName());
        }

        List<Integer> intList = new ArrayList<>();
        intList.add(34);
        intList.add(0000000004);
        intList.forEach(temp->  {
            System.out.println(temp.byteValue());
        });


    }
}
