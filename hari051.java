import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka antara 1 hingga 5: ");
        int angka = scanner.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka satu.");
                break;
            case 2:
                System.out.println("Anda memilih angka dua.");
                break;
            case 3:
                System.out.println("Anda memilih angka tiga.");
                break;
            case 4:
                System.out.println("Anda memilih angka empat.");
                break;
            case 5:
                System.out.println("Anda memilih angka lima.");
                break;
            default:
                System.out.println("Angka tidak valid.");
                break;
        }

        scanner.close();
    }
}
