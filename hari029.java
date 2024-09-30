import java.math.BigInteger;

public class BigInteger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("10");
        BigInteger num2 = new BigInteger("20");

        // Penjumlahan
        BigInteger sum = num1.add(num2);
        System.out.println("Hasil Penjumlahan: " + sum);
    }
}
