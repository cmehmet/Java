public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println(manager.getBalance());

        manager.deposit(100);
        System.out.println("Hesap : " + manager.getBalance());

        try{
            manager.withdraw(90);
            System.out.println("Hesap : " + manager.getBalance());
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        try{
            manager.withdraw(20);
            System.out.println("Hesap : " + manager.getBalance());
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }


    }
}