package Pertemuan10;

public class selectionSort {
    public static void selectionSortDescending(int[] A) {
        int N = A.length;

        for (int i = 0; i < N - 1; i++) {
            int max_idx = i;                            
            for (int j = i + 1; j < N; j++) {
                if (A[j] > A[max_idx]) {                
                    max_idx = j;                        
                }
            }
            if (max_idx != i) {
                int temp = A[i];
                A[i] = A[max_idx];                      
                A[max_idx] = temp;                      
            }
        }
    }

    public static void main(String[] args) {
        int[] tinggi = {170, 185, 168, 192, 178, 180};
        selectionSortDescending(tinggi);

        System.out.println("Tinggi badan (Descending):");
        for (int val : tinggi) {
            System.out.print(val + " cm ");
        }
    }
}
