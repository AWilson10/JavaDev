package org.example.Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
    private T privateVariable;
    public Data(T var){
        super();
        this.privateVariable = var;
    }
    public T getVar() {
        return privateVariable;
    }
    @Override
    public String toString() {
        return "Data: [obj= " + privateVariable + " ]. Data type: " + privateVariable.getClass().getSimpleName();
    }
}
public class GenList {
    public static void main(String[] args) {
        List<Data<Object>> elements = new LinkedList<>();
        elements.add(new Data("Text"));
        elements.add(new Data(1));
        elements.add(new Data(3.9));
        elements.add(new Data(5.0f));

        GenList app = new GenList();
        app.printList(elements);
    }

    public void printList(List<Data<Object>> list){
        ListIterator<Data<Object>> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Item: " + iterator.next());
        }
        System.out.println("------------------");
    }
}
