public class Main {

    public static void main(String[] args) {


        //The First Algorithm
        /*
        int number = 2;

        if (number < 0){
            System.out.println("Negatif Sayı, Asal Değil");
        } else if (number == 0 || number == 1) {
            System.out.println("Asal Değil");
        } else if (number == 2 || number == 3) {
            System.out.println("Asal");
        } else{
            for (int i = 2; i <= Math.floor(Math.sqrt(number));i++){
                if (number % i == 0){
                    System.out.println("Asal değil.");
                    break;
                }
                else if (i == Math.floor(Math.sqrt(number))){
                    System.out.println("Asal");
                }

            }
        }

        System.out.println("Döngü bitti");
        */


        //The Second Algorithm
        /*
        int number = 2;
        boolean isPrime = true;

        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (number < 2){
            isPrime = false;
        }

        if (isPrime == true){
            System.out.println("Asal");
        }
        else{
            System.out.println("Asal Değil.");
        }
*/
        // The Third Algorithm (return)
        int number = 4;
        boolean isPrime = true;

        if (number == 0 || number == 1){
            System.out.println("Asal Değil");
            return; // İçinde bulunduğu metodun çalışmasını sonlandırır.-->Main metodu
        }
        else if (number < 0) {
            System.out.println("Negatif Sayı,Asal Değil");
            return;
        }

        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++){
                if (number % i == 0){
                    isPrime = false;
                }
        }

        if (isPrime == true){
            System.out.println("Asal");
        }else {
            System.out.println("Asal Değil");
        }


    }
}