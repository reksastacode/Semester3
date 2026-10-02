import java.util.Scanner;

public class balikArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;

        System.out.print("Masukkan jumlah elemen (N): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan " + n + " data:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Inisialisasi indeks batas kiri dan batas kanan
        int left = 0;
        int right = n - 1;

        // Algoritma Swap In-Place
        while (left < right) {
            // Pertukaran nilai (Swap)
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Geser indeks
            left++;
            right--;
        }

        System.out.println("\nData setelah dibalik:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}