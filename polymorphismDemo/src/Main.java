public class Main {
    public static void main(String[] args) {
        /*
        BaseLogger[] loggers = new BaseLogger[]{new DataBaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers){
            logger.Log("Log işlemi gerçekleştirildi.");
        }
        */


        CustomerMananager manager = new CustomerMananager(new FileLogger());
        manager.add();


    }
}