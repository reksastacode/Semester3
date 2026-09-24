import java.util.Scanner;

public class PercobaanA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double nilai = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            total += nilai;
        }

        double rataRata = total / 5;

        if (nilai > rataRata) {
            System.out.println("Nilai di atas rata-rata: " + nilai);
        }
        scanner.close();
    }
}