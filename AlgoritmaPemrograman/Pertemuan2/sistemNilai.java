package Pertemuan2;

import java.util.Scanner;

public class sistemNilai {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        int nilai;
        String status;

        System.out.println("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 75) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }
        System.out.println("Nilai: " + nilai + " Status: " + status);

        input.close();
    
}

}