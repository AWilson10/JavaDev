//copy paste start for tutorials

package org.example.ch14;

class TemplateData<T>{
    private T data;
    public TemplateData() {};
    public TemplateData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "Data: [obj= " + data + " ]";
    }

}
public class Template {
    public static void main(String[] args) {
        TemplateData<String> genData = new TemplateData<String>("Some string");
        String data = genData.getData();
        System.out.println(data);
    }
}

