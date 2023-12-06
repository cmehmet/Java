public class Main {
    public static void main(String[] args) {

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();

        //GameCalculator gameCalculator = new GameCalculator();

        // abstract classlar objesi oluşturulamaz. Yani "new"lenemez.
        // Dolayısıyla base class'ı gizlemek için kullanılabilir.

    }
}