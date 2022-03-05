/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author HP
 */
public class PackageM {
      private static ArrayList<Packagesmy> p=new ArrayList<Packagesmy>();
    static{ 
        try{
            BufferedReader reader=new BufferedReader(new FileReader(new File("e:/packageRecorddd.txt")));
            while(true)
            {
            String n=reader.readLine();
            if(n==null)
                break;
            int dis=Integer.parseInt(reader.readLine());
          
            Packagesmy per=new Packagesmy(n,dis);
            p.add(per);
            }
            
        }catch(Exception e)
        {
            e.getMessage();
        }
    }

    public static ArrayList<Packagesmy> getP() {
        return p;
    }
    public static void addPackage(String n,int dis)
    {  Packagesmy per=new Packagesmy(n,dis);
    p.add(per);
    writeToFile(per);
        
    }
     public static boolean removePerson(int index)
    {
    
     // Destination des=d.get(i);
        if(index<p.size())
        {
        p.remove(index);
        
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
           File routesData=new File("e:/packageRecordd.txt");
       
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
       for(Packagesmy per:p)
       {
           writeToFile(per);
       }
    }
    private static void writeToFile(Packagesmy per)
    { 
        File myFile=new File("e:/packageRecorddd.txt");
     try{
         if(!myFile.exists())
             myFile.createNewFile();
         FileWriter f=new FileWriter(myFile,true);
     BufferedWriter writer=new BufferedWriter(f);

  
       writer.write(per.getName()+"\n");
       //writer.newLine();
         writer.write(per.getDis()+"\n");
      
      writer.flush();
       writer.close();
            
        }catch(IOException e)
        {
            e.getMessage();
        }
    }
}
