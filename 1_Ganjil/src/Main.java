import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan tiga huruf kecil:");
        String input = scanner.nextLine();
        
        if (input.length() != 3) {
            System.out.println("Input harus terdiri dari tiga huruf.");
            return;
        }
        
        char first = input.charAt(0);
        char second = input.charAt(1);
        char third = input.charAt(2);
        
        if (isKonsonan(first) && isVokal(second) && isKonsonan(third)) {
            System.out.println("Karakter merupakan urutan konsonan-vokal-konsonan");
        } else {
            System.out.println("Karakter bukan urutan konsonan-vokal-konsonan");
        }
    }
    
    private static boolean isKonsonan(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
    
    private static boolean isVokal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
