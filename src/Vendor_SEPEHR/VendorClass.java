package Vendor_SEPEHR;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;



public class VendorClass {
    public static void MenuItem(){
        MenuItem menu = new MenuItem();
        menu.setVisible(true);
    }
    
    public static void AcceptOrder(){
        AcceptOrder ord=new AcceptOrder();
        ord.setVisible(true);
    }
    public static void Order(){
        Order1 orde=new Order1();
        orde.setVisible(true);
    }
  public static void StatusOrder(){
      StatusOrder so=new StatusOrder();
      so.setVisible(true);
  }
  public static void RevenueDashh(){
      RevenueDash dsh=new RevenueDash();
      dsh.setVisible(true);
  }
  public static String generateOrderID(){
      long timestamp=System.currentTimeMillis();
      int random=(int)(Math.random()*5);
      return String.format("%d",timestamp,random,UUID.randomUUID());
  }
  public static void Cancelellation(){
      Cancellation cn=new Cancellation();
      cn.setVisible(true);
  }
}