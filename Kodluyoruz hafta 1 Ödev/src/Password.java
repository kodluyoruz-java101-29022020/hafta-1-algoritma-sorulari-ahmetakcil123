import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        String password ="ahmetakcil";
        Scanner scanner = new Scanner(System.in);

            while (1==1) {
                System.out.print("Lütfen şifre giriniz: ");
                String sifre = scanner.nextLine();

                if (sifre.equals(password)) {
                    System.out.println("Giriş başarılı...");
                    break;
                }
                else {
                    System.out.println("Giriş başarısız..");
                }
            }
    }
}


