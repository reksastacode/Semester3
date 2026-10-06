package Pertemuan7;

import java.util.Scanner;
public class stokApotek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang (M): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah jenis obat (N): ");
        int n = scanner.nextInt();

        int[][] gudangA = new int[m][n];
        int[][] gudangB = new int[m][n];
        int[][] totalStok = new int[m][n];

        // Input Gudang A
        System.out.println("\n--- Input Stok Gudang A ---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Cabang " + (i + 1) + ", Obat " + (j + 1) + ": ");
                gudangA[i][j] = scanner.nextInt();
            }
        }

        // Input Gudang B
        System.out.println("\n--- Input Stok Gudang B ---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Cabang " + (i + 1) + ", Obat " + (j + 1) + ": ");
                gudangB[i][j] = scanner.nextInt();
            }
        }

        // Hitung Total Stok
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalStok[i][j] = gudangA[i][j] + gudangB[i][j];
            }
        }

        // Cetak Hasil
        System.out.println("\n--- Matriks Total Stok Obat ---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(totalStok[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}