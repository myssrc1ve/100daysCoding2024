public class TukarVariabel {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sebelum pertukaran:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Setelah pertukaran:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
