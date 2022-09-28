public class Main {
    public static void main(String[] args) {
        //Constructor
        Product product = new Product(1, "Laptop", "Good quality", 5000, 50, "gray");

        //Using getter and setter
        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Laptop");
        product1.setUnitPrice(5000);
        product1.setUnitsInStock(50);
        product1.setDescription("Good quality");

        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
