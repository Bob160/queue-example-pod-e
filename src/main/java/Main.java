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
//        Queue<Customer> customerQueue = new LinkedList<>();
//        customerQueue.add(new Customer("Efiom", 3));
//        customerQueue.add(new Customer("Faith", 10));
//        customerQueue.add(new Customer("Abdullahi", 1));
//        customerQueue.add(new Customer("Emmanuel", 2));
//        customerQueue.add(new Customer("Sylvia", 9));
//        customerQueue.add(new Customer("Peter", 5));

//        PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>();
//        customerPriorityQueue.add(new Customer("Efiom", 3));
//        customerPriorityQueue.add(new Customer("Abdullahi", 1));
//        customerPriorityQueue.add(new Customer("Emmanuel", 2));
//        customerPriorityQueue.add(new Customer("Sylvia", 9));
//        customerPriorityQueue.add(new Customer("Peter", 5));
//        customerPriorityQueue.add(new Customer("Faith", 10));

//        Cashier adedotun = new Cashier("Adedotun");
//        adedotun.attendToCustomers(customerQueue);
//        adedotun.attendToCustomersBasedOnPriority(customerPriorityQueue);


        // Multi Threading
        Product garri = new Product("Garri", 30.69);
        Product rice = new Product("Rice", 20.39);
        Product beans = new Product("Beans", 50.49);
        Product meat = new Product("Meat", 99.99);

        Customer efiom = new Customer("Efiom", new ArrayList<>(Arrays.asList(garri, rice)));
        Customer faith = new Customer("Faith", new ArrayList<>(Arrays.asList(beans, meat)));
        Customer peter = new Customer("Peter", new ArrayList<>(Arrays.asList(meat, rice)));

        Cashier adedotun = new Cashier();
        adedotun.setCashierName("Adedotun");
        adedotun.setCustomer(efiom);
        adedotun.start();

        Cashier emmanuel = new Cashier();
        emmanuel.setCashierName("Emmanuel");
        emmanuel.setCustomer(faith);
        emmanuel.start();

        Cashier abdullahi = new Cashier();
        abdullahi.setCashierName("Abdullahi");
        abdullahi.setCustomer(peter);
        abdullahi.start();



        // Using a class that implements Runnable
        Customer sylvia = new Customer("Sylvia", new ArrayList<>(Arrays.asList(garri, rice)));
        Customer abdul = new Customer("Abdul", new ArrayList<>(Arrays.asList(beans, meat)));
        Customer peters = new Customer("Peters", new ArrayList<>(Arrays.asList(meat, rice)));

        TestCashier adedotunTest = new TestCashier();
        adedotunTest.setCashierName("AdedotunTest");
        adedotunTest.setCustomer(sylvia);
        Thread adedotunTestThread = new Thread(adedotunTest);
        adedotunTestThread.start();

        TestCashier emmanuelTest = new TestCashier();
        emmanuelTest.setCashierName("EmmanuelTest");
        emmanuelTest.setCustomer(abdul);
        Thread emmanuelTestThread = new Thread(emmanuelTest);
        emmanuelTestThread.start();

        TestCashier abdullahiTest = new TestCashier();
        abdullahiTest.setCashierName("AbdullahiTest");
        abdullahiTest.setCustomer(peters);
        Thread abdullahiTestThread = new Thread(abdullahiTest);
        abdullahiTestThread.start();
    }
}
