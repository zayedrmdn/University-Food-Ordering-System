package Yjun;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Customer extends Order implements Serializable
{
 private static final long serialVersionUID = 1L;
 private List<String> reviews;
 private String name;
 private double credit;
   
    public Customer(String name, double credit) {
        this.name = name;
        this.credit = credit;
        this.reviews = new ArrayList<>();
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
    
    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

   
}

