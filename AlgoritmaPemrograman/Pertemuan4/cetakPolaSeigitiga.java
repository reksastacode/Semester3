import java.util.Scanner;
public class cetakPolaSeigitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("\nMasukkan tinggi segitiga: ");
            int tinggi = input.nextInt();

            for (int i = 1; i <= tinggi; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
            System.out.print("Ulang program? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        
        System.out.println("Program selesai.");

        input.close();
    }
    
}
