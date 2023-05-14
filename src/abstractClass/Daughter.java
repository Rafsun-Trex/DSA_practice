package abstractClass;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be best doctor");
    }

    @Override
    void family() {
        System.out.println("I love my father, he was 52");
    }
}
