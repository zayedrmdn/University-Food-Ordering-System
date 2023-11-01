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
    private List<Object> items;
    private List<String> reviews;
    private List<Object> prices;
    private List<String> status;

    public Order() {
        this.items = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.status = new ArrayList<>();
    }

    public void saveOrderToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (int i = 0; i < items.size(); i++) {
                String line = "Food:" + items.get(i) + "\nPrices:" + prices.get(i) + "\n";
                writer.write(line);
            }
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
    

    public void addItem(Object foodName, Object price) {
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




    public List<Object> getItems() {
        return items;
    }
    public List<Object> getPrices() {
        return prices;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<String> getStatus() {
        return status;
    }
}

