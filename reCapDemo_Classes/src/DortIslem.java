public class DortIslem {
    public int Topla(int number1, int number2){
        return number1 + number2;
    }
    public int Cikar(int number1,int number2){
        return number1 - number2;
    }

    public int Carp(int number1,int number2){
        return number1 * number2;
    }
    public double Bol(double number1, double number2){
        if (number2 == 0){
            System.out.println("Hatalı sayı girdiniz.");
            return -1;
        }
        return number1 / number2;
    }
}
