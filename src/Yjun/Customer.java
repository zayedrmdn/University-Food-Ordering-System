package Yjun;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
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
    
    public void saveReviewsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String review : reviews) {
                writer.write(review);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addReviews(String review) 
         {
        reviews.add(review);
        }
        enum OrderStatus
    {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELED,
        NOT_FOUND
    }
    
    public Customer(String name) {
        this.name = name;
        this.reviews = new ArrayList<>(); // Initialize the reviews list
        this.orderHistory = new ArrayList<>(); // Initialize the orderHistory list
        this.items = new ArrayList<>(); // Initialize the items list
    }
    
   

}

//class Order
//    {
//        private List<String> items;
//        private Customer.OrderStatus status;
//        private List<Double> prices;
//        
//        public Order()
//        {
//            this.items = new ArrayList<>();;
//            this.status = Customer.OrderStatus.PENDING;
//            this.prices = new ArrayList<>();;
//        }
//        
//       public void saveOrderToFile(String filename) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
//            for (int i = 0; i < items.size(); i++) {
//                String line = "Food:"+ items.get(i) + "\nPrices:" + prices.get(i);
//                writer.write(line);
//            }
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        }
//         public void addItem(String foodName, double price) 
//         {
//        items.add(foodName);
//        prices.add(price);
//        }
//        
//        public void cancelOrder()
//        {
//            this.status = Customer.OrderStatus.CANCELED;
//        }
//        
//         public Customer.OrderStatus getStatus() 
//         {
//        return status;
//         }
//
//        public List<String> getItems() 
//        {
//            return items;
//        }
//    }

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
}

