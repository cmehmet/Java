public class Main {

    public static void main(String[] args) {

        int number = 28;
        int total=0;

        for (int i = 1; i <= (number / 2); i++){
            if (number % i == 0){
                total += i;
            }
        }
        if (total == number){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.println("Mükemmel Sayı Değil");
        }


    }
}