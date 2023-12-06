public class DatabaseHelper { // Javada bir class static tanımlanamaz. Ancak inner classlarlar static tanımlanabilir.
    public static class Crud{ // Create,Read,Update,Delete
        public static void update(){

        }
        public static void delete() {

        }
    }

    public static class Connection {
        public static void createConnection(){

        }
    }

    // inner class
    // Belki ukarıdaki gibi bir gruplama yapmak adına kullanılabilir
    // Ancak SOLID'in S harfine göre (Single Responsibility), kullanımı pek önerilmez
}
