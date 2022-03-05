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
public class RateList {
    private String type;
    private float weight;
    private float rate;

    public RateList(String type, float weight, float rate) {
        this.type = type;
        this.weight = weight;
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "RateList{" + "type=" + type + ", weight=" + weight + ", rate=" + rate + '}';
    }
    
    
    
}
