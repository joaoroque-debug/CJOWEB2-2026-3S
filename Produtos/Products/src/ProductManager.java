import java.util.ArrayList;

public class ProductManager {

    public boolean save(ArrayList<Product> products, Product product) {

        if (product == null) {
            return false;
        }

        for (Product data : products) {

            if (data.getCode() == product.getCode()) {
                return false;
            }
        }

        products.add(product);
        return true;
    }

    public Product search(ArrayList<Product> products, int code) {

        for (Product data : products) {

            if (data.getCode() == code) {
                return data;
            }
        }

        return null;
    }

    public boolean updateQuantity(
        ArrayList<Product> products,
        int code,
        int quantity
    ) {

        Product product = search(products, code);

        if (product != null) {
            product.setQuantity(quantity);
            return true;
        }

        return false;
    }

    public void showLowStock(ArrayList<Product> products) {

        for (Product data : products) {

            if (data.getQuantity() < 5) {
                System.out.println(data);
            }
        }
    }
}