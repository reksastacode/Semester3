import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        double totalBelanja = 0;

        while (i <= 10) {
            System.out.print("Masukkan nilai transaksi ke-" + i + " : ");
            double inputNilai = input.nextDouble();

            if (inputNilai == 0) {
                System.out.println("Transaksi dihentikan");
                break;
            }
            if (inputNilai < 0) {
                System.out.println("Transaksi tidak valid (negatif), Dilewati");
                i++;
                continue;
            }
            totalBelanja += inputNilai;
            i++;
        }
        System.out.printf("Total belanjaan: %.2f", totalBelanja);
        input.close();
    }
}