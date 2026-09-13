import java.util.ArrayList;

public class CartManager {

    public boolean save(ArrayList<CartItem> cart, CartItem item) {

        if (item != null) {
            cart.add(item);
            return true;
        }

        return false;
    }

    public void showCart(ArrayList<CartItem> cart) {

        if (cart.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        for (CartItem item : cart) {
            System.out.println(item);
        }
    }

    public double total(ArrayList<CartItem> cart) {

        double total = 0;

        for (CartItem item : cart) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void clear(ArrayList<CartItem> cart) {
        cart.clear();
    }
}