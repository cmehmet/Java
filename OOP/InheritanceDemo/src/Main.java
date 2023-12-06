public class Main {
    public static void main(String[] args) {
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.KrediHesapla();*/

        //Inheritance & Polymorphism
        KrediUI krediUI = new KrediUI();
        krediUI.KrediyiHesapla(new AskerKrediManager());
        krediUI.KrediyiHesapla(new OgretmenKrediManager());
        krediUI.KrediyiHesapla(new TarimKrediManager());
    }
}