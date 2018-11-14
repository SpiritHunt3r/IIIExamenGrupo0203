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
public class enviarCorreo implements ICommand{
    
    private Receptor receptor;

    public enviarCorreo(Receptor receptor) {
        this.receptor = receptor;
    }
    
    @Override
    public void ejecutar() {
        
        this.receptor.enviarCorreo();
        
    }
    
}
