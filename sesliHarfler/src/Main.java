public class Main {

    public static void main(String[] args) {
        /*
        String text = "aıoueiöüAIOUEİÖÜ";
        char text2 = 'b';
        boolean isInclude = false;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == text2){
                isInclude = true;
            }

        }
        if (isInclude == true){
            System.out.println("İçerir");
        }
        else{
            System.out.println("İçermez");
        }
        */

        char[] kalınSesli = {'a','ı','o','u','A','I','O','U'};
        char[] inceSesli = {'e','i','ö','ü','E','İ','Ö','Ü'};

        char harf = 'e';
        boolean kalınMı = false;
        boolean inceMi = false;

        for (int i = 0; i < kalınSesli.length; i++){
            if (harf == kalınSesli[i]){
                kalınMı = true;
            }
            if (harf == inceSesli[i]){
                inceMi = true;
            }
        }

        if (kalınMı == true){
            System.out.println("Kalın Sesli");
            return;
        }

        if (inceMi == true) {
            System.out.println("İnce Sesli");
            return;
        }

        System.out.println("KalınSesli veya İnceSesli değil.");





    }
}