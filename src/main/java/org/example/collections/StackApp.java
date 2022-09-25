package org.example.collections;

import java.util.Stack;

public class StackApp {
    public static void main (String [] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        System.out.println(demo.peek());
        for(Integer temp: demo){
            System.out.println(demo);
        }

    }

}
