public class Main {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 40;
        int sayi3 = 15;
        int enBuyuk = sayi1;

        if(enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3){
            enBuyuk= sayi3;
        }

        System.out.println("En büyük sayi = " + enBuyuk);

        /*
        int sayi1 = 17;
        int sayi2 = 108;
        int sayi3 = 7;

        if (sayi1 >= sayi2 && sayi1 >= sayi3){
            System.out.println("En büyük sayi = " + sayi1);
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            System.out.println("En büyük sayi = " + sayi2);
        }
        else{
            System.out.println("En büyük sayi = " + sayi3);
        }
        */
    }
}