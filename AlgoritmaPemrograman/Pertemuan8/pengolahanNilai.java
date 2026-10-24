package Pertemuan8;
import java.util.Scanner;
public class pengolahanNilai {

    public static double hitungRataRata(int[] nilai) {
        int sum = 0;
        for (int n : nilai) {
            sum += n;
        }
        return (double) sum / nilai.length;
    }
    public static int cariMaksimum(int[] nilai) {
        int max = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 55) return "C";
        else if (nilai >= 40) return "D";
        else return "E";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = scanner.nextInt();

        int[] dataNilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            dataNilai[i] = scanner.nextInt();
        }
        double rataRata = hitungRataRata(dataNilai);

        int maxNilai = cariMaksimum(dataNilai);

        System.out.println("\n========= REKAPITULASI NILAI =========");
        System.out.printf("Rata-rata Kelas : %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi : " + maxNilai);
        System.out.println("Predikat Kelas  : " + konversiHuruf(rataRata));
        scanner.close();
    }
}
