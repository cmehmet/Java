public class Main {

    public static void main(String[] args) {
        selamVer();
        System.out.println(topla(12,8));
        System.out.println(topla2(5,3,2,1,52,65,34,23,54));
    }

    public static void selamVer(){
        System.out.println("Merhaba");
    }

    public static int topla(int number1, int number2){
        return number1 + number2;
    }

    //Variable Arguments
    public static int topla2 (int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}