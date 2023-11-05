/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


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
    
    public void CancelOrder(JComboBox<String> comboBox,String selectedOrderID)
    {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Status.txt");
        File tempFile = new File(workingDirectory + "/src/Yjun/resources/TempOrder.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Order ID:") && line.substring(10).equals(selectedOrderID)) {
                    String nextLine = reader.readLine(); 
                    if (!selectedOrderID.contains("Progressing") || !selectedOrderID.contains("Delivered")) {
                        continue;
                        
                    } else {
   
                        System.out.println("Order with status 'Progressing' or 'Delivered' cannot be canceled.");
                        writer.write(line);
                        writer.newLine();
                        writer.write(nextLine);
                        writer.newLine();
                        continue;
                    }
                }

                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (file.delete() && tempFile.renameTo(file)) {

            comboBox.removeItem(selectedOrderID);
        } else {
            System.out.println("Failed to cancel order. You may need to manually replace the files.");
        }
    }
    
    public void SaveToTable(JTable table)
    {
         String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Orders.txt");
        
        try {
            FileReader Fread=new FileReader(file);
            BufferedReader Bread=new BufferedReader(Fread);
            DefaultTableModel md= (DefaultTableModel)table.getModel();
            Object[] lines=Bread.lines().toArray();
            
            for(int i=0;i<lines.length;i++){
                String[] row=lines[i].toString().split(" ");
                md.addRow(row);
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveOrderToFile(JTable table) {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Orders.txt");
        try {
            FileWriter fw=new FileWriter(file,true);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<table.getRowCount();i++){
                Date currentTime=new Date();
                SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedTime=dateFormat.format(currentTime);
                bw.write(table.getValueAt(i,0).toString()+" "+table.getValueAt(i,1).toString()+" "+formattedTime);
                    
            
            bw.newLine(); 
            }
            bw.close();
            fw.close();

            System.out.println("Order Ordered");
            
        } catch (IOException e) {
            e.printStackTrace();;
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

