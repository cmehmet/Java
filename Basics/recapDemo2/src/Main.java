public class Main {

    public static void main(String[] args) {
        double[] myList = {1.3, 6.8, 15.37, 3.14};

        for (double element : myList) {
            System.out.println(element);
        }

        double sum = 0;
        for (double element : myList) {
            sum += element;
        }
        System.out.println("Toplam = " + sum);

        System.out.println("-----------------------");

        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
            System.out.println("Maximum = " + max);
        }
        System.out.println("Maximum = " + max);

        System.out.println("-----------------------");

        double max2 = myList[0];

        for (double element : myList) {
            if (max2 < element) {
                max2 = element;
            }
        }
        System.out.println("Maximum = " + max);


    }
}