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
public class Courier {
    private double courierId;
    private double courier_Product_Id;
    private double courier_Customer_tId;
    private String courier_name;
    private String courier_type;
    private double courier_price;
      private String courier_description;

    public Courier(double courierId, double courier_Product_Id, double courier_Customer_tId, String courier_name, String courier_type, double courier_price, String courier_description) {
        this.courierId = courierId;
        this.courier_Product_Id = courier_Product_Id;
        this.courier_Customer_tId = courier_Customer_tId;
        this.courier_name = courier_name;
        this.courier_type = courier_type;
        this.courier_price = courier_price;
        this.courier_description = courier_description;
    }

    public double getCourier_price() {
        return courier_price;
    }

    public void setCourier_price(double courier_price) {
        this.courier_price = courier_price;
    }

    

    public double getCourierId() {
        return courierId;
    }

    public void setCourierId(double courierId) {
        this.courierId = courierId;
    }

    public double getCourier_Product_Id() {
        return courier_Product_Id;
    }

    public void setCourier_Product_Id(double courier_Product_Id) {
        this.courier_Product_Id = courier_Product_Id;
    }

    public double getCourier_Customer_tId() {
        return courier_Customer_tId;
    }

    public void setCourier_Customer_tId(double courier_Customer_tId) {
        this.courier_Customer_tId = courier_Customer_tId;
    }

    public String getCourier_name() {
        return courier_name;
    }

    public void setCourier_name(String courier_name) {
        this.courier_name = courier_name;
    }

    public String getCourier_type() {
        return courier_type;
    }

    public void setCourier_type(String courier_type) {
        this.courier_type = courier_type;
    }

    public String getCourier_description() {
        return courier_description;
    }

    public void setCourier_description(String courier_description) {
        this.courier_description = courier_description;
    }
      
    
    
    
    
    
    
    
}
