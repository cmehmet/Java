public class Main {

    public static void main(String[] args) {

        int number = 28;
        System.out.println(number/2);
        int toplam=0;
        //boolean isPerfect = false;

        for (int i = 1; i <= (number / 2); i++){
            if (number % i == 0){
                toplam += i;
            }
        }
        if (toplam == number){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.println("Mükemmel Sayı Değil");
        }


    }
}