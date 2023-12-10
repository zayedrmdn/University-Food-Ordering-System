package Yjun;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Customer extends Order implements Serializable
{
 private static final long serialVersionUID = 1L;
 private List<String> reviews;
 private String name;
 private double credit;
 
 
    public Customer()
    {
      credit = 6000.10;
    }
    
   
     public void addReviews(String review) 
         {
        reviews.add(review);
        }
    public void saveReviewsToFile() {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Reviews.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (String review : reviews) {
                writer.write("Customer: " + name + ", Review: " + review);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

   public void viewMenu(JTable table, JComboBox<String> cuisineComboBox) {
    String workingDirectory = System.getProperty("user.dir");
    File file = new File(workingDirectory + "/src/Yjun/resources/Menu.txt");

    try {
        FileReader fread = new FileReader(file);
        BufferedReader bread = new BufferedReader(fread);
        DefaultTableModel md = (DefaultTableModel) table.getModel();
        md.setRowCount(0); 

        Object[] lines = bread.lines().toArray();

        if (cuisineComboBox.getSelectedItem() != null) {
            String selectedCuisine = cuisineComboBox.getSelectedItem().toString();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString().trim();

                if (line.equals(selectedCuisine)) {
                    i++; 

                    while (i < lines.length && !lines[i].toString().trim().isEmpty()) {
                        String[] row = lines[i].toString().split(" ");
                        md.addRow(row);
                        i++;
                    }

                    break; 
                }
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
}

   
   public void saveOrderToFile(JTable table) {
        int selectedRow = table.getSelectedRow();
       

    if (selectedRow != -1) {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Orders.txt");

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            Date currentTime = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedTime = dateFormat.format(currentTime);

            bw.write(table.getValueAt(selectedRow, 0).toString() + " " +
                     table.getValueAt(selectedRow, 1).toString() + " " +
                     table.getValueAt(selectedRow, 2).toString() + " " +
                     table.getValueAt(selectedRow, 3).toString() + " " +
                     formattedTime);
            
           

            bw.newLine();
            bw.close();
            fw.close();

            System.out.println("Selected order saved to file");

        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        System.err.println("No row selected.");
    }
}
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }
    
    public void deductCredit(double amount){   
        credit -= amount;
    }

   
}

