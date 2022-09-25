package org.example.Generics;

class GenericData<T>{
    private T data;
    public GenericData(T data) {
        this.data = data;
    };
    public T getData() {
        return data;
    }

    public String toString() {
        return "Data: [obj= " + data + " ]";
    }

}
public class Generics {
    public static void main(String[] args) {
        GenericData<String> genData = new GenericData<String>("Some string");
        String data = genData.getData();
        System.out.println(data);
    }
}
