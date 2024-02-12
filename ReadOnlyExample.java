package Encapsulation;

public class ReadOnlyExample {
    private int readOnlyData;

    public ReadOnlyExample(int data){
        this.readOnlyData = data;
    }

    public int getReadOnlyData() {
        return readOnlyData;
    }
}
