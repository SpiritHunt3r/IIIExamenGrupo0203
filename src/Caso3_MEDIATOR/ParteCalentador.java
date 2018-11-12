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
public class ParteCalentador extends ParteLavadora {

    public ParteCalentador(Panel m) {
        super(m);
    }
    
    
   
    public void show(TipoRopa tp) {
        String mensaje = "Temperatura ";
        switch (tp){
            case Algodon:
                mensaje += "10°";
                break;
            case Jeans:
                mensaje += "15°";
                break;
            case Seda:
                mensaje += "30°";
                break;
            case Lino:
                mensaje += "-1°";
                break;
            case Gabardina:
                mensaje += "5°";
                break;
            case Batista:
                mensaje += "18°";
                break;
        }
        mensaje += " para el agua del tambor para "+tp.toString();
        System.out.println(mensaje);
    }
}
