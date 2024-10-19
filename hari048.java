import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        if (angka > 0) {
            System.out.println("Angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka negatif.");
        } else {
            System.out.println("Angka nol.");
        }

        scanner.close();
    }
}
