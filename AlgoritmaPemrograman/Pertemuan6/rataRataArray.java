package AlgoritmaPemrograman.Pertemuan6;

import java.util.Scanner;

public class rataRataArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nilai = new double[5];
        double total = 0.0;
        double rataRata;

        System.out.println("=== PROGRAM HITUNG RATA-RATA NILAI ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
            // Accumulate total
            total = total + nilai[i];
        }

        rataRata = total / 5;

        System.out.println("\nTotal Nilai     : " + total);
        System.out.println("Rata-rata Nilai : " + rataRata);
        scanner.close();
    }
}