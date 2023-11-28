public class MySqlCustomerDal implements ICustomerDal,IRepostory{
    @Override
    public void Add() {
        System.out.println("Veriler eklendi : MySql");
    }
}
