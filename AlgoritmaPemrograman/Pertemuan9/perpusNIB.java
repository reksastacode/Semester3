public class perpusNIB {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nib = {101, 105, 120, 135, 150, 175};
        
        int cariAda = 135;
        int hasilAda = binarySearch(nib, cariAda);
        System.out.println("Posisi NIB " + cariAda + ": Indeks " + hasilAda);

        int cariTidakAda = 200;
        int hasilTidakAda = binarySearch(nib, cariTidakAda);
        System.out.println("Posisi NIB " + cariTidakAda + ": Indeks " + hasilTidakAda);
    }
}