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
    private ArrayList<Operacion> operations = new ArrayList<>();
    
    
    
    public void addOperation(Operacion m) {
        operations.add(m);
    }

    public void addSavepoint(Savepoint m) {
        savepoints.add(m);
    }
    
    
    //Deshacer Simple
    public Operacion getSavepoint() {
        
        if (operations.size() <= 1)
            return operations.get(0);
        operations.remove(operations.size()-1);
        return operations.get(operations.size()-1);
    }
    
    //Deshacer Especifico
    public Savepoint getSavepoint(int i) {
        if (i>=savepoints.size()){
            return savepoints.get(0);
        }
        return savepoints.get(i);
    }
    
    //Desgacer Completo
    public Savepoint reiniciar() {
        Savepoint s = savepoints.get(0);
        savepoints.clear();
        savepoints.add(s);
        Savepoint.setCount(1);
        return s;
    }
}
