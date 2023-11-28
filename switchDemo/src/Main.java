public class Main {

    public static void main(String[] args) {

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Dereceyle geçtiniz.");
                break;

            case 'B':
            case 'C':
                System.out.println("Ortalama geçtiniz");
                break;

            case 'D':
                System.out.println("Geçtiniz");
                break;

            case 'F':
                System.out.println("Kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
}