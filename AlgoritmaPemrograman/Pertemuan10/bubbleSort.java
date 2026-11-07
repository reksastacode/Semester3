package Pertemuan10;

public class bubbleSort {
    public static void bubbleSorting(int[] A) {
        int N = A.length;
        boolean swapped;

        for (int i = 0; i < N - 1; i++) {
            swapped = false;
            for (int j = 0; j < N - i - 1; j++) {      
                if (A[j] > A[j+1]) {                    
                    // Swap
                    int temp = A[j];
                    A[j] = A[j+1];                     
                    A[j+1] = temp;

                    swapped = true;                     
                }
            }
            if (!swapped) break;                        
        }
    }

    public static void main(String[] args) {
        int[] nilai = {64, 34, 25, 12, 22, 11, 90};
        bubbleSorting(nilai);

        System.out.println("Hasil pengurutan nilai:");
        for (int val : nilai) {
            System.out.print(val + " ");
        }
    }
}
