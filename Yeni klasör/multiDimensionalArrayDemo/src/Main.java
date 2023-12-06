public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Adana";
        cities[0][1] = "Antalya";
        cities[0][2] = "Mersin";
        cities[1][0] = "İzmir";
        cities[1][1] = "Aydın";
        cities[1][2] = "Manisa";
        cities[2][0] = "Mardin";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";

        //Nested Loop - İçiçe Döngü

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cities[i][j] + " ");
            }
            System.out.println();
        }
    }
}