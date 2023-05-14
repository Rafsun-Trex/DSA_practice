package javaoops;

public class MainHuman {
    public static void main(String[] args) {
        Human rafsun = new Human(24, "Rafsun", 250000);
        Human ibnat = new Human(22, "Ibnat", 25000);

        System.out.println(Human.population);
        System.out.println(Human.population);


        fun();

    }

    static void fun()
    {
        System.out.println("Hello I am fun");
        MainHuman m = new MainHuman();
        m.greet();
    }
    void greet()
    {
        System.out.println("Heyyyyyy greetingssss");
    }

}
