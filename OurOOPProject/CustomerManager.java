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
//import project2020new.ProjectInterfaces.*;
import java.util.*;
import java.io.*;
public class CustomerManager {
   private static ArrayList<RegisteredCustomer> rg=new ArrayList<RegisteredCustomer>();
    static {
        try{ BufferedReader reader=new BufferedReader(new FileReader(new File("d:/registeredCustomer.txt")));
        while(true)
        { int sn=Integer.parseInt(reader.readLine());
                 String name=reader.readLine();
                if(name==null)
            break;
        
        int regisNum=Integer.parseInt(reader.readLine());
            String date=reader.readLine();
            RegisteredCustomer regis=new RegisteredCustomer(sn,name,regisNum,date);
            rg.add(regis);
            
        } 
        }catch(Exception e)
        {
            e.getMessage();
        }
        
    }

    public static ArrayList<RegisteredCustomer> getRg() {
        return rg;
    }
    public static void addCustomer(int sn,String n,int rn,String date)
    { RegisteredCustomer regis=new RegisteredCustomer(sn,n,rn,date);
      rg.add(regis);
    writeToFile(regis);
        
    }
       public static boolean removePerson(int index)
    {
    
     // Destination des=d.get(i);
        if(index<rg.size())
        {
        rg.remove(index);
        
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
           File data=new File("d:/registeredCustomer.txt");
       
       f= new FileWriter(data,false);
       }catch(Exception io)
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
       for(RegisteredCustomer regis:rg)
       {
           writeToFile(regis);
       }
    }
    private static void writeToFile(RegisteredCustomer regis)
    { File myFile=new File("e:/registeredCustomer.txt");
    
    try{ if(!myFile.exists())
       myFile.createNewFile();
        FileWriter f=new FileWriter(myFile,true);
    BufferedWriter writer=new BufferedWriter(f);
    writer.write(regis.getSno()+"\n");
     writer.write(regis.getName()+"\n");
    writer.write(regis.getRegNo()+"\n");
    writer.write(regis.getDate()+"\n");
    writer.flush();
    writer.close();
    }catch(Exception e)
    {
        e.getMessage();
    }
        
    }
}
