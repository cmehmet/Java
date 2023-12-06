public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customer.setFirstName("Ahmet");
        customer.setLastName("Yılmaz");
        customer.setAge(13);
        employee.setFirstName("Ahmet");
        employee.setLastName("Yılmaz");
        employee.setAge(13);

        customer.setEmail("123@gmail.com");
        employee.setSalary(15000);

        employeeManager.Add();
        employeeManager.List();
        customerManager.Add();
        customerManager.List();

        employeeManager.BestEmployeeOfMonth();
    }
}