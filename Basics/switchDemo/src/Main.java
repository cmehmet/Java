public class Main {

    public static void main(String[] args) {

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Çok İyi : geçtiniz.");
                break;

            case 'B':
                System.out.println("İyi : Geçtiniz.");
                break;

            case 'C':
            case 'D':
                System.out.println("Orta : Geçtiniz");
                break;

            case 'F':
                System.out.println("Kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
}