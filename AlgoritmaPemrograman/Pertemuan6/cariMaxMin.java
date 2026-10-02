package AlgoritmaPemrograman.Pertemuan6;
import java.util.Scanner;

public class cariMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] penjualan = new int[7];
        int max, min;

        System.out.println("=== PROGRAM CARI PENJUALAN MAX & MIN ===");

        for (int i = 0; i < 7; i++) {
            System.out.print("Penjualan Hari ke-" + (i + 1) + ": ");
            penjualan[i] = scanner.nextInt();
        }

        max = penjualan[0];
        min = penjualan[0];

        for (int i = 1; i < 7; i++) {
            if (penjualan[i] > max) {
                max = penjualan[i];
            }
            if (penjualan[i] < min) {
                min = penjualan[i];
            }
        }

        System.out.println("\nPenjualan Tertinggi: " + max);
        System.out.println("Penjualan Terendah : " + min);
        scanner.close();
    }
}
