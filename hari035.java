import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;

        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);

        scanner.close();
    }
}
