public class Main {

    public static void main(String[] args) {
        //type safe
        //Java "type safe" bir dildir.
        int sayi = 12;
        sayi=13;
        double sayi2 = 17.932;

        char karakter = 'A';
        //Aslında "char" veri tipi de arka planda sayısal bir değer tutar.
        //ascii
        char karakter2 = 65;

        boolean dogruMu = true;
        //Aslında "boolean" veri tipi de arkaplanda sayısal bir veri tutar. 0 veya 1.

        System.out.println(karakter + "\n" + karakter2 );
    }
}