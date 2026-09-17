import java.util.Scanner;

class verifLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username_valid = "admin";
        String password_valid = "12345";

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        if (inputUsername.equals(username_valid)) {
            if (inputPassword.equals(password_valid)) {
                System.out.println("Selamat datang");
            } else {
                System.out.println("Password salah!");
            }
        } else {
            System.out.println("Username tidak ditemukan!");
        }
        input.close();
    }
}