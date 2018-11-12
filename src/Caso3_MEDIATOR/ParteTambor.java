/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_MEDIATOR;

/**
 *
 * @author juan_
 */
public class ParteTambor extends ParteLavadora{

     boolean firstExec = true;
    
    
    public ParteTambor(Panel m) {
        super(m);
    }

    public boolean isFirstExec() {
        return firstExec;
    }

    public void setFirstExec(boolean firtExec) {
        this.firstExec = firtExec;
    }

   

    
    public void exec(TipoRopa tp) {
        if (firstExec){
            System.out.println("Tambor Encendido....");
            System.out.println("Tambor Iniciado...");
            System.out.println("Tambor Girando..........");
        }
        else{
            System.out.println("Deteniendo Tambor..........");
            System.out.println("Apagando Tambor....");
        }
    }

    
    
}
