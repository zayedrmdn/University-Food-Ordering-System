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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true))) {
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
    
    public Customer(String name) {
        this.name = name;
        this.reviews = new ArrayList<>(); // Initialize the reviews list
        this.orderHistory = new ArrayList<>(); // Initialize the orderHistory list
        this.items = new ArrayList<>(); // Initialize the items list
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
}

