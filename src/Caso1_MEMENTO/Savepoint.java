package Caso1_MEMENTO;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan_
 */
public class Savepoint {
    private static int count =0;
    private int id;
    private double x;
    private double y;
    private double z;
    private Operacion opt;

    public Savepoint(double y,double z,double x, Operacion opt) {
        this.id = count++;
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
    
    public Operacion getOpt() {
        return opt;
    }

    public int getId() {
        return id;
    }
    
    
    
    
    
}
