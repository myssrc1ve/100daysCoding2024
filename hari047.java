import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            System.out.println(bilangan + " adalah bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " adalah bilangan negatif.");
        } else {
            System.out.println("Bilangan adalah nol.");
        }

        scanner.close();
    }
}
