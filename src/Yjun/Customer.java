package Yjun;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Customer 
{
    private String name;
    private List<Order> orderHistory;
    private List<String> reviews;
    private List<Item> items;
   
    public List<Item> getItems() {
        return items;
    }
   
    public void saveOrdersToFile(String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        for (Order order : orderHistory) {
            writer.println("Order Status: " + order.getStatus());
            writer.println("Items:");
            for (Item item : order.getItems()) {
                writer.println(item.getName() + " - " + item.getPrice());
            }
            writer.println();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    public void saveReviewsToFile(String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        for (Order order : orderHistory) {
            for (String review : order.getReviews()) {
                writer.println("Review for Order ID: " + order.hashCode());
                writer.println(review);
                writer.println();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    
    
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
        public List<String> getReviews() 
        {
        return reviews;
        }
    }

class Item
{
     private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
}

class Reviews
{
    private String reviewText;

    public Reviews(String reviewText) 
    {
        this.reviewText = reviewText;
    }
}
}

