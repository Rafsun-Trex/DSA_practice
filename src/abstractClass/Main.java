package abstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        Daughter daughter = new Daughter(17);

        son.career();
        son.family();

        daughter.career();
        daughter.family();


    }
}
