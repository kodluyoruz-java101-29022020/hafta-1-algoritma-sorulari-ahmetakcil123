import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler =   "1.)Toplama\n "
                         +  "2.)Çıkarma\n"
                         +  "3.)Bölme\n"
                         +  "4.)Çarpma\n"
                         +  "Çıkmak için q ya basınız";

        while(true) {
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");


        System.out.print("İşlem seçiniz:");
        String secim = scanner.nextLine();

       if(secim.equals("q")){
            System.out.println("Çıkış yapıldı....");
            break;
        }
        else if(secim.equals("1")){
            System.out.print("1.sayıyı giriniz:");
            int a= scanner.nextInt();
            System.out.print("2.sayıyı giriniz:");
            int b= scanner.nextInt();
            System.out.println("Toplamı işlemi sonucunuz: " + (a+b));
            scanner.nextLine();
        }
        else if(secim.equals("2")){
            System.out.print("1.sayıyı giriniz:");
            int a= scanner.nextInt();
            System.out.print("2.sayıyı giriniz:");
            int b= scanner.nextInt();
            System.out.println("Çıkarma işlemi sonucunuz: " + (a-b));
            scanner.nextLine();
        }
        else if(secim.equals("3")){
            System.out.print("1.sayıyı giriniz:");
            double a= scanner.nextDouble();
            System.out.print("2.sayıyı giriniz:");
            double b= scanner.nextDouble();
            System.out.println("Bölme işlemi sonucunuz: " + (a/b));
            scanner.nextLine();
        }
        else if(secim.equals("4")){
            System.out.print("1.sayıyı giriniz:");
            int a= scanner.nextInt();
            System.out.print("2.sayıyı giriniz:");
            int b= scanner.nextInt();
            System.out.println("Çaprma işlemi sonucunuz: " + (a*b));
            scanner.nextLine();
        }
        else{
            System.out.println("Geçersiz işlem seçimi yapıldı...");

        }
    }
    }
    }

