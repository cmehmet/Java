public class Main {

    public static void main(String[] args) {

        //reference type

        //Bellekte stack ve heap bölümü var "new" ile nesne oluşturduğumuzda heapte o nesne tutulur.
        //Referansı da (adresi) stackte tutulur.
        CustomerManager customerManager = new CustomerManager();// CustomerManager türünde bir nesne oluşturduk
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        // Bu durumda customermanager ve customermanager2, 10.satırdaki nesneyi gösterir.
        // Yani referanslar (adresler) eşitlendi.
        // Ayrıca 9. satırda oluşturduğumuz nesne heapte bulunmakta ancak kullanılmamaktadır. Garbage Collector onu temizler.
        // Yine de new kullanmak maliyetli olduğundan böyle durumlara dikkat etmeliyiz.

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type

        int sayi1 = 10;     //Stack
        int sayi2 = 20;

        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // Diziler de referans tutucudur.
        int[] sayilar = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);


    }
}
