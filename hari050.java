import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = scanner.nextInt();

        if (nilai >= 85) {
            System.out.println("Grade: A");
        } else if (nilai >= 70) {
            System.out.println("Grade: B");
        } else if (nilai >= 55) {
            System.out.println("Grade: C");
        } else if (nilai >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }

        scanner.close();
    }
}
