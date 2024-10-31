import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Masukkan angka positif (0 untuk keluar): ");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Anda memasukkan angka: " + number);
            }
        } while (number != 0);

        System.out.println("Program selesai.");
        scanner.close();
    }
}
