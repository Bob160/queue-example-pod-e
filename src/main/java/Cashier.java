import java.util.PriorityQueue;
import java.util.Queue;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void attendToCustomers(Queue<Customer> customers) {
        int customerSize = customers.size();
        for (int i = 0; i < customerSize; i++) {
            Customer currentCustomer = customers.poll();
            System.out.println("Attending to " + currentCustomer.getName());
        }
        System.out.println("Done attending to customers");
    }

    public void attendToCustomersBasedOnPriority(PriorityQueue<Customer> customers) {
        System.out.println("***** Attending to customers based on priority queue *****");

        int customerSize = customers.size();
        for (int i = 0; i < customerSize; i++) {
            Customer currentCustomer = customers.poll();
            System.out.println("Attending to " + currentCustomer.getName());
        }

        System.out.println("Done attending to customers based on priority queue");
    }
}
