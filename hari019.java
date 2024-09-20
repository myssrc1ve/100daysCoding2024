import java.util.Scanner;

public class ContohString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        String sapa = "weh, ";

        cetakSapa(nama, sapa);

        String namaKapital = ubahKeKapital(nama);
        System.out.println("Nama dengan huruf kapital: " + namaKapital);
    }

    public static void cetakSapa(String nama, String sapa) {
        System.out.println(sapa + nama + "!");
    }
  
    public static String ubahKeKapital(String str) {
        return str.toUpperCase();
    }
}
