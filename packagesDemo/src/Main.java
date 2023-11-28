import java.util.Scanner; // built-in

//import matematik.DortIslem;
//import matematik.KokluIslemler;
import matematik.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminiz : ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        System.out.println("Sonuç : " + dortIslem.topla(5, 8));

        KokluIslemler kokluIslemler = new KokluIslemler();
        System.out.println("Sonuç : " + kokluIslemler.kokHesapla(25));
    }
}