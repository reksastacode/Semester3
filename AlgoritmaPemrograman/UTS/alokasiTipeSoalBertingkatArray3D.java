package UTS;

import java.util.Scanner;
public class alokasiTipeSoalBertingkatArray3D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lantai = 2;
        int baris = 3;
        int kolom = 5;

        int totalA = 0;
        int totalB = 0;

        String[][][] nim = new String[lantai][baris][kolom];
        char[][][] tipeSoal = new char[lantai][baris][kolom];

        System.out.println("--- INPUT DATA KURSI UJIAN (2 LANTAI x 3 BARIS x 5 KOLOM) ---");
        for (int L = 0; L < lantai; L++) {
            System.out.println("\n--- Lantai " + (L + 1) + " (Indeks Lantai: " + L + ") ---");
            for (int b = 0; b < baris; b++) {
                for (int k = 0; k < kolom; k++) {
                    System.out.print("NIM Kursi [L:" + L + "][B:" + b + "][K:" + k + "]: ");
                    nim[L][b][k] = input.next();

                    int totalIndeks = L + b + k;

                    if (totalIndeks % 2 == 0) {
                        tipeSoal[L][b][k] = 'A';
                        totalA++;
                    } else {
                        tipeSoal[L][b][k] = 'B';
                        totalB++;
                    }
                }
            }
        }

        System.out.println("\n--------------------------------------------------------");
        System.out.println("               HASIL ALOKASI KURSI UJIAN                ");
        System.out.println("--------------------------------------------------------");
        for (int L = 0; L < lantai; L++) {
            System.out.println("\n>> LANTAI " + (L + 1) + " <<");
            for (int b = 0; b < baris; b++) {
                for (int k = 0; k < kolom; k++) {
                    System.out.printf("[K%d%d%d | NIM: %-8s | Soal %c]  ", L, b, k, nim[L][b][k], tipeSoal[L][b][k]);
                }
                System.out.println();
            }
        }

        System.out.println("\n--------------------------------------------------------");
        System.out.println("                   REKAPITULASI PESERTA                 ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Total Peserta Soal Tipe A (Indeks Genap) : " + totalA + " mahasiswa");
        System.out.println("Total Peserta Soal Tipe B (Indeks Ganjil): " + totalB + " mahasiswa");
        System.out.println("Total Seluruh Peserta Ujian              : " + (totalA + totalB) + " mahasiswa");

        input.close();
    }
}
