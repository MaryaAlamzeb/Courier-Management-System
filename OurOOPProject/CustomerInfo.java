/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

import project2020new.ProjectInterfaces.*;

/**
 *
 * @author HP
 */
public class CustomerInfo {
    private String name;
    private double num;
    private String location;
     private String recname;
    private double recnum;
    private String reclocation;

    private int weight;
    private String date;

    public CustomerInfo(String name, double num, String location, String recname, double recnum, String reclocation,  int weight, String date) {
        this.name = name;
        this.num = num;
        this.location = location;
        this.recname = recname;
        this.recnum = recnum;
        this.reclocation = reclocation;
       
        this.weight = weight;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRecname() {
        return recname;
    }

    public void setRecname(String recname) {
        this.recname = recname;
    }

    public double getRecnum() {
        return recnum;
    }

    public void setRecnum(double recnum) {
        this.recnum = recnum;
    }

    public String getReclocation() {
        return reclocation;
    }

    public void setReclocation(String reclocation) {
        this.reclocation = reclocation;
    }

   

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" + "name=" + name + ", num=" + num + ", location=" + location + ", recname=" + recname + ", recnum=" + recnum + ", reclocation=" + reclocation + ", weight=" + weight + ", date=" + date + '}';
    }
    
}
