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
public class ParteValvula extends ParteLavadora {

    public ParteValvula(Panel m) {
        super(m);
    }
    
    
    
    
    public void show(TipoRopa tp) {
        String mensaje = "Se utiliza ";
        switch (tp){
            case Algodon:
                mensaje += "Detergente y Suavizante";
                break;
            case Jeans:
                mensaje += "Suavizante";
                break;
            case Seda:
                mensaje += "Detergente";
                break;
            case Lino:
                mensaje += "Detergente";
                break;
            case Gabardina:
                mensaje += "Suavizante";
                break;
            case Batista:
                mensaje += "Detergente y Suavizante";
                break;
        }
        mensaje += " para "+tp.toString();
        System.out.println(mensaje);
    }
}
