package org.example.Generics;
class BoundedData<K extends Integer,V extends Bounded> {

    private K privateKey;
    private V privateValue;
    public BoundedData(K key, V var){
        this.privateKey = key;
        this.privateValue = var;
    }

    @Override
    public String toString() {
        return "Data: [Value= " + privateValue + " ]. Key: " + privateKey;
    }

    public K getPrivateKey() {
        return privateKey;
    }
    public V getPrivateValue() {
        return privateValue;
    }

    public void setPrivateKey(K privateKey) {
        this.privateKey = privateKey;
    }
    public void setPrivateValue(V privateValue) {
        this.privateValue = privateValue;
    }
    public  <E extends Character, N extends Number> void display(E element, N number) {
        System.out.println("element: " + element + "  number: " + number);
    }
}
public class Bounded {
    public static void main(String[] args) {
        BoundedData<Integer,Bounded> data = new BoundedData(1,new Bounded());
        data.display('e', 1);
        data.getPrivateValue().test();
    }
    public void test() {
        System.out.println("Testing:");
    }
}
