public class ContohBoolean {
    public static void main(String[] args) {
        
        Boolean isLoggedIn = Boolean.TRUE; 

        if (isLoggedIn) {
            System.out.println("Pengguna sudah login.");
        } else {
            System.out.println("Pengguna belum login.");
        }

        isLoggedIn = Boolean.FALSE;

        if (isLoggedIn) {
            System.out.println("Pengguna sudah login.");
        } else {
            System.out.println("Pengguna belum login.");
        }
    }
}
