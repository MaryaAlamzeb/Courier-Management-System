/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OurOOPProject;

import Project2020.Project2020.*;

/**
 *
 * @author Marya Alamzeb
 */
public class Packages {
    private String packageName;
    private String discount;

    public Packages(String packageName, String discount) {
        this.packageName = packageName;
        this.discount = discount;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "PackageName : " + packageName + "\n"+ "Discount -- " + discount ;
    }
    
}
