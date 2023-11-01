/*package javacuddle2;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;




public class Runner {
    
    private int runnerID;
    private String name;
    private int revenue;
    private int deliveryFee = 10;
    
    
    public Runner(int runnerID, String name){
    
    this.runnerID = runnerID;
    this.name = name;
    
    }
    
    public static void populateTableFromTextFile(JTable tblOrders, String filename){
       
       DefaultTableModel tableModel = (DefaultTableModel) tblOrders.getModel();
       
       tableModel.setRowCount(0);
       
       try (BufferedReader br = new BufferedReader(new FileReader(filename))){
           
           
           String line;
           while((line = br.readLine())!= null){
               
               String[] rowData = line.split(",");
               
               if(rowData.length == 4 ){
                   
                   tableModel.addRow(rowData);
               
               } else{
                   
                   System.out.println("No orders availabe for delivery");
               
               }
               
           
           
           }catch (IOException ex){
                   
                   ex.printStackTrace();
                   
                   }
       
       
       
       }
       
       
   
   
   
   }
    
    
    
}*/



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    private int runnerID;
    private String name;
    private int revenue;
    private int deliveryFee = 10;

    public Runner(int runnerID, String name) {
        this.runnerID = runnerID;
        this.name = name;
    }

    public static void populateTableFromTextFile(JTable tblOrders, String filename) {
        DefaultTableModel tableModel = (DefaultTableModel) tblOrders.getModel();
        tableModel.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");

                if (rowData.length == 4) {
                    tableModel.addRow(rowData);
                } else {
                    System.out.println("No orders available for delivery");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
       
    }
}

// Mian method code:
 /*SwingUtilities.invokeLater(() -> {
            
            JFrame frame = new JFrame("Runner Orders");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTable tblOrders = new JTable();
            JScrollPane scrollPane = new JScrollPane(tblOrders);
            frame.add(scrollPane);

            
            populateTableFromTextFile(tblOrders, "data.txt");

            frame.pack();
            frame.setVisible(true);
        });*/
