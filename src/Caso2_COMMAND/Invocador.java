/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_COMMAND;

import java.util.ArrayList;

/**
 *
 * @author ayma-93
 */
public class Invocador{
    
    private ArrayList<ICommand> procesos ;

    public Invocador() {
        procesos = new ArrayList<>();
    }

    public void run() {
        
        //super.run();
        procesos.forEach((proceso) -> {
            System.out.println("");
            proceso.ejecutar();
        });
        
    }
     
    public void addProceso(ICommand proceso){
        procesos.add(proceso);
    }
    
}
