public class linearSearchToko {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = { 45000, 12000, 8900, 33000, 2700 };
        int cari = 33000;

        int hasil = linearSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data " + cari + " ditemukan pada indeks " + hasil);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }
}