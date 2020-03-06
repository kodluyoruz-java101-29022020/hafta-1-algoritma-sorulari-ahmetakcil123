import java.util.Random;
public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int randomNumber;
        int[] sayi= new int[100];
        Random random =new Random();


        for(int i=0; i<100; i++){
           randomNumber= random.nextInt(100);
           sayi[i] = randomNumber;
        }

        System.out.println("Çift sayılar");
        for (int i= 0 ; i<100;i++) {
            if(sayi[i] % 2 == 0){
                System.out.print(sayi[i] + "-");
            }
        }
        System.out.println();
        System.out.println("****************************************************");
        System.out.println("Tek sayılar");
        for(int i= 0; i<100; i++) {
            if (sayi[i] % 2 == 1){
                System.out.print(sayi[i] + "-");
            }
            }

        }

    }


