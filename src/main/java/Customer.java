import java.util.List;

public class Customer implements Comparable<Customer> {
    private String name;
    private int cartItems;
    private List<Product> productInCart;

    public Customer(String name, int cartItems) {
        this.name = name;
        this.cartItems = cartItems;
    }

    public String getName() {
        return name;
    }

    public int getCartItems() {
        return cartItems;
    }

    @Override
    public int compareTo(Customer customer) {
        if (cartItems < customer.cartItems) {
            return 1;
        } else if (cartItems > customer.cartItems) {
            return -1;
        }
        return 0;
    }
}
