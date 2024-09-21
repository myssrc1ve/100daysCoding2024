public class contohbytereference {
    public static void main(String[] args) {
        Byte byteValue = 10;

        System.out.println("Nilai byte: " + byteValue);

        byteValue = 20;
        System.out.println("Nilai byte setelah diubah: " + byteValue);

        displayByteValue(byteValue);
    }
    public static void displayByteValue(Byte value) {
        System.out.println("Nilai byte dalam metode: " + value);
    }
}
