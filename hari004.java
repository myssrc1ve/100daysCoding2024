public class ContohPrint {
    public static void main(String[] args) {
        // Menggunakan print
        System.out.print("Ini menggunakan print.");
        System.out.print(" Ini lanjutannya di baris yang sama.\n");

        // Menggunakan printf
        String nama = "Isfanur";
        int umur = 25;
        double tinggi = 170.5;

        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm\n", nama, umur, tinggi);
    }
}
