/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_MEDIATOR;

import java.util.Random;

/**
 *
 * @author juan_
 */
public class ParteCalentador extends ParteLavadora {

     
    
    
    public ParteCalentador(Panel m) {
        super(m);
        super.firstExec = true;
    }

    public boolean isFirstExec() {
        return super.firstExec;
    }

    public void setFirstExec(boolean firtExec) {
        super.firstExec = firtExec;
    }
    
    
   
    public void exec(TipoRopa tp) {
        String exe="";
        if (firstExec){
            exe += "Calentador encendido....\n";
            exe += "Obteniendo temperatura actual...\n";
            exe += "Ajustando temperatura hasta ";
            switch (tp){
                case Algodon:
                    exe += "25 grados para "+tp.toString();
                    break;
                case Seda:
                    exe += "20 grados para "+tp.toString();
                    break;
                case Lino:
                    exe += "35 grados para "+tp.toString();
                    break;
                case Gabardina:
                    exe += "45 grados para "+tp.toString();
                    break;
                case Batista:
                    exe += "10 grados para "+tp.toString();
                    break;
                default:
                    exe += "30 grados para "+tp.toString();
                    break;
            }
            exe += "\nTemperatura lista...\n";
            exe += "Apagando Calentador...\n";
        }
        else{
            exe += "Calentador encendido....\n";
            exe += "Obteniendo temperatura actual...\n";
            Random aleatorio = new Random(System.currentTimeMillis());
            int intAletorio = aleatorio.nextInt(10);
            if (intAletorio <= 5){
                exe += "Temperatura Incorrecta...\n";
                exe += "Ajustando temperatura a ";
                switch (tp){
                    case Algodon:
                        exe += "25 grados para "+tp.toString();
                        break;
                    case Seda:
                        exe += "20 grados para "+tp.toString();
                        break;
                    case Lino:
                        exe += "35 grados para "+tp.toString();
                        break;
                    case Gabardina:
                        exe += "45 grados para "+tp.toString();
                        break;
                    case Batista:
                        exe += "10 grados para "+tp.toString();
                        break;
                    default:
                        exe += "30 grados para "+tp.toString();
                        break;
                }
            }
            else{
                exe += "Temperatura Correcta...";
                
            }
            exe += "\nApagando Calentador...\n";
        }
        System.out.println(exe);
    }

   

  
}
