import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jam masuk (1-12):");
        int jamMasuk = scanner.nextInt();
        
        System.out.println("Masukkan jam keluar (1-12):");
        int jamKeluar = scanner.nextInt();
        
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = 12 - jamMasuk + jamKeluar;
        }
        
        System.out.println("Lama Bekerja " + lamaBekerja + " Jam");
    }
}
