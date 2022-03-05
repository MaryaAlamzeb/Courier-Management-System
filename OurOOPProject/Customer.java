/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

import Project2020.Project2020.*;

/**
 *
 * @author HP
 */
public class Customer {
   private int sn;
private String name;
private String gmail;
 private int num;
  private String pickup;
  private String dropoff;
  private int hours;

    public Customer() {
         sn = 0;
        name = null;
        num = 0;
        pickup = null;
        dropoff = null;
        hours = 0;
        
    }

    public Customer(int sn, String name, String gmail, int num, String pickup, String dropoff, int hours) {
        this.sn = sn;
        this.name = name;
        this.gmail = gmail;
        this.num = num;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.hours = hours;
    }

  

    public int getSn() {
        return sn;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public int getHours() {
        return hours;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Customer{" + "sn=" + sn + ", name=" + name + ", num=" + num + ", pickup=" + pickup + ", dropoff=" + dropoff + ", hours=" + hours + '}';
    }
    
}
