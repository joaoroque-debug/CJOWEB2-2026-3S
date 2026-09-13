public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "Teclado");
        product.setName("Mouse");
        product.setPrice(56.00);
        System.out.println(product);
    }
}
