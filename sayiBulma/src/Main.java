public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,9,3,45,242,43,76,-5};
        int seekingNumber = 7;
        boolean isInclude = false;

        for (int number : numbers){
            if (seekingNumber == number){
                isInclude = true;
            }
        }
        if (isInclude == true){
            System.out.println("İçerir");
        }else{
            System.out.println("İçermez");
        }


    }
}