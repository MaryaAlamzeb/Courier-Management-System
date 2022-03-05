/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;
import Project2020.Project2020.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Marya Alamzeb
 */
public class TestRateCalculatorc {
  
    private static int[][] solid={{150,120,150,200},
                          {120, 150, 120, 200},
                          {140, 145, 150, 200},
                           {150, 226, 68, 150}};
    private static int[][] perishable={{160,120,150,200},
                          {120, 160, 130, 200},
                          {160, 200, 160, 200},
                           {130, 245, 285, 160}};
    private static int[][] fragile={{200,220,250,280},
                          {220, 200, 320, 230},
                          {240, 229, 200, 200},
                           {200, 250, 260, 200}};
    
   


    public static int[][] getSolid() {
        return solid;
    }
 // StringTokenizer st=new StringTokenizer;  

    public static int[][] getPerishable() {
        return perishable;
    }

    public static int[][] getFragile() {
        return fragile;
    }

   /*  public static double totalBillFile(int t,int org,int des,double weight)
     {
         for(int i=0;i<4;i++)
         {
             if(t==2)
             {
               FragileRateFile.readFile();
               
                 
             }
         }
         double bill=weight;
                 return bill;
     }
       */
     public static double totalBillArr(int t,int org,int des,double weight,int p)
     {
          double bill=0,dis=0;
          double totalBill=0;
         if(t==0)
             {
               bill=solid[org][des];            
    
             }
     if(t==1)
     {
          bill=fragile[org][des];
                  
        }
     if(p==0)
            
        {
            totalBill=bill*weight; 
        }
            if(p==1)
            {
                totalBill=bill*weight;
                 dis=totalBill*30/100;
                totalBill=totalBill-dis; 
              
            }
            if(p==2)
            { 
                totalBill=bill*weight;
                dis=totalBill*50/100;
                totalBill=totalBill-dis;

            }
          return totalBill;
     }

/* public static void main(String args[])
 {
    /* int t=0;
     int org=1;
     int des=2;
     double w=2;
     totalBillA(t,org,des,w);
      int[][] solid={{30,120,150,200},
                          {120, 50, 120, 200},
                          {140, 129, 50, 200},
                           {100, 226, 68, 7}};
   
  int[][] perishable={{40,120,150,200},
                          {120, 250, 130, 200},
                          {160, 129, 50, 200},
                           {130, 245, 85, 190}};
         
         int[][] fragile={{100,120,150,200},
                          {120, 50, 120, 200},
                          {140, 129, 50, 200},
                           {100, 226, 68, 7}};
              
             
        
     System.out.println(" Rate list for shipment of solid type of courier");
     for(int i=0;i<4;i++)
     {
         for(int j=0;j<4;j++)
         {
             SolidRateFile.writeTofile();
            // System.out.println("From Destination "+(i+1)+"  to destnation"+(j+1));
         // System.out.println(solid[i][j]+"");
            SolidRateFile.readFile();
         }
         System.out.println();
     }
      System.out.println(" Rate list for shipment of perishable type of courier");
     for(int i=0;i<4;i++)
     {
         for(int j=0;j<4;j++)
         {
             PerishableRateFile.writeToFile();
            // PerishableRateFile.readFile();
             // System.out.println("From Destination "+(i+1)+"to destnation  "+(j+1));
          //System.out.println(perishable[i][j]+"");
         }
          System.out.println();
     }
      System.out.println(" Rate list for shipment of fragile type of courier");
     for(int i=0;i<4;i++)
     {
         for(int j=0;j<4;j++)
         {
             FragileRateFile.writeTofile();
                       //System.out.println("From Destination "+(i+1)+"to destnation "+(j+1));
//FragileRateFile.readFile();
         // System.out.println(fragile[i][j]+"");
         }
          System.out.println();
     }
    */

 }


   

    
    

