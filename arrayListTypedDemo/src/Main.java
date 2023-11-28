import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Bursa");
        sehirler.add("Adana");

        sehirler.remove("Bursa");

        for ( String sehir : sehirler){
            System.out.println(sehir);
        }

        sehirler.add("Balıkesir");

        Collections.sort(sehirler);
        System.out.println("Sıralı Liste");
        for ( String sehir : sehirler){
            System.out.println(sehir);
        }

    }
}