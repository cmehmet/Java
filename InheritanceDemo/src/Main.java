public class Main {
    public static void main(String[] args) {
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.KrediHesapla();*/

        KrediUI krediUI = new KrediUI();
        krediUI.KrediyiHesapla(new AskerKrediManager());
    }
}