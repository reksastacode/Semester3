package Pertemuan3;
import java.util.Scanner;

public class menuATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Cek Saldo\n2. Tarik Tunai\n3. Transfer\nPilih (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Layanan: Cek Saldo");
                break;
            case 2:
                System.out.println("Layanan: Tarik Tunai");
                break;
            case 3:
                System.out.println("Layanan: Transfer");
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                break;
        }
        input.close();
    }
}