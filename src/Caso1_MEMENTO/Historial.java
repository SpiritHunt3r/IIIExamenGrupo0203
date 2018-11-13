/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_MEMENTO;

import java.util.ArrayList;

/**
 *
 * @author juan_
 */
public class Historial {
    private ArrayList<Savepoint> savepoints = new ArrayList<>();

    public void addSavepoint(Savepoint m) {
        savepoints.add(m);
    }

    
    //Deshacer Simple
    public Savepoint getSavepoint() {
        return savepoints.get(savepoints.size()-2);
    }
    
    //Deshacer Especifico
    public Savepoint getSavepoint(int i) {
        return savepoints.get(savepoints.size()-1-i);
    }
    
    //Desgacer Completo
    public Savepoint restore() {
        return savepoints.get(0);
    }
}
