package Pertemuan2;

import java.util.Scanner;

public class totalBelanja { //kenapa membuat notasi seperti itu
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        double totalBelanja, diskon, hargaAkhir;

        System.out.println("Masukkan harga total belanja: ");
        totalBelanja = input.nextDouble();  

        if (totalBelanja > 100000) {
            diskon = 0.10 * totalBelanja;
        } else {
            diskon = 0;
        }

        hargaAkhir = totalBelanja - diskon;

        System.out.println("Total Akhir: " + hargaAkhir);

        input.close();
    }
}