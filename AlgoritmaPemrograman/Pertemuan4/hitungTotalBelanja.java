package Pertemuan4;

import java.util.Scanner;
public class hitungTotalBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total_bayar = 0;

        System.out.println("Masukkan jumlah barang: ");
        int jumlah_barang = input.nextInt();

        for (int i = 1; i <= jumlah_barang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + ": Rp ");
            double harga_barang = input.nextDouble();

            total_bayar = total_bayar + harga_barang;
        }

        System.out.printf("\nTotal Pembayaran: Rp %.2f", total_bayar);
        input.close();
    }
}
