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
import java.io.*;
public class PackageManager {
    private static ArrayList<Packages> pac=new  ArrayList<Packages>();
    static{
        try{ while(true)
        {
            BufferedReader reader=new BufferedReader(new FileReader(new File("e:/package.txt")));
            String n=reader.readLine();
          if(n==null)
              break;
            String dis=reader.readLine();
         Packages p=new Packages(n,dis);
        }
        }catch(Exception e)
        {
            e.getMessage();
        }
    }

    public static ArrayList<Packages> getPac() {
        return pac;
    }

    public static void addPackage(String n,String dis)
    {  Packages p=new Packages(n,dis);
    pac.add(p);
    writeToFile(p);
   }
    private static void writeToFile( Packages p)
    { File myFile=new File("e:/package.txt");
    try{ if(!myFile.exists())
        myFile.createNewFile();
        FileWriter f =new FileWriter(myFile,true);
        BufferedWriter writer=new BufferedWriter(f);
        writer.write(p.getPackageName()+"\n");
        writer.write(p.getDiscount()+"\n");
        writer.flush();
        writer.close();
    }catch(Exception e)
    {
        e.getMessage();
    }
        
    }
}
