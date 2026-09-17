package Pertemuan3;

import java.util.Scanner;
public class tokoOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total belanja: ");
        double total_belanja = input.nextDouble();

        double diskon = 0;
        if (total_belanja >= 100000) {
            diskon = total_belanja * 0.10;
        }

        total_belanja = total_belanja - diskon;
        System.out.println("Total belanja: " + total_belanja);
        input.close();
    }
}
