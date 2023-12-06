import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*int[] sayilar = new int[]{1,2,3};
        System.out.println(sayilar[4]); // ArrayIndexOutOfBounds
        sayilar = new int[4];           // Yeni referans, eski verilere erişilemez. Diziler dinamik değil.
        System.out.println(sayilar[0]);*/

        ArrayList sayilar = new ArrayList();
        System.out.println("Boyut : " + sayilar.size());

        sayilar.add(7);
        sayilar.add(25);
        sayilar.add("Ankara");
        System.out.println("Boyut : " + sayilar.size());

        sayilar.set(1, 50);
        System.out.println("İlk eleman : " + sayilar.get(1));

        sayilar.remove(1);
        System.out.println("İlk eleman : " + sayilar.get(1));

        sayilar.clear();
        System.out.println("Boyut : " + sayilar.size());

        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(97);
        arrayList.add("Adana");

        int i = 1;
        for ( Object eleman : arrayList){   // Bu arraylist tip güvenli değil.
            System.out.println(i + ". eleman : " + eleman);
            i += 1;
        }


    }
}