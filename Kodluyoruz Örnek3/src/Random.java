public class Random {

    public static void main(String[] args) {
        ortalamaAl();
    }

    public static void ortalamaAl() {

        int randomNumber;
        double toplam=0;
        java.util.Random random= new java.util.Random();

        for (int i = 0; i< 100; i++){
            randomNumber = random.nextInt(100);
            toplam=toplam+randomNumber;
            System.out.println(randomNumber );
        }
        System.out.println("Rastgele oluşturulan 100 sayının toplamı:" +toplam);
        System.out.println("Rastegele oluşturulan sayıların ortalaması:" + (toplam/100));
    }
}
