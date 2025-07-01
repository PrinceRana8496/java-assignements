//You are tasked with writing a processOrderStatus method that takes an OrderStatus enum as input and returns a
// descriptive string based on the order status.
// Here's the OrderStatus enum: public enum OrderStatus { PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED }
// Your processOrderStatus method should adhere to the following rules: For PENDING orders, return:
// "Order is awaiting confirmation." For PROCESSING orders, return: "Order is being prepared."
// For SHIPPED orders, return: "Order has been dispatched." For DELIVERED orders, return: "Order has been successfully delivered."
// For CANCELLED orders, return: "Order has been canceled." For REFUNDED orders, return: "Refund has been issued for the order."
// Use a single switch expression to achieve this. Enhancements: yield Keyword:
// If your logic requires more complex processing within a case, demonstrate the use of the yield keyword to return a value from the switch expression.
package BeyondJava8Features1;
public class OrderProcessor {
    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }
    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> {
                String logMessage = "Order cancelation process Started";
                System.out.println(logMessage);
                yield "Order has been canceled.";
            }
            case REFUNDED -> "Refund has been issued for the order.";
        };
    }
    public static void main(String[] args) {
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.CANCELLED));
    }
}
