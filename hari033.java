public class TipeCasting {
    public static void main(String[] args) {
        //widening casting
        int angkaInt = 10;
        double angkaDouble = angkaInt; 
        System.out.println("Widening Casting: " + angkaDouble);

        //narrowing casting
        double angkaDouble2 = 9.99;
        int angkaInt2 = (int) angkaDouble2; 
        System.out.println("Narrowing Casting: " + angkaInt2);

        //casting objek
        class Hewan {}
        class Kucing extends Hewan {}

        Hewan hewan = new Kucing();
        Kucing kucing = (Kucing) hewan;
        System.out.println("Casting objek berhasil.");
    }
}
