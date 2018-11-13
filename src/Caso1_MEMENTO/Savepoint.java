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
    private double x;
    private Operacion opt;

    public Savepoint(double x, Operacion opt) {
        this.x = x;
        this.opt = opt;
    }

    public double getX() {
        return x;
    }

    public Operacion getOpt() {
        return opt;
    }
    
    
    
    
}
