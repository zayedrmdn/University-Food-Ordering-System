package Yjun;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Customer 
{
 private List<String> reviews;
 
 
 public Customer()
 {
     this.reviews = new ArrayList<>();
 }

 
 public void SaveToCombo(JComboBox<String> comboBox){
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Order.txt");

         try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("order ID:")) {
                    String orderID = line.substring(10); 
                    comboBox.addItem(orderID); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public void addReviews(String review) 
         {
        reviews.add(review);
        }
   public void saveReviewsToFile() {
       String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Reviews.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            for (String review : reviews) {
                writer.write(review);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public void ViewMenu(JTable table)
   {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Menu.txt");
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
   
    public void SaveStatusToCombo(JComboBox<String> comboBox) {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/src/Yjun/resources/Status.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Order ID:")) {
                    String orderID = line.substring(10);
                    comboBox.addItem(orderID);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}

