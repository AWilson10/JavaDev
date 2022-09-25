package org.example.collections;
import java.util.ArrayList;

public class Arrays {
    static ArrayList<String> listNames = new ArrayList<>();
    static ArrayList<Integer> listNumbers = new ArrayList<>();

    public static void main(String[] args) {
        listNames.add("Chaand");
        listNames.add("John");
        listNames.add("Steve");
        listNames.add("Pooja");
        listNames.add("Salim");
        listNames.add("Rahul");
        listNames.add("Mia");
        listNames.add("Angel");
        listNames.remove(2);
        Arrays app = new Arrays();
        app.displayList(listNames);


	    app.removeNameByPosition(0);
		System.out.println("************");
		app.displayList(listNames);
		System.out.println("************");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
        app.changeName(0,"Ant");
        System.out.println("************");
        app.displayList(listNames);

        listNumbers.add(1);



        /* System.out.println("************");
        app.removeNameByString("Pooja");
        app.displayList(listNames);
        System.out.println("************");
        System.out.println(listNames.get(3)); */


    }
    void displayList(ArrayList<String> names){
        for(String name: names){
            System.out.println(name);
        }

    }
    void removeNameByPosition(int position){
        listNames.remove(position);
    }
    void removeNameByString(String name){
        listNames.remove(name);
    }

    void changeName(int position, String name) {
        listNames.set(position,name);

    }
}


