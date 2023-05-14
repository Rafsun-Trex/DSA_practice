package abstractClass;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be best programmer");
    }

    @Override
    void family() {
        System.out.println("I love my mother, she is 50");
    }
}
