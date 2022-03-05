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
public class Destination {
    private int sNo;
    private String pickup;
    private String dropoff;
    private int distance;

    public Destination(int sNo, String pickup, String dropoff, int distance) {
        this.sNo = sNo;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.distance = distance;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

 

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    @Override
    public String toString() {
        return "Destination{" + "distance=" + distance + ", pickup=" + pickup + ", dropoff=" + dropoff + '}';
    }

    
}
