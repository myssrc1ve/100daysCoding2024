import java.util.Scanner;

public class Lingkaran {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan satuan: ");
        String satuan = input.next();

        double keliling = 2 * PI * radius;
        double luas = PI * radius * radius;

        System.out.println("============= Hasil =============");
        System.out.printf("%-20s: %.2f %s%n", "Jari-jari lingkaran", radius, satuan);
        System.out.printf("%-20s: %.2f %s%n", "Keliling lingkaran", keliling, satuan);
        System.out.printf("%-20s: %.2f %s^2%n", "Luas lingkaran", luas, satuan);
    }
}
