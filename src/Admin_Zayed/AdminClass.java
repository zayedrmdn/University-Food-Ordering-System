package Admin_Zayed;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Window;

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
    
}
