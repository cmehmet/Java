public class ProductManager {

    public void add(Product product){
        if (ProductValidator.isValid(product) == true){
            System.out.println("Ürün veritabanına eklenebilir.");
        }else{
            System.out.println("Ürün veritabanına eklenemez.");
        }
    }
}
