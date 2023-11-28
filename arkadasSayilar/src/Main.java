public class Main {

    public static void main(String[] args) {
        int number1 = 1184;
        //int number2 = 284;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 1; i <= number1 / 2; i++){
            if (number1 % i == 0){
                counter1 += i;
            }
        }
        for (int i = 1; i <= counter1 / 2; i++ ){
            if (counter1 % i == 0){
                counter2 += i;
            }
        }

        if (counter2 == number1){
            System.out.println(number1 + " ve " + counter1 + " sayıları arkadaş sayılardır.");
        }else{
            System.out.println(number1 + " ve " + counter1 + " sayıları arkadaş sayılar değildir.");
        }



    }
}