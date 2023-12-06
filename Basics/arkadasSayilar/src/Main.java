public class Main {

    public static void main(String[] args) {

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i <= number1 / 2; i++) {
            if (number1 % i == 0){
                total1 += i;
            }
        }

        for (int i = 1; i <= number2 / 2; i++){
            if (number2 % i == 0){
                total2 += i;
            }
        }

        if (total1 == number2 && total2 ==number1){
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayılardır.");
        }else {
            System.out.println(number1 + " ve " + total1 + " sayıları arkadaş sayılar değildir.");
        }


        System.out.println("---------------------------------");

        /*
        int number1 = 1184;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i <= number1 / 2; i++){
            if (number1 % i == 0){
                total1 += i;
            }
        }
        for (int i = 1; i <= total1 / 2; i++ ){
            if (total1 % i == 0){
                total2 += i;
            }
        }

        if (total2 == number1){
            System.out.println(number1 + " ve " + total1 + " sayıları arkadaş sayılardır.");
        }else{
            System.out.println(number1 + " ve " + total1 + " sayıları arkadaş sayılar değildir.");
        }
        */


    }
}