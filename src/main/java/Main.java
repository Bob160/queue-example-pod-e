import java.util.*;

public class Main {
    public static void main (String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Peter");
//        stringList.add("Peter");
//        stringList.add("Peter");
//        stringList.add("Efiom");
//        stringList.add("Sylvia");
//        stringList.add("Faith");
//        stringList.add("Emmanuel");
//        stringList.add("Abdullahi");
//        System.out.println("We have " + stringList.size() + " names");
//        Map<String, String> stringMap = new HashMap<>();
//        stringMap.put("Peter", "Is a big boy");
//        System.out.println(stringMap.size());
//        Set<String> stringSet = new HashSet<>();
//
//        for (String name: stringList) {
//            stringSet.add(name);
//        }
//
//        System.out.println("We have " + stringSet.size() + " unique names");

        // Queue
        // Customer add products to cart -> add customer to queue -> pass the queue to the cashier method.
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.add(new Customer("Efiom", 3));
        customerQueue.add(new Customer("Faith", 10));
        customerQueue.add(new Customer("Abdullahi", 1));
        customerQueue.add(new Customer("Emmanuel", 2));
        customerQueue.add(new Customer("Sylvia", 9));
        customerQueue.add(new Customer("Peter", 5));

        PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>();
        customerPriorityQueue.add(new Customer("Efiom", 3));
        customerPriorityQueue.add(new Customer("Abdullahi", 1));
        customerPriorityQueue.add(new Customer("Emmanuel", 2));
        customerPriorityQueue.add(new Customer("Sylvia", 9));
        customerPriorityQueue.add(new Customer("Peter", 5));
        customerPriorityQueue.add(new Customer("Faith", 10));

        Cashier adedotun = new Cashier("Adedotun");
        adedotun.attendToCustomers(customerQueue);
        adedotun.attendToCustomersBasedOnPriority(customerPriorityQueue);
    }
}
