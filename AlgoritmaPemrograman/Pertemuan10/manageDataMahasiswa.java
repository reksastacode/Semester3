package Pertemuan10;
import java.util.Locale;

public class manageDataMahasiswa {

    static class Mahasiswa {
        int nim;
        String nama;
        double ipk;

        Mahasiswa(int nim, String nama, double ipk) {
            this.nim = nim;
            this.nama = nama;
            this.ipk = ipk;
        }
    }

    static boolean harusSetelah(Mahasiswa a, Mahasiswa b) {
        int cmp = Double.compare(a.ipk, b.ipk);
        if (cmp != 0) return cmp < 0;
        return a.nim > b.nim;
    }

    static void insertionSort(Mahasiswa[] A) {
        for (int i = 1; i < A.length; i++) {
            Mahasiswa key = A[i];
            int j = i - 1;
            while (j >= 0 && harusSetelah(A[j], key)) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    static void cetakTabel(String judul, Mahasiswa[] A) {
        String garis = "+-----+-----+------------+------+";
        System.out.println(judul);
        System.out.println(garis);
        System.out.println("| No  | NIM | Nama       | IPK  |");
        System.out.println(garis);
        for (int i = 0; i < A.length; i++) {
            System.out.println(String.format(Locale.US, "| %-3d | %-3d | %-10s | %.2f |",
                    i + 1, A[i].nim, A[i].nama, A[i].ipk));
        }
        System.out.println(garis);
        System.out.println();
    }
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa(102, "Budi", 3.50),
            new Mahasiswa(101, "Siti", 3.85),
            new Mahasiswa(104, "Andi", 3.50),
            new Mahasiswa(103, "Dewi", 3.90),
            new Mahasiswa(105, "Eko",  3.50)
        };
        cetakTabel("DATA SEBELUM DIURUTKAN", data);
        insertionSort(data);
        cetakTabel("DATA SETELAH DIURUTKAN (IPK Desc, NIM Asc)", data);
    }
}
