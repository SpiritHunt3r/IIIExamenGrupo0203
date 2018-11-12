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
public class enviarSMS implements ICommand{

    private Receptor receptor;

    public enviarSMS() {
        this.receptor = new Receptor();
    }
    
    
    @Override
    public void ejecutar() {
        this.receptor.enviarSMS();
    }
    
}
