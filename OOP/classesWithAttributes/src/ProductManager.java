public class ProductManager {
    public void Add( Product product){
        //JDBC
        System.out.println("Ürün eklendi." + product.getName());
    }

    public void Add2(int Id, String name, String description, int stockAmount, double price, String renk){
        // Bu kullanım çok yanlış çünkü mesela birçok yerde bu metodu kullandık.
        // Daha sonra bu metoda bir de "renk" gibi bir parametre eklemek zorunda kalalım.
        // Bu durumda main kısmında bu metodu kullandığımız bütün yerlere tek tek bu parametreyi de eklemek zorunda kalırız.
    }
}
