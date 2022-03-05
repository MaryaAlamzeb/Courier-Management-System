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
public class Packagesmy {
    private String name;
    private int dis;

    public Packagesmy(String name, int dis) {
        this.name = name;
        this.dis = dis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "{" + "" + name + '}';
    }

    
    
}
