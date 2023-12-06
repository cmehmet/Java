public class BaseKrediManager {
    public double krediHesapla(double number){
        return number * 1.18;
    }

    // Eğer kredi hesapla metodunun hiç bir şekilde override edilememesini istiyorsak "final" anahtar kelimesini kullanabiliriz.
    /*
    public final double krediHesapla(double number){
        return number * 1.18;
    }
    */
}
