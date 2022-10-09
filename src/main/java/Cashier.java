import java.util.PriorityQueue;
import java.util.Queue;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void attendToCustomers(Queue<Customer> customers) {
        for (int i = customers.size(); i > 0; i--) {
            Customer currentCustomer = customers.poll();
            assert currentCustomer != null;
            System.out.println("Attending to " + currentCustomer.getName());
        }

        System.out.println("Done attending to customers");
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
