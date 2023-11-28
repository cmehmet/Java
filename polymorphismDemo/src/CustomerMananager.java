public class CustomerMananager {

    private BaseLogger logger;

    public CustomerMananager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("Loglama A kişisi tarafından yapıldı.");


        /* Kod ile ilgili yapılan düzenlemenin nasıl ve kim tarafından yaptıldığına dair
         o methoda bir de veritabanına loglama işlemi gerçekleştiren kısım eklenmesi istensin*/

        //DataBaseLogger logger = new DataBaseLogger();
        //logger.Log("Loglama A kişisi tarafından yapıldı");

        /*Eğer yukarıdaki bir çözüme gidip bir classı başka bir class içerisinde "new" lersek o zaman
        Databaselogger a körü körüne bağlı bir sistem olur ve başka bir zaman bizden, artık veritabanına değil de
        dosyaya loglanma yapılması istenebilir bu durumda kodda, ilgili her bölümü tekrar düzeltmemiz gerekir.*/

    }
}
