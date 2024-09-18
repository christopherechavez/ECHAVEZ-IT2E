
package echavez.bsit2e;

import java.util.ArrayList;
import java.util.List;


public class ECHAVEZBSIT2E {

    
    public static void main(String[] args) {
    public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

       
        Order order1 = new Order(101, "Alice", "2024-09-01", 150.75, "Shipped");
        orders.add(order1);

        
        Order order2 = new Order(102, "Bob", "2024-09-05", 20.00, "Delivered");
        orders.add(order2);

        
        orders.stream().map((order) -> {
            System.out.println("*Order:*");
            return order;
        }).map((order) -> {
            System.out.println("* *Order ID:* " + order.getOrderId());
            return order;
        }).map((order) -> {
            System.out.println("* *Customer Name:* " + order.getCustomerName());
            return order;
        }).map((order) -> {
            System.out.println("* *Order Date:* " + order.getOrderDate());
            return order;
        }).map((order) -> {
            System.out.println("* *Order Amount:* " + order.getOrderAmount());
            return order;
        }).map((order) -> {
            System.out.println("* *Order Status:* " + order.getOrderStatus());
            return order;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }
}
    
}
