public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Msi RTX 4090 Laptop",7,99000,"Gri");


        // Aşağıdaki bloktaki gibi tek tek setlemek yerine constructor kullanarak, "new" leme esnasında direkt olarak yapabiliriz.
        // Her iki şekilde de kullanmak istersek constructor ı boş parametreli olarak overload edebiliriz.

        /*product.setId(1);
        product.setName("Laptop");
        product.setDescription("Msi RTX 4090 Laptop");
        product.setStockAmount(7);
        product.setPrice(99000);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

        /*
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        */



    }
}