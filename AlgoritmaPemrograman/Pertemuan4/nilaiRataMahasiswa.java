package Pertemuan4;

import java.util.Scanner;
public class nilaiRataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("\nMasukkan jumlah mahasiswa: ");
            int jumlahMahasiswa = input.nextInt();

            while (jumlahMahasiswa <= 0) {
                System.out.print("Jumlah harus lebih dari 0! Masukkan kembali: ");
                jumlahMahasiswa = input.nextInt();
            }
            double total = 0;
            int lulus = 0;
            int tidakLulus = 0;

            for (int i = 1; i <= jumlahMahasiswa; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
                double nilai = input.nextDouble();

                while (nilai < 0 || nilai > 100) {
                    System.out.print("Nilai harus 0-100! Masukkan kembali nilai mahasiswa ke-" + i + ": ");
                    nilai = input.nextDouble();
                }
                total += nilai;
                if (nilai >= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }
            }
            double rataRata = total / jumlahMahasiswa;

            System.out.printf("%nTotal nilai      : %.2f%n", total);
            System.out.printf("Rata-rata kelas  : %.2f%n", rataRata);
            System.out.println("Jumlah lulus     : " + lulus);
            System.out.println("Jumlah tidak lulus: " + tidakLulus);

            System.out.print("\nHitung kelas lain? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program Selesai.");
        input.close();
    }
}