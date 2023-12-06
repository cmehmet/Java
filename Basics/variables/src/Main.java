public class Main {

    public static void main(String[] args) {
        //case sensitive
        //camel casing
        //reusability
        int ogrenciSayisi = 11;
        String mesaj = "Öğrenci sayısı : ";
        System.out.println("Öğrenci sayım : 10" );
        System.out.println("Öğrenci sayım : 10");
        System.out.println("Öğrenci sayım : 10");
        //Yukarıdaki gibi hepsini tek tek yazarsak, değişiklik yapacağımız zaman bu değişikliği hepsine tek tek yapmamız gerekir.Reusability açısından olumsuz.
        //Bu yüzden değişkenleri "variables" kullanırız.
        //Ayrıca yukarıdaki her print işlemi için bellekte farklı bir değişken tahsis edilir.Yani bu durum bellek kullanımı açısından kötüdür.
        //Değişkenler "variables" sayesinde aynı değer için bellekte 3 yerine sadece 1 yer tahsis ettik.Bellek tasarrufu.
        //Günümüzde yukarıdaki örnek için çok fark oluşturmasa da (belleğimiz eskiye göre daha fazla) temel mantık açısından önemli.
        System.out.println("Öğrenci sayım : " + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);

    }
}