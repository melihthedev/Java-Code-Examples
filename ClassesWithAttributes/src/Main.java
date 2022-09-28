public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setUnitPrice(5000);
        product.setUnitsInStock(50);
        product.setDescription("Good quality");
        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
