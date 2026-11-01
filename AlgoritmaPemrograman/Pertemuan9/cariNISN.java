public class cariNISN {
    public static int binarySearchRekursif(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; 
        }
        
        int mid = low + (high - low) / 2;
        
        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] > target) {
            return binarySearchRekursif(arr, low, mid - 1, target); 
        } else {
            return binarySearchRekursif(arr, mid + 1, high, target); 
        }
    }

    public static void main(String[] args) {
        int[] nisn = {1001, 1004, 1008, 1012, 1015, 1020};
        
        int cariAda = 1012;
        int hasilAda = binarySearchRekursif(nisn, 0, nisn.length - 1, cariAda);
        System.out.println("NISN " + cariAda + " berada pada posisi indeks: " + hasilAda);

        int cariTidakAda = 9999;
        int hasilTidakAda = binarySearchRekursif(nisn, 0, nisn.length - 1, cariTidakAda);
        System.out.println("NISN " + cariTidakAda + " berada pada posisi indeks: " + hasilTidakAda);
    }
}