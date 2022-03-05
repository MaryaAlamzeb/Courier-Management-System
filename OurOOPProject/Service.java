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
public class Service {
    private int sn;
    private String pickup;
    private String dropOff;
    private int dis;

    public Service(int sn, String pickup, String dropOff, int dis) {
        this.sn = sn;
        this.pickup = pickup;
        this.dropOff = dropOff;
        this.dis = dis;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Service{" + "sn=" + sn + ", pickup=" + pickup + ", dropOff=" + dropOff + ", distance=" + dis + '}';
    }
     
}
