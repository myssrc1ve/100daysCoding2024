import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasilPerkalian = angka1 * angka2;
        double hasilPembagian = angka1 / angka2;
        double hasilModulo = angka1 % angka2;

        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        System.out.println("Hasil Modulo: " + hasilModulo);

        scanner.close();
    }
}
