import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi 1:");
        int sisi1 = scanner.nextInt();
        System.out.println("Masukkan panjang sisi 2:");
        int sisi2 = scanner.nextInt();
        System.out.println("Masukkan panjang sisi 3:");
        int sisi3 = scanner.nextInt();
        
        if (sisi1 == sisi2 && sisi1 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
