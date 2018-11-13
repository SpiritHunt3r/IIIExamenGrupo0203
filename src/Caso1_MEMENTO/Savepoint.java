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
    private Operacion opt;

    public Savepoint(double x, Operacion opt) {
        this.id = count++;
        this.x = x;
        this.opt = opt;
    }

    public double getX() {
        return x;
    }

    public Operacion getOpt() {
        return opt;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
