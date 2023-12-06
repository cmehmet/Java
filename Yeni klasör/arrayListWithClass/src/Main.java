import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Mehmet","Atay"));
        customers.add(new Customer(2,"Ferhat","Atay"));
        customers.add(new Customer(3,"Emrah","Atay"));
        customers.add(new Customer(4,"Cengiz","Atay"));

        Customer Semsettin = new Customer(5,"Şemsettin", "Atay");
        customers.add(Semsettin);

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }

        customers.remove(Semsettin);
        System.out.println();

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }



    }
}