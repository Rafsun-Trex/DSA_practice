package javaoops;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        b=a*2;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
