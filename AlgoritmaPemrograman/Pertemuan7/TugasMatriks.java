package Pertemuan7;

import java.util.Scanner;

public class TugasMatriks {
    static int[][] bacaMatriks(Scanner sc, int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    static void tampilMatriks(int[][] a, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // A^T berukuran N x M : at[j][i] = a[i][j]
    static int[][] transpose(int[][] a, int m, int n) {
        int[][] at = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                at[j][i] = a[i][j];
            }
        }
        return at;
    }
    // Rotasi 90 derajat searah jarum jam, hasil N x M : r[j][m-1-i] = a[i][j]
    static int[][] rotasi90(int[][] a, int m, int n) {
        int[][] r = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                r[j][m - 1 - i] = a[i][j];
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris (M): ");
        int m = sc.nextInt();
        System.out.print("Masukkan jumlah kolom (N): ");
        int n = sc.nextInt();
        System.out.println("\n--- Input Elemen Matriks A ---");
        int[][] a = bacaMatriks(sc, m, n);
        System.out.println("\n--- Matriks Asal A (" + m + " x " + n + ") ---");
        tampilMatriks(a, m, n);
        int[][] at = transpose(a, m, n);
        System.out.println("\n--- Transpose A^T (" + n + " x " + m + ") ---");
        tampilMatriks(at, n, m);
        int[][] rot = rotasi90(a, m, n);
        System.out.println("\n--- Rotasi 90 Derajat Searah Jarum Jam (" + n + " x " + m + ") ---");
        tampilMatriks(rot, n, m);
        sc.close();
    }
}

