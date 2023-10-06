package Yjun;
import java.util.ArrayList;
import java.util.List;

public class Customer 
{
    private String name;
    private List<Order> orderHistory;
    
        enum OrderStatus
    {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELED,
        NOT_FOUND
    }
    
    public Customer(String name)
    {
     this.name = name;
     this.orderHistory = new ArrayList<>();
    }
    
    public void placeOrder(Order order) 
    {
        orderHistory.add(order);
    }

    public void cancelOrder(Order order) 
    {
        if (orderHistory.contains(order)) {
            order.cancelOrder();
        }
    }

    public OrderStatus checkOrderStatus(Order order) 
    {
        if (orderHistory.contains(order)) {
            return order.getStatus();
        } else {
            return OrderStatus.NOT_FOUND;
        }
    }

    public List<Order> getOrderHistory() 
    {
        return orderHistory;
    }

    public void leaveReview(Order order, String review) 
    {
        if (orderHistory.contains(order)) {
            order.addReview(review);
        }
    }

    public void reorder(Order order) 
    {
        if (orderHistory.contains(order)) {
            List<Item> itemsToReorder = order.getItems();
        }
    }
}

class Order
    {
        private List<Item> items;
        private Customer.OrderStatus status;
        private List<String> reviews;
        
        public Order(List<Item> items)
        {
            this.items = items;
            this.status = Customer.OrderStatus.PENDING;
            this.reviews = new ArrayList<>();
        }
        
        public void cancelOrder()
        {
            this.status = Customer.OrderStatus.CANCELED;
        }
        
         public Customer.OrderStatus getStatus() 
         {
        return status;
         }

        public List<Item> getItems() 
        {
            return items;
        }

        public void addReview(String review) 
        {
            reviews.add(review);
        }
    }