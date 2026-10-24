package Pertemuan8;
import java.util.Scanner;
public class konversiSuhu {
    public static void tampilkanMenu() {
        System.out.println("=========================================");
        System.out.println("      SISTEM KONVERSI SUHU MODULAR       ");
        System.out.println("=========================================");
        System.out.println("\nPilih Jenis Konversi:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.println("Pilihan Anda (1-3): ");
        System.out.println("=========================================");
    }

    public static double celciusToFahrenheit(double c) {
        return (9.0 / 5.0) * c + 32;
    }

    public static double celciusToKelvin(double c) {
        return c + 273.15;
    }

    public static double celciusToReamur(double c) {
        return (4.0 / 5.0) * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu Celcius: ");
        double celsius = scanner.nextDouble();

        tampilkanMenu();
        int pilihan = scanner.nextInt();
        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = celciusToFahrenheit(celsius);
                break;
            case 2:
                hasil = celciusToKelvin(celsius);
                break;
            case 3:
                hasil = celciusToReamur(celsius);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (pilihan >= 1 && pilihan <= 3) {
            System.out.printf("Hasil Konversi: %.2f\n", hasil);
        }
        scanner.close();
    }
}