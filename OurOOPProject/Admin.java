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


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class Admin {
    private String username;
    
    private String password;
      public Admin() {
        username =null ;
       password = null;
    }
private static ArrayList<Destination> d=new ArrayList<Destination>();
ArrayList<Customer> cus=new ArrayList<Customer>();
private static ArrayList<Packages> col=new ArrayList<Packages>();
private static ArrayList<RateList>list=new ArrayList<RateList>();
 
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static ArrayList<Destination> getDestinations() {
        return d;
    }

    public void setV(ArrayList<Destination> d) {
        this.d= d;
    }
    public static void addDestination( int sNo,String pickup, String dropoff,int distance)
    {
        Destination des=new Destination( sNo, pickup,  dropoff,distance);
        d.add(des);
        writeTofile(des);
    }
    public static void addPackage(String name,String discount)
    {
       Packages pckg=new Packages(name,discount);
       col.add(pckg);
       writeTofile(pckg);
    }
    public static void addRates(String type,float weight,float rate)
    {
        RateList rates=new RateList(type,weight,rate);
        list.add(rates);
        writeTofile(rates);
        
    }
    
    public static boolean removeDestination(int index)
    {
    
     // Destination des=d.get(i);
        if(index<d.size())
        {
        d.remove(index);
        
        removeFromfile();
     
        
        
        return true;
    }
        return false;
    }

    public static ArrayList<RateList> getRates() {
        return list;
    }

    public static ArrayList<Packages> getCol() {
        return col;
    }
   
     public boolean removeCustomer(int sno)
    { for(int i=0;i<cus.size();i++)
    {
        Customer cu=cus.get(i);
        cus.remove(cu);
        return true;
    }
        return false;
    }

  

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

 
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "username=" + username + ", password=" + password + ", des=" + d + ", cus=" + cus + '}';
    }
     private  static void writeTofile(RateList rates)
    {
        File courierRates=new File("d:/Rate List.txt");
        try {
            if (!courierRates.exists())
            
                courierRates.createNewFile();
                FileWriter f =new FileWriter(courierRates,true);
                BufferedWriter bf=new BufferedWriter(f);
                bf.write(rates.getType()+"\n");
                bf.write(rates.getWeight()+"\n");
                bf.write(rates.getRate()+"\n");
                bf.flush();
                bf.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static
    {
        try
        {
           
            BufferedReader bReader=new BufferedReader(new FileReader(new File("d:/Rate List.txt")));
       while(true)
        {
       
        String courierType=bReader.readLine();
          if(courierType==null)
          break;
        float courierWeight=Float.parseFloat(bReader.readLine());
        float courierRate=Float.parseFloat(bReader.readLine())  ;
       
     RateList rates=new RateList(courierType,courierWeight,courierRate);
      list.add(rates);
        }          
        }
        catch(Exception e)
        {
            e.getMessage();
        }  
}

    private  static void writeTofile(Packages pckg)
    {
        File packagesData=new File("d:/Packages.txt");
        try {
            if (!packagesData.exists())
            
                packagesData.createNewFile();
                FileWriter f =new FileWriter(packagesData,true);
                BufferedWriter bf=new BufferedWriter(f);
                bf.write(pckg.getPackageName()+"\n");
                bf.write(pckg.getDiscount()+"\n");
                bf.flush();
                bf.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static
    {
        try
        {
           
            BufferedReader bReader=new BufferedReader(new FileReader(new File("d:/Packages.txt")));
       while(true)
        {
       
        String packageName=bReader.readLine();
        String discount=bReader.readLine();
         if(discount==null)
          break;
       Packages pckg=new Packages(packageName,discount);
        col.add(pckg);
        }          
        }
        catch(Exception e)
        {
            e.getMessage();
        }  
}


private  static void writeTofile(Destination des)
    {
        File routesData=new File("e:/Destinations.txt");
        try {
            if (!routesData.exists())
            
                routesData.createNewFile();
                FileWriter f =new FileWriter(routesData,true);
                BufferedWriter bf=new BufferedWriter(f);
                bf.write(des.getsNo()+"\n");
                bf.write(des.getPickup()+"\n");
                bf.write(des.getDropoff()+"\n");
                bf.write(des.getDistance()+"\n");
                bf.flush();
                bf.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private static void removeFromfile()
    { 
        FileWriter f=null;
       try
       {
           File routesData=new File("e:/Destinations.txt");
       
       f= new FileWriter(routesData,false);
       }catch(IOException io)
       {
           io.getMessage();
       }finally
       {
           try
           {
           f.close();
           }
       catch(Exception e)
               {
               e.getMessage();
               }
       }
       for(Destination des:d)
       {
           writeTofile(des);
       }
    }

static
    {
        try
        {
           
            BufferedReader bReader=new BufferedReader(new FileReader(new File("e:/Destinations.txt")));
       while(true)
        {
       int sNo=Integer.parseInt(bReader.readLine());
        String pickup=bReader.readLine();
         
        String dropoff=bReader.readLine(); 
        if(dropoff==null)
          break;
        int distance=Integer.parseInt(bReader.readLine());
        Destination des=new Destination(sNo, pickup,  dropoff,distance);
        d.add(des);
        }          
        }
        catch(Exception e)
        {
            e.getMessage();
        }  
}
}
