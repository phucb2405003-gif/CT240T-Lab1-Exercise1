public abstract class Product {

    private String id;
    private String name;
    private double price;

    // Constructor khởi tạo các thuộc tính
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Phương thức abstract, lớp con phải override
    public abstract double calculateFinalPrice();

    // Getter / Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter / Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter / Setter cho price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}