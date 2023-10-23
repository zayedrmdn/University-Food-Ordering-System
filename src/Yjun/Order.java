/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yjun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<String> items;
    private List<String> reviews;
    private List<Double> prices;
    private List<String> status;

    public Order() {
        this.items = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.status = new ArrayList<>();
    }

    public void saveOrderToFile(String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < items.size(); i++) {
                String line = "Food:" + items.get(i) + "\nPrices:" + prices.get(i) + "\n";
                writer.write(line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void appendOrderToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (int i = 0; i < items.size(); i++) {
                String line = "Food:" + items.get(i) + "\nPrices:" + prices.get(i) + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    public void deleteOrderFromFile(String filename) {
//        try {
//            File file = new File(filename);
//            if (items.exists()) {
//                if (file.delete()) {
//                    System.out.println("Order file deleted successfully.");
//                } else {
//                    System.out.println("Failed to delete the order file.");
//                }
//            } else {
//                System.out.println("Order file does not exist.");
//            }
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        }
//    }

    public void addItem(String foodName, double price) {
        items.add(foodName);
        prices.add(price);
    }

    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("Cannot place an empty order.");
            return;
        }
        status.add("Placed");
    }

    public void cancelOrder() {
        if (status.isEmpty() || !status.get(status.size() - 1).equals("Placed")) {
            System.out.println("Cannot cancel an order that has not been placed.");
            return;
        }
        items.clear();
        prices.clear();
        status.add("Cancelled");
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void updateOrderStatus(String newStatus) {
        if (!status.isEmpty() && status.get(status.size() - 1).equals("Placed")) {
            status.add(newStatus);
        } else {
            System.out.println("Order status can only be updated for placed orders.");
        }
    }


    public List<String> getItems() {
        return items;
    }
    public List<Double> getPrices() {
        return prices;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<String> getStatus() {
        return status;
    }
}

