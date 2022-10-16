import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;
import java.util.Queue;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cashier extends Thread {
    private String cashierName;
    private Customer customer;
    @Override
    public void run() {
        attendToCustomer(customer);
    }

    public void attendToCustomers(Queue<Customer> customers) {
        for (int i = customers.size(); i > 0; i--) {
            Customer currentCustomer = customers.poll();
            assert currentCustomer != null;
            System.out.println("Attending to " + currentCustomer.getName());
        }

        System.out.println("Done attending to customers");
    }

    private void attendToCustomer(Customer customer) {
        try {
            System.out.println("The current customer is: " + customer.getName());
            System.out.println("The current thread is: " + this.getName());
            System.out.println("The priority of the current thread is: " + this.getPriority());
            // TODO: Generate using the products
            customer.getProductsInCart().clear();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while attending to customer: " + e.getMessage());
        }
    }

    public void attendToCustomersBasedOnPriority(PriorityQueue<Customer> customers) {
        System.out.println("***** Attending to customers based on priority queue *****");

        for (int i = customers.size(); i > 0; i--) {
            Customer currentCustomer = customers.poll();
            assert currentCustomer != null;
            System.out.println("Attending to " + currentCustomer.getName());
        }

        System.out.println("Done attending to customers based on priority queue");
    }
}
