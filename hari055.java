import java.util.Scanner;

public class Pasangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lakiLaki = {"Ari", "Bayu", "Ciko"};
        String[] perempuan = {"Desi", "Erika", "Farhana"};
        String[] pilihan = new String[3];

        System.out.print("Pilihan Ari (Desi/Erika/Farhana): ");
        pilihan[0] = scanner.nextLine();

        if (isValidChoice(pilihan[0], perempuan)) {
            System.out.print("Pilihan Bayu (Desi/Erika/Farhana): ");
            pilihan[1] = scanner.nextLine();
        }

        if (isValidChoice(pilihan[1], perempuan) && !pilihan[1].equalsIgnoreCase(pilihan[0])) {
            System.out.print("Pilihan Ciko (Desi/Erika/Farhana): ");
            pilihan[2] = scanner.nextLine();
        }

        System.out.println("Pasangan yang terbentuk:");
        System.out.println("Ari - " + pilihan[0]);
        if (pilihan[1] != null) {
            System.out.println("Bayu - " + pilihan[1]);
        }
        if (pilihan[2] != null && !pilihan[2].equalsIgnoreCase(pilihan[1])) {
            System.out.println("Ciko - " + pilihan[2]);
        }
    }

    private static boolean isValidChoice(String choice, String[] options) {
        for (String option : options) {
            if (option.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        System.out.println("Pilihan tidak valid! Silakan coba lagi.");
        return false;
    }
}
