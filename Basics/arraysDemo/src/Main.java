public class Main {

    public static void main(String[] args) {

        String student1 = "Mehmet";
        String student2 = "Cabbar";
        String student3 = "Ali";
        String student4 = "Kamil";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("-----------------------------------");

        String[] students = new String[4];
        students[0] = "Mehmet";
        students[1] = "Cabbar";
        students[2] = "Ali";
        students[3] = "Kamil";

        for(int i = 0;i < students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------------");

        String[] students2 = {"Mehmet","Cabbar","Ali","Kamil"};
        for(String student : students2){
            System.out.println(student);
        }

    }
}