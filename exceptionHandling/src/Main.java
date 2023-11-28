public class Main {

    public static void main(String[] args) {

        try{
            int [] sayilar = new int[]{1,2,3,4};
            System.out.println(sayilar[4]);
        }catch (Exception exception){
            System.out.println("Hata yakalandı.");
            System.out.println(exception);
        }finally {
            System.out.println("Ben 'finally' her türlü çalışırım.");
            //Bu kısım veritabanı bağlantısını veya açılan bir dosyayı kapatmak ve bellekten temizlenmesini sağlamak için kullanılabilir.
        }

        System.out.println("---------------------------------------------------");

        try{
            String sehir = "Ankara";
            System.out.println(sehir.charAt(10));
        }catch (Exception exception){
            System.out.println("Hata yakalandı.");
            System.out.println(exception);
        }finally {
            System.out.println("Ben 'finally' her türlü çalışırım.");
        }

        System.out.println("---------------------------------------------------");

        try{
            int [] sayilar = new int[]{1,2,3,4};
            System.out.println(sayilar[4]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("Hata yakalandı");
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata yakalandı");
            System.out.println(exception);
        }catch (Exception exception) {
            System.out.println("Hata loglandı : " + exception);
        }finally {
            System.out.println("Ben 'finally' her türlü çalışırım.");

        }
    }
}