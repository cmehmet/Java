import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add(7);
        //Biz string tutmak istiyoruz ancak integer bir değer de eklenebiliyor.

        ArrayList<String> sehirler2 = new ArrayList<String>();
        sehirler2.add("Ankara");
        sehirler2.add("İstanbul");
        //sehirler2.add(7); // Kabul etmiyor

        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(9);
        sayilar.add(17);
        //sayilar.add("Ankara"); // Kabul etmiyor.

        // "Generic"ler farklı veri tipleriyle çalışmamız gereken durumlarda kullanılır. ArrayList sınıfı generic bir sınıftır.
        // Aynı zamanda "generic"ler tip güvenliğini de sağlamaktadır.


        // Eğer Arraylist classı olmasaydı ve sadece diziler olsaydı o zaman kendi generic classımızı yazmak zorunda kalırdık.
        MyList<String> sehirler3 = new MyList<String>();
        sehirler3.add("Adana");
        sehirler3.add("Antalya");
        sehirler3.add("Hatay");


        Customer customer = new Customer();
        MyList<Customer> customers = new MyList<>();
        customers.add(customer);



    }
}