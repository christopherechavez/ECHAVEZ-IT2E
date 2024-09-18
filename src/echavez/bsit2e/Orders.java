
package echavez.bsit2e;



import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private String customerName;
    private String orderDate;
    private double orderAmount;
    private String orderStatus;

    public Order(int orderId, String customerName, String orderDate, double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}