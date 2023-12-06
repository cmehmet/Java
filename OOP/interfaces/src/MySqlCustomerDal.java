public class MySqlCustomerDal implements ICustomerDal,IRepostory{ // Bir class, birden fazla interface implemente edebilir.
    @Override
    public void Add() {
        System.out.println("Veriler eklendi : MySql");
    }
}
