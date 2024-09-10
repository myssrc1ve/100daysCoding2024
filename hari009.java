public class SimpleVariabelKonstanta {
    public static void main(String[] args) {
        // Deklarasi variabel
        int usiaLisa = 26; // variabel usia Lisa dengan tipe data integer
        String namaBias = "Jennie"; // variabel nama bias dengan tipe data String

        // Deklarasi konstanta
        final int JUMLAH_ANGGOTA = 4; // konstanta jumlah anggota Blackpink dengan tipe data integer

        // Menampilkan nilai variabel dan konstanta
        System.out.println("Nama Bias: " + namaBias);
        System.out.println("Usia Lisa: " + usiaLisa);
        System.out.println("Jumlah Anggota Blackpink: " + JUMLAH_ANGGOTA);

        // Mengubah nilai variabel
        usiaLisa = 27; // nilai variabel usia Lisa diubah

        // Menampilkan nilai variabel yang telah diubah
        System.out.println("Usia Lisa Baru: " + usiaLisa);
    }
}
