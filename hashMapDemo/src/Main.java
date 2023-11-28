import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("ball", "top");
        sozluk.put("game", "oyun");
        sozluk.put("good", "iyi");
        System.out.println("Boyut : " + sozluk.size());

        for (String item : sozluk.keySet()){
            System.out.println("Anahtar : " + item + " Değer : " + sozluk.get(item));
        }

        sozluk.remove("ball");

        System.out.println("-------------------------");

        for (String item : sozluk.keySet()){
            System.out.println("Anahtar : " + item + " Değer : " + sozluk.get(item));
        }


        sozluk.clear();
        System.out.println("Boyut : " + sozluk.size());



    }
}