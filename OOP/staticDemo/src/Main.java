public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Bilgisayar");
        product.setPrice(10000);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        //inner class
//      DatabaseHelper.Crud.delete();
//      DatabaseHelper.Connection.createConnection();
    }
}