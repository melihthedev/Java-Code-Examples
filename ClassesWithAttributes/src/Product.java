public class Product {

    public Product(int id, String name, String description, int unitPrice, int unitsInStock, String renk){
        // We can either use constructor block or getter and setter
        // We pass given params while creating an instance
        System.out.println("Constructor Block");
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.renk = renk;
    }

    public Product() {
        // If we don't pass params while creating an instance, this block will work
        System.out.println("Created without constructor");
    }
    private int id;
    private String name;
    private double unitPrice;
    private int unitsInStock;
    private String description;
    private String renk;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,2).toUpperCase() + id;
    }

}
