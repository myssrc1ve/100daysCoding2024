public class Main {
    public static void main(String[] args) {
        
        Character ch = new Character('A');

        System.out.println("Karakter: " + ch);

        
        System.out.println("Apakah huruf kapital? " + Character.isUpperCase(ch));
        System.out.println("Karakter setelah diubah menjadi kecil: " + Character.toLowerCase(ch));
    }
}
