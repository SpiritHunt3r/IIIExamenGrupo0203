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
    
    boolean firstExec = true;

    public ParteValvula(Panel m) {
        super(m);
    }

    public boolean isFirstExec() {
        return firstExec;
    }

    public void setFirstExec(boolean firtExec) {
        this.firstExec = firtExec;
    }
    
    
    
    
    public void exec(TipoRopa tp) {
        String exe="";
        if (firstExec){
            exe += "Valvula encendida....\n";
            exe += "Conexion realizada con la bomba de agua...\n";
            exe += "Llenando el tanque hasta ";
            switch (tp){
                case Algodon:
                    exe += "5 litros para "+tp.toString();
                    break;
                case Seda:
                    exe += "6 litros para "+tp.toString();
                    break;
                case Lino:
                    exe += "7 litros para "+tp.toString();
                    break;
                case Gabardina:
                    exe += "7 litros para "+tp.toString();
                    break;
                case Batista:
                    exe += "8 litros para "+tp.toString();
                    break;
                default:
                    exe += "10 litros para "+tp.toString();
                    break;
            }
            exe += "\nTanque listo...\n";
            exe += "Cerrando Valvula...\n";
        }
        else{
            exe += "Valvula encendida....\n";
            exe += "Conexion realizada con el almacenamiento de detergente y suavizante...\n";
            exe += "Añadiendo ";
            switch (tp){
                case Algodon:
                    exe += "detergente y suavisante para "+tp.toString();
                    break;
                case Seda:
                    exe += "detergente y suavisante para "+tp.toString();
                    break;
                case Lino:
                    exe += "detergente para "+tp.toString();
                    break;
                case Gabardina:
                    exe += "detergente para "+tp.toString();
                    break;
                case Batista:
                    exe += "suavisante para "+tp.toString();
                    break;
                default:
                    exe += "suavisante para "+tp.toString();
                    break;
            }
            exe += "\nExtras añadidos...\n";
            exe += "Cerrando Valvula...\n";
        }
        System.out.println(exe);
    }
}
