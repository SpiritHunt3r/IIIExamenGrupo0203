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

    public ParteTambor(Panel m) {
        super(m);
    }

   

    
    public void show(TipoRopa tp) {
        String mensaje = "Se utilizanran ";
        switch (tp){
            case Algodon:
                mensaje += "4";
                break;
            case Jeans:
                mensaje += "9";
                break;
            case Seda:
                mensaje += "2";
                break;
            case Lino:
                mensaje += "3";
                break;
            case Gabardina:
                mensaje += "8";
                break;
            case Batista:
                mensaje += "10";
                break;
        }
        mensaje += " Litros de agua para "+tp.toString();;
        System.out.println(mensaje);
    }

    
    
}
