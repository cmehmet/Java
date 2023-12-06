public class Main {

    public static void main(String[] args) {
        //For
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        //Tek Sayilar
        for(int i = 1; i < 10; i+=2){
            System.out.println(i);
        }
        System.out.println("Tekli döngü bitti.");

        //Çift Sayılar
        for(int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
        System.out.println("Çiftli döngü bitti.");

        //While
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti.");

        int a = 0;
        // do-while
        do{
            System.out.println(a);
            a++;
        }while(a > 10);
        System.out.println("do-while döngüsü bitti.");
        //do-while döngüsün while döngüsünden farkı sart sağlanmazsa bile bir defa çalışır.
    }
}