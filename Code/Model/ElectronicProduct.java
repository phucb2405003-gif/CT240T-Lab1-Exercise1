public class ElectronicProduct extends Product implements Discountable {

    private int warrantyMonths;

    // Constructor mặc định
    public ElectronicProduct() {
        super("", "", 0.0);
    }

    // Tính giá sau khi cộng VAT 10%
    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    // Giảm giá trực tiếp vào price
    @Override
    public void applyDiscount(double percent) {
        double newPrice = getPrice() * (1 - percent / 100);
        setPrice(newPrice);
    }
}