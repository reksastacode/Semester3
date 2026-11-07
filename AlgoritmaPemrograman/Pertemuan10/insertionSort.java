package Pertemuan10;

public class insertionSort {
    public static void insertionSorting(int[] A) {
        int N = A.length;

        for (int i = 1; i < N; i++) {
            int key = A[i];                             
            int j = i - 1;

            while (j >= 0 && A[j] > key) {              
                A[j + 1] = A[j];                        
                j = j - 1;                              
            }
            A[j + 1] = key;                             
        }
    }

    public static void main(String[] args) {
        int[] idPelanggan = {105, 102, 109, 101, 104, 103};
        insertionSorting(idPelanggan);

        System.out.println("ID Pelanggan Terurut:");
        for (int val : idPelanggan) {
            System.out.print("ID-" + val + " ");
        }
    }
}
