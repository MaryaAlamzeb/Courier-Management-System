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
import project2020new.ProjectInterfaces.*;
import java.util.*;
import java.io.*;
public class Detailmanager {
    private static ArrayList<CustomerInfo> ci=new ArrayList<CustomerInfo>();
  
    static{ 
        try{
            BufferedReader reader=new BufferedReader(new FileReader(new File("e:/details.txt")));
            while(true)
            {
            String n=reader.readLine();
      if(n==null)
                break;
            double num=Double.parseDouble(reader.readLine());
            String loc=reader.readLine();
             String recn=reader.readLine();
   double recnum=Double.parseDouble(reader.readLine());
            String recloc=reader.readLine();
           
             int weight=Integer.parseInt(reader.readLine());
            String date=reader.readLine();
           
            CustomerInfo cus =new CustomerInfo(n,num,loc,recn,recnum,recloc,weight,date);
            ci.add(cus);
            }
            
        }catch(Exception e)
        {
            e.getMessage();
        }
    }

    public static ArrayList<CustomerInfo> getCi() {
        return ci;
    }

    
    public static void addDetails(String n,double num,String loc,String recn,double recnum,String recloc,int weight,String date)
    {  CustomerInfo cus =new CustomerInfo(n,num,loc,recn,recnum,recloc,weight,date);
    ci.add(cus);
    writeToFile(cus);
        
    }
     public static boolean removePerson(int index)
    {
    
     // Destination des=d.get(i);
        if(index<ci.size())
        {
        ci.remove(index);
        
        removeFromfile();
     
        
        
        return true;
    }
        return false;
    }
      private static void removeFromfile()
    { 
        FileWriter f=null;
       try
       {
           File routesData=new File("e:/details.txt");
       
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
       for(CustomerInfo cus:ci)
       {
           writeToFile(cus);
       }
    }
    private static void writeToFile(CustomerInfo cus)
    { 
        File myFile=new File("e:/details.txt");
     try{
         if(!myFile.exists())
             myFile.createNewFile();
         FileWriter f=new FileWriter(myFile,true);
     BufferedWriter writer=new BufferedWriter(f);
     writer.write(cus.getName()+"\n");
    // writer.newLine();
       writer.write(cus.getNum()+"\n");
       //writer.newLine();
         writer.write(cus.getLocation()+"\n");
       //  writer.newLine();
           writer.write(cus.getRecname()+"\n");
         //  writer.newLine();
             writer.write(cus.getRecnum()+"\n");
           //  writer.newLine();
               writer.write(cus.getReclocation()+"\n");
             //  writer.newLine()
                //// writer.newLine();
                   writer.write(cus.getWeight()+"\n");
                   //writer.newLine();
                     writer.write(cus.getDate()+"\n");
      writer.flush();
       writer.close();
            
        }catch(IOException e)
        {
            e.getMessage();
        }
}
}
