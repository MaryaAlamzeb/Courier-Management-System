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
public class RegisteredCustomer {
    private int Sno;
    private String name;
    private int regNo;
    private String date;

    public RegisteredCustomer(int Sno, String name, int regNo, String date) {
        this.Sno = Sno;
        this.name = name;
        this.regNo = regNo;
        this.date = date;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int Sno) {
        this.Sno = Sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RegisteredCustomer{" + "Sno=" + Sno + ", name=" + name + ", regNo=" + regNo + ", date=" + date + '}';
    }
    
}
