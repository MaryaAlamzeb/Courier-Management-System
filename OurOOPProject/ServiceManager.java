/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

//import RateCalculator.Packagesmy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ServiceManager {
       private static ArrayList<Service> p=new ArrayList<Service>();
    static{ 
        try{
            BufferedReader reader=new BufferedReader(new FileReader(new File("d:/Destinations.txt")));
            while(true)
            {   int sn=Integer.parseInt(reader.readLine());
        
            if(sn==0)
                break;
                String pick=reader.readLine();
          String drop=reader.readLine();
          int dis=Integer.parseInt(reader.readLine());
            Service ser=new Service(sn,pick,drop,dis);
            p.add(ser);
            }
            
        }catch(Exception e)
        {
            e.getMessage();
        }
    }

    public static ArrayList<Service> getP() {
        return p;
    }
    public static void addAreas(int sn,String pick,String drop,int dis)
    {  Service ser=new Service(sn,pick,drop,dis);
            p.add(ser);
    writeToFile(ser);
        
    }
  
    private static void writeToFile(Service ser)
    { 
        File myFile=new File("d:/Destinations.txt");
     try{
         if(!myFile.exists())
             myFile.createNewFile();
         FileWriter f=new FileWriter(myFile,true);
     BufferedWriter writer=new BufferedWriter(f);
 writer.write(ser.getSn()+"\n");
    writer.write(ser.getPickup()+"\n");
       writer.write(ser.getDropOff()+"\n");
        writer.write(ser.getDis()+"\n");
      writer.flush();
       writer.close();
            
        }catch(IOException e)
        {
            e.getMessage();
        }
    }
}
