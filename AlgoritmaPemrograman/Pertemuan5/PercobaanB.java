import java.util.Scanner;

public class PercobaanB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Masukkan nilai n2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Masukkan nilai n3: ");
        double n3 = scanner.nextDouble();
        System.out.print("Masukkan nilai n4: ");
        double n4 = scanner.nextDouble();
        System.out.print("Masukkan nilai n5: ");
        double n5 = scanner.nextDouble();

        double total = n1 + n2 + n3 + n4 + n5;
        double rataRata = total / 5;

        System.out.println("Nilai di atas rata-rata:");
        if (n1 > rataRata) System.out.println(n1);
        if (n2 > rataRata) System.out.println(n2);
        if (n3 > rataRata) System.out.println(n3);
        if (n4 > rataRata) System.out.println(n4);
        if (n5 > rataRata) System.out.println(n5);
        scanner.close();
    }
}