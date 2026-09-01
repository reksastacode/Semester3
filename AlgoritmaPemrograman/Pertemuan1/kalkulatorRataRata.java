package Pertemuan1;
import java.util.Scanner;
public class kalkulatorRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rataRata, jumlah;
        int bilangan1, bilangan2;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();

        jumlah = bilangan1 + bilangan2;
        rataRata = jumlah / 2;
        
        System.out.println("Hasil: " + rataRata);
        input.close();
    }
}