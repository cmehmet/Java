public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal = new CustomerDal();
        Customer customer = new Customer();
        Validator validator = new Validator();
        validator.validate(customer);
    }
}