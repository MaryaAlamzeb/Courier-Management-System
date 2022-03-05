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
public class CourierN {
    
    private String origin;
    private String courier_type;
     private String destination;
     private double weight;

    public CourierN(String origin, String courier_type, String destination, double weight) {
        this.origin = origin;
        this.courier_type = courier_type;
        this.destination = destination;
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCourier_type() {
        return courier_type;
    }

    public void setCourier_type(String courier_type) {
        this.courier_type = courier_type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CourierN{" + "origin=" + origin + ", courier_type=" + courier_type + ", destination=" + destination + ", weight=" + weight + '}';
    }

  

 

   
     
}
