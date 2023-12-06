public class Main {
    public static void main(String[] args) {
        /*
        BaseLogger[] loggers = new BaseLogger[]{new DataBaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers){
            logger.log("Log işlemi gerçekleştirildi.");
        }
        */


//      CustomerMananager manager = new CustomerMananager(new FileLogger());
//      manager.add();

//      CustomerMananager manager = new CustomerMananager(new DataBaseLogger());
//      manager.add();

//      CustomerMananager manager = new CustomerMananager(new EmailLogger());
//      manager.add();

        CustomerMananager manager = new CustomerMananager(new ConsoleLogger());
        manager.add();


    }
}