public class OperatorPenugasan {
    public static void main(String[] args) {
        
        int a = 10; 
        int b = 3;  

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        int moduloResult = a % b; 
        System.out.println("Hasil a % b: " + moduloResult);

        a += 5; 
        System.out.println("Nilai a setelah a += 5: " + a);
 
        a %= 4;
        System.out.println("Nilai a setelah a %= 4: " + a);
    }
}
