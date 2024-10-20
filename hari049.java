import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();
        
        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else if (nilai >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}
