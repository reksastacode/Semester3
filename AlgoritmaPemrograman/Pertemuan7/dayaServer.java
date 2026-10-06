package Pertemuan7;

import java.util.Scanner;

public class dayaServer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah Data Center (T): ");
        int t = scanner.nextInt();
        System.out.print("Masukkan jumlah Rack per Data Center (R): ");
        int r = scanner.nextInt();
        System.out.print("Masukkan jumlah Server per Rack (S): ");
        int s = scanner.nextInt();
        double[][][] dayaListrik = new double[t][r][s];
        double totalDaya = 0;
        // Input Data
        for (int i = 0; i < t; i++) {
            System.out.println("\n=== Data Center ke-" + (i + 1) + " ===");
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < s; k++) {
                    System.out.print("Rack " + (j + 1) + ", Server " + (k + 1) + " (Watt): ");
                    dayaListrik[i][j][k] = scanner.nextDouble();
                }
            }
        }
        // Proses Akumulasi
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < s; k++) {
                    totalDaya = totalDaya + dayaListrik[i][j][k];
                }
            }
        }
        // Hitung Rata-rata
        double rataRataDaya = totalDaya / (t * r * s);
        System.out.println("\n================ MONITORED POWER ================");
        System.out.printf("Total Konsumsi Daya Overall : %.2f Watt\n", totalDaya);
        System.out.printf("Rata-rata Daya per Server : %.2f Watt\n", rataRataDaya);
        scanner.close();
    }
}

