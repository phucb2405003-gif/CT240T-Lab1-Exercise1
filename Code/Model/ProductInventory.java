import java.util.ArrayList;
import java.util.List;

public class ProductInventory {

    private List<Product> products;

    // Khởi tạo danh sách sản phẩm
    public ProductInventory() {
        products = new ArrayList<>();
    }

    // Thêm sản phẩm vào kho
    public void addProduct(Product product) {
        products.add(product);
    }

    // Xóa sản phẩm khỏi kho
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Tìm sản phẩm theo tên
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }

        return result;
    }

    // Tính tổng giá trị kho
    public double calculateTotalValue() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }
}