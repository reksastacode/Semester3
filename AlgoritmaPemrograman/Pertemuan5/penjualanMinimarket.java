import java.util.Scanner;

public class penjualanMinimarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan penjualan Hari ke-1: ");
        double h1 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-2: ");
        double h2 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-3: ");
        double h3 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-4: ");
        double h4 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-5: ");
        double h5 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-6: ");
        double h6 = scanner.nextDouble();
        System.out.print("Masukkan penjualan Hari ke-7: ");
        double h7 = scanner.nextDouble();

        double total = h1 + h2 + h3 + h4 + h5 + h6 + h7;
        double rataRata = total / 7;

        System.out.printf("\nTotal Penjualan Mingguan: %.2f\n", total);
        System.out.printf("Rata-rata Penjualan Harian: %.2f\n", rataRata);
        System.out.println("Hari dengan penjualan di bawah rata-rata:");

        if (h1 < rataRata) System.out.println("- Hari ke-1 (" + h1 + ")");
        if (h2 < rataRata) System.out.println("- Hari ke-2 (" + h2 + ")");
        if (h3 < rataRata) System.out.println("- Hari ke-3 (" + h3 + ")");
        if (h4 < rataRata) System.out.println("- Hari ke-4 (" + h4 + ")");
        if (h5 < rataRata) System.out.println("- Hari ke-5 (" + h5 + ")");
        if (h6 < rataRata) System.out.println("- Hari ke-6 (" + h6 + ")");
        if (h7 < rataRata) System.out.println("- Hari ke-7 (" + h7 + ")");
        scanner.close();
    }
}