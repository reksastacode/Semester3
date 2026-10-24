package Pertemuan8;
import java.util.Scanner;
public class kasirToko {

    public static void tampilkanMenuHeader() {
        System.out.println("=========================================");
        System.out.println("       SISTEM KASIR TOKO SERBA ADA       ");
        System.out.println("=========================================");
    }

    public static double hitungSubtotal(int harga, int qty) {
        return (double) harga * qty;
    }

    public static double hitungDiskon(double total, int isMember) {
        double persentaseDiskon = 0.0;
        
        if (isMember == 1) {
            persentaseDiskon += 0.10; 
        }
        
        if (total > 100000) {
            persentaseDiskon += 0.05; 
        }
        
        return total * persentaseDiskon;
    }

    public static double hitungPajak(double totalSetelahDiskon) {
        return totalSetelahDiskon * 0.11;
    }

    public static void cetakStruk(double subtotal, double diskon, double pajak, double grandTotal) {
        System.out.println("\n=========================================");
        System.out.println("            STRUK PEMBAYARAN             ");
        System.out.println("=========================================");
        System.out.printf("Subtotal           : Rp %,12.2f\n", subtotal);
        System.out.printf("Diskon             : Rp %,12.2f\n", diskon);
        System.out.printf("Total Sth Diskon   : Rp %,12.2f\n", (subtotal - diskon));
        System.out.printf("PPN (11%%)          : Rp %,12.2f\n", pajak);
        System.out.println("-----------------------------------------");
        System.out.printf("GRAND TOTAL        : Rp %,12.2f\n", grandTotal);
        System.out.println("=========================================");
        System.out.println("     Terima Kasih Telah Berbelanja!     ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tampilkanMenuHeader();

        System.out.print("Masukkan Harga Barang (Rp): ");
        int harga = scanner.nextInt();

        System.out.print("Masukkan Jumlah Barang (Qty): ");
        int qty = scanner.nextInt();

        System.out.print("Apakah Pelanggan Member? (1 = Ya, 0 = Tidak): ");
        int isMember = scanner.nextInt();

        double subtotal = hitungSubtotal(harga, qty);
        double diskon = hitungDiskon(subtotal, isMember);
        double totalSetelahDiskon = subtotal - diskon;
        double pajak = hitungPajak(totalSetelahDiskon);
        double grandTotal = totalSetelahDiskon + pajak;

        cetakStruk(subtotal, diskon, pajak, grandTotal);
        scanner.close();
    }
}
