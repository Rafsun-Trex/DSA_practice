package singleTon;

public class MainClass {
    public static void main(String[] args) {
        SingleTonClass obj = SingleTonClass.getInstance();

        SingleTonClass obj1 = SingleTonClass.getInstance();

        SingleTonClass obj2 = SingleTonClass.getInstance();


    }
}
