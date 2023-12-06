public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("KronometreThread nesnesi oluşturuluyor");
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor.");

        try
        {
            for (int i = 1; i<= 10;i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread kesildi : " + threadName);
        }

        System.out.println("Thread bitti." + threadName);
    }

    public void start(){
        System.out.println("Thread nesnesi oluşturuluyor.");
        if (thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}
