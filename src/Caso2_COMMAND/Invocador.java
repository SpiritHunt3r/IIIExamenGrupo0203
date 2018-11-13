/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_COMMAND;
/**
 *
 * @author ayma-93
 */
public class Invocador{
    
    private ICommand orden ;

    public Invocador(ICommand orden) {
        this.orden = orden;
    }

    public void run() {
        
        //super.run();
        orden.ejecutar();
        
    }
     
    
}
