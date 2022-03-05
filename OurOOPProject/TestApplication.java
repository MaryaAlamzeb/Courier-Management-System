/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

/**
 *
 * @author HP
 */
import Project2020.Project2020.*;
import java.util.*;
public class TestApplication {
    public static void main(String [] args) throws Exception
    { 
        Scanner sc=new Scanner(System.in);
    Admin a=new Admin();
    Customer cus=new Customer();
 
   char ans3,ans4;

   System.out.println("ENTER USERNAME");
   String username=sc.nextLine();
   a.setUsername(username);
    System.out.println("ENTER Password");
    String pass=sc.nextLine();
    a.setPassword(pass);
    do
    {
        System.out.println("/////////////////////////////////////////////////");
   System.out.println("<<<<<<WELCOME IN COURIER MANAGEMENT SYSTEM>>>>>>");
    System.out.println("/////////////////////////////////////////////////");
    System.out.println("PRESS 1 FOR ADMIN BLOCK AND 2 FOR CUSTOMER BLOCK:");
       int ans=sc.nextInt();
       sc.nextLine();
       if(ans==1)
       {
           System.out.println("ENTER USERNAME");
   String user=sc.nextLine();
     if(a.getUsername().equals(user));
     {
     System.out.println("ENTER Password");
    String passwordd=sc.nextLine();
 
 
   if(a.getPassword().equals(passwordd))
  
   { 
     System.out.println("///////////////////////////");
       System.out.println("<<<<<<<<ADMIN BLOCK>>>>>>>>");
       System.out.println("///////////////////////////");
     System.out.println("PRESS 1 TO ENTER Routes DATA");
       System.out.println("PRESS 2 TO VIEW DATA");
       System.out.println("PRESS 3 TO EDIT DATA");
       System.out.println("PRESS 4 TO DELETE VEHICLE RECORD");
      System.out.println("PRESS 5 TO VIEW CUSTOMER DATA");
       System.out.println("PRESS 6 TO DELETE CUSTOMER DATA");
       System.out.println("PRESS 7 TO VIEW BILLS");
       System.out.println("PRESS 8 TO DELETE BILLS");
        

     int ans1=sc.nextInt();
       sc.nextLine();
       if(ans1==1)
       { do{
                System.out.println("enter serial num");
                     int sNo=sc.nextInt();
                    sc.nextLine();
                     System.out.println("enter pick up location");
                    String pickup=  sc.nextLine();
                        System.out.println("enter dropoff location");
                            String dropoff=  sc.nextLine();
                                    System.out.println("Enter distance in kilometers");
                     int distance=sc.nextInt();
                     sc.nextLine();
                          System.out.println("press y if you want to enter another vehicle data"); 
                           ans3=sc.nextLine().charAt(0);
                     
                    sc.nextLine();
                           Admin.addDestination(sNo, pickup, dropoff, distance);
       }
       while(ans3=='y'||ans3=='Y');
       }
       if(ans1==2)
       {
                    System.out.println(a);
       }
          if(ans1==3)
       {
                   // System.out.println(a);
       }
               if(ans1==4)
       {
                    System.out.println("Enter vehicle num which you want to delete");
                     int num6=sc.nextInt();
                    sc.nextLine();
                    a.removeDestination(num6);
       }
                       if(ans1==5)
       {
                     System.out.println(cus);
       }
                    if(ans1==6)
       {
                     System.out.println("Enter cutomer sno which you want to delete");
                     int sno=sc.nextInt();
                    sc.nextLine();
                    a.removeCustomer(sno);
       }
        
    }
}
   }
       if(ans==2)
       {
            System.out.println("///////////////////////////");
            System.out.println("<<<<<<<<CUSTOMER BLOCK>>>>>>>>");
            System.out.println("///////////////////////////");
             System.out.println("Enter serial num");
             int sn=sc.nextInt();
             sc.nextLine();
             System.out.println("Enter your name");
 String name=sc.nextLine();
 System.out.println("Enter contact num");
  int num=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter pick up location");
 String pickup=sc.nextLine();
 System.out.println("Enter dropoff location");
  String dropoff=sc.nextLine();
  System.out.println("Enter hours");
  int hours=sc.nextInt();

       }
        System.out.println("press y if you want to restart"); 
                           ans4=sc.nextLine().charAt(0);
    }
    while(ans4=='y'||ans4=='Y');
}
}
    
    