import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Customer implements Comparable<Customer> {
    private String name;
    private List<Product> productsInCart;

    @Override
    public int compareTo(Customer customer) {
        if (productsInCart.size() < customer.getProductsInCart().size()) {
            return 1;
        } else if (productsInCart.size() > customer.getProductsInCart().size()) {
            return -1;
        }
        return 0;
    }
}
