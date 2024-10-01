import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123.45");
        BigDecimal num2 = new BigDecimal("67.89");

        System.out.println("Jumlah: " + num1.add(num2));
        System.out.println("Selisih: " + num1.subtract(num2));
        System.out.println("Hasil Kali: " + num1.multiply(num2));
        System.out.println("Hasil Bagi: " + num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP));
    }
}
