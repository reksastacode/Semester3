import java.util.Scanner;

public class SegitigaAngkaAsteris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai N : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
