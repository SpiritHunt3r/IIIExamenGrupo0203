/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_MEMENTO;

/**
 *
 * @author juan_
 */
public class Calculadora {
    private double x=0;
    private Operacion opt=null;
   
   
    
    
    
    public void aplicarOperacion(Operacion opt,double val){
        this.opt = opt;
        System.out.println("Valor actual de X = "+x);
        if (opt != Operacion.Raiz)
        System.out.println("Valor a operar = "+val);
        switch (opt){
            case Sumar:
                x += val;
                System.out.println("Se aplico suma a X = "+x);
                break;
            case Restar:
                x -= val;
                System.out.println("Se aplico resta a X = "+x);
                break;
            case Dividir:
                x = x/val;
                System.out.println("Se aplico division a X = "+x);
                break;
            case Multiplicar:
                x *= val;
                System.out.println("Se aplico multiplicacion a X = "+x);
                break;
            case Elevar:
                x = Math.pow(x, val);
                System.out.println("Se elevo X = "+x);
                break;
            case Raiz:
                x = Math.sqrt(x);
                System.out.println("Se aplico raiz a X = "+x);
                break;
        }
        
        System.out.println("");
    }

    public Savepoint save() {
        Savepoint s = new Savepoint(x,opt);
        System.out.println("Calculadora: Guardando estado actual de X como #"+s.getId()+"\n");
        return s;
    }
    public void restore(Savepoint m) {
        x = m.getX();
        opt = m.getOpt();
        if (opt!=null)
        System.out.println("Calculadora: Restaurando al Savepoint #"+ m.getId()+" : X = " + x + " y la Operacion realizada para obtener valor fue "+m.getOpt()+"\n");
        if (opt==null)
        System.out.println("Calculadora: Restauranda al Savepoint Inicial: X = " + x +"\n");
    }
}

