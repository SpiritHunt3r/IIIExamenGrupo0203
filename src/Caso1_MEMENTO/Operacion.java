/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_MEMENTO;

/**
 *
 * @author juan_
 */
public class Operacion {
    private double x;
    private double y;
    private double z;
    private String opt;

    public Operacion(double x,double y,double z,String opt) {
        this.y = y;
        this.z = z;
        this.x = x;
        this.opt = opt;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getOpt() {
        return opt;
    }
    
    
}
