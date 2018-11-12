/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_CHAIN_OF_RESPONSABILITY;

/**
 *
 * @author ayma-93
 */
public interface Handler {
    
    public void procesar(Archivo archivo);
    public void setSiguienteHandler(Handler siguiente);
    public String getNombre();
    
    
}
