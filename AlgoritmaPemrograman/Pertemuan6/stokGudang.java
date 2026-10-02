import java.util.Scanner;

public class stokGudang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang N
        System.out.print("Masukkan jumlah jenis barang (N): ");
        int n = scanner.nextInt();

        int[] stok = new int[n];

        // Input stok masing-masing barang
        System.out.println("Masukkan jumlah stok barang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Stok barang indeks ke-" + i + ": ");
            stok[i] = scanner.nextInt();
        }

        // Input ambang batas (threshold)
        System.out.print("\nMasukkan batas minimum stok (threshold): ");
        int threshold = scanner.nextInt();

        int jumlahRestock = 0;

        // Proses filter dan monitoring
        System.out.println("\n=== DAFTAR BARANG PERLU RESTOCK ===");
        for (int i = 0; i < n; i++) {
            if (stok[i] < threshold) {
                System.out.println("Barang indeks ke-" + i + " (Stok saat ini: " + stok[i] + ")");
                jumlahRestock++;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Total jenis barang perlu di-restock: " + jumlahRestock + " barang.");

        scanner.close();
    }
}