import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestCashier implements Runnable {

    private String cashierName;
    private Customer customer;

    @Override
    public void run() {
        attendToCustomer(customer);
    }

    private void attendToCustomer(Customer customer) {
        try {
            System.out.println("The current customer in test cashier is: " + customer.getName());
            System.out.println("The current thread in test cashier is: " + Thread.currentThread().getName());
            System.out.println("The priority of the current thread in test cashier is: " + Thread.currentThread().getPriority());
            // TODO: Generate using the products
            customer.getProductsInCart().clear();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while attending to customer in test cashier: " + e.getMessage());
        }
    }
}
