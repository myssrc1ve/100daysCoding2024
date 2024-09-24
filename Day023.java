public class ContohReferensiLong {
    public static void main(String[] args) {
        Long angkaLong = 5000L; 
        System.out.println("Nilai awal angkaLong: " + angkaLong);
        
        angkaLong = tambahkanNilai(angkaLong); 
        System.out.println("Nilai setelah ditambahkan: " + angkaLong);
    }

    public static Long tambahkanNilai(Long nilai) {
        return nilai + 250; 
}
