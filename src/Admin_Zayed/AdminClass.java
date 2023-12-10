package Admin_Zayed;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdminClass
{
    
    // Method to center a JFrame on the screen
    public void centerFrameOnScreen(Window window)
    {
        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        // Get the width and height of the screen
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        // Get the width and height of the JFrame
        int frameWidth = window.getWidth();
        int frameHeight = window.getHeight();
        
        // Calculate the x and y coordinates to center the JFrame
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        
        // Set the location of the JFrame to the calculated coordinates
        window.setLocation(x, y);
    }
    
    public String getTime(){
        Date currentDate = new Date();

        // Create a SimpleDateFormat with your desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time
        String formattedTime = dateFormat.format(currentDate);
        return formattedTime;
    }
    
    public void generateReceipt(Double TopUp){
        String workingDirectory = System.getProperty("user.dir");
        File resourcesFolder = new File(workingDirectory + "/src/Yjun/Resources");
        if (!resourcesFolder.exists()) {
            resourcesFolder.mkdir();
        }
        
        String formattedTime = getTime();
        
        File notificationFile = new File(resourcesFolder, "Notification.txt");
        System.out.println("Notification file path: " + notificationFile.getAbsolutePath());
        try{
            FileWriter fr = new FileWriter(notificationFile, true);
            BufferedWriter writer = new BufferedWriter(fr);
            writer.write(formattedTime + "," + "Top Up" + "," + TopUp);
            writer.newLine();
            System.out.println("Date and TopUp written to Notification.txt");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

