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
public class HandlerTexto implements Handler {
    
    private Handler siguiente;
    private String nombre;

    public HandlerTexto(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void procesar(Archivo archivo) {
        
        if (archivo.getTipo().equals("Texto")) {
            
            System.out.println("Procesando y guardando la información del archivo de texto "+ archivo.getNombre() +" ... Encargado : "+nombre);
            
        } else if ( siguiente != null ){
            
            System.out.println(nombre + " le pasa la solicitud de procesar a " + siguiente.getNombre()+" ...");
            siguiente.procesar(archivo);
            
        } else {
            System.out.println("El archivo no puede ser procesado.");
        }
        
    }

    @Override
    public void setSiguienteHandler(Handler siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
