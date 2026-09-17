package Pertemuan3;

import java.util.Scanner;
class konversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();
        String nilai_huruf;

        if (nilai >= 85 && nilai <= 100) {
            nilai_huruf = "A";
        } else if (nilai >= 75 && nilai < 85) {
            nilai_huruf = "B";
        } else if (nilai >= 60 && nilai < 70) {
            nilai_huruf = "C";
        } else if (nilai >= 50 && nilai < 60) {
            nilai_huruf = "D";
        } else if (nilai >= 0 && nilai < 50) {
            nilai_huruf = "E";
        } else {
            nilai_huruf = "Nilai tidak valid";
        }
        System.out.println("Nilai huruf: " + nilai_huruf);
        input.close();
    }
}