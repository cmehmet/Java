public class Product {

    // S ----> Single Responsibility (ürünün özellikleri ve ürün ile ilgili operasyonlar farklı classlarda olmalıdır)
    // O
    // L
    // I
    // D

    // NOT: Bir class sadece bir işi yapmalı, bir metod sadece bir işi yapmalı, bir kod bloğu sadece bir işi yapmalı.

    // Attribute || Field
    private int id;
    private String name;
    private String description;
    private int stockAmount;
    private double price;
    private String renk;

    private  String kod; // read only


    public Product(){
    }
    public Product(int id,String name,String description, int stockAmount, double price, String renk){
        System.out.println("Yapıcı çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockAmount = stockAmount;
        this.price = price;
        this.renk = renk;

    }



    //getter & setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id; // this
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + this.id;
    }

}
