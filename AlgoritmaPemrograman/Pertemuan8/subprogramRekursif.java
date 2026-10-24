package Pertemuan8;
import java.util.Scanner;

public class subprogramRekursif {

    public static int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka untuk Faktorial (N): ");
        int num = scanner.nextInt();
        System.out.println("Hasil " + num + "! = " + faktorial(num));

        System.out.print("\nMasukkan jumlah suku Fibonacci: ");
        int count = scanner.nextInt();

        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        scanner.close();
    }
}
