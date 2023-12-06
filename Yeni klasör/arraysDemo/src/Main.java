public class Main {

    public static void main(String[] args) {

        String ogrenci1 = "Mehmet";
        String ogrenci2 = "Cabbar";
        String ogrenci3 = "Ali";
        String ogrenci4 = "Kamil";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        String[] students = new String[4];
        students[0] = "Mehmet";
        students[1] = "Cabbar";
        students[2] = "Ali";
        students[3] = "Kamil";

        for(int i = 0;i < students.length;i++){
            System.out.println(students[i]);
        }


        /*
        String[] students = {"Mehmet","Cabbar","Ali","Kamil"};
        for( var student : students){
            System.out.println(student);
        }
        */
    }
}