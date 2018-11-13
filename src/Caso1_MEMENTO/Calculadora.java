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
    private double x;
    private double y;
    private double z;
    private Historial hist = new Historial();

    
    
    public Calculadora(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.save(x,y,z,null);
    }

    
    
    
    public void OperarX (Operacion opt,double val){
        switch (opt){
            case Sumar:
                x += val;
                save (x,y,z,"Se sumo el valor "+val+" a X");
                break;
            case Restar:
                x -= val;
                save (x,y,z,"Se resto el valor "+val+" a X");
                break;
            case Dividir:
                x = x/val;
                save (x,y,z,"Se dividio el valor "+val+" a X");
                break;
            case Multiplicar:
                x *= val;
                save (x,y,z,"Se multiplico el valor "+val+" a X");
                break;
            case Elevar:
                x = Math.pow(x, val);
                save (x,y,z,"Se elevo el valor "+val+" a X");
                break;
            case Raiz:
                x = Math.sqrt(x);
                save (x,y,z,"Se obtuvo la raiz de X");
                break;
            }
    }
    
    
    public void OperarY (Operacion opt,double val){
        switch (opt){
            case Sumar:
                y += val;
                save (x,y,z,"Se sumo el valor "+val+" a Y");
                break;
            case Restar:
                y -= val;
                save (x,y,z,"Se resto el valor "+val+" a Y");
                break;
            case Dividir:
                y = y/val;
                save (x,y,z,"Se dividio el valor "+val+" a Y");
                break;
            case Multiplicar:
                y *= val;
                save (x,y,z,"Se multiplico el valor "+val+" a Y");
                break;
            case Elevar:
                y = Math.pow(y, val);
                save (x,y,z,"Se elevo el valor "+val+" a Y");
                break;
            case Raiz:
                y = Math.sqrt(y);
                save (x,y,z,"Se obtuvo la raiz de Y");
                break;
            }
    }
    
    
    public void OperarZ (Operacion opt,double val){
        switch (opt){
            case Sumar:
                z += val;
                save (x,y,z,"Se sumo el valor "+val+" a Z");
                break;
            case Restar:
                z -= val;
                save (x,y,z,"Se resto el valor "+val+" a Z");
                break;
            case Dividir:
                z = z/val;
                save (x,y,z,"Se dividio el valor "+val+" a Z");
                break;
            case Multiplicar:
                z *= val;
                save (x,y,z,"Se multiplico el valor "+val+" a Z");
                break;
            case Elevar:
                z = Math.pow(z, val);
                save (x,y,z,"Se elevo el valor "+val+" a Z");
                break;
            case Raiz:
                z = Math.sqrt(z);
                save (x,y,z,"Se obtuvo la raiz de Z");
                break;
            }
    }
    
    

    public void setX(double x) {
        this.x = x;
        save (x,y,z,"Asigano el valor "+x+" a X");
    }

    public void setY(double y) {
        this.y = y;
        save (x,y,z,"Asigano el valor "+y+" a Y");
    }

    
    public void setZ(double z) {
        this.z = z;
        save (x,y,z,"Asigano el valor "+z+" a Z");
    }

    public void save(double a, double b, double c, String opt) {
        Savepoint s = new Savepoint(a,b,c,opt);
        if (opt!=null){
            System.out.println(opt);
        }
        System.out.println(this.estadoActual());
        System.out.println("Calculadora: Guardando estado actual #"+s.getId()+"\n");
        hist.addSavepoint(s);
    }
    
    
    public void deshacer() {
        Savepoint m = hist.getSavepoint();
        printRestore(m);
    }
    
    public void deshacer(int i) {
        Savepoint m = hist.getSavepoint(i);
        printRestore(m);
    }
    
    
    public void reiniciar() {
        Savepoint m = hist.reiniciar();
        printRestore(m);
    }
    
    private void printRestore(Savepoint m){
        String opt = m.getOpt();
        if (opt!=null){
            System.out.println("\n---------------------------------------------------");
            System.out.println("Estado Actual: "+this.estadoActual());
            x = m.getX();
            y = m.getY();
            z = m.getZ();
            System.out.println("Calculadora: Restaurando al Savepoint #"+ m.getId()+" : Donde se "+ opt);
            System.out.println("Estado Actual: "+this.estadoActual());
            System.out.println("---------------------------------------------------\n\n");
        }
        else{
            System.out.println("\n---------------------------------------------------");
            System.out.println(this.estadoActual());
            x = m.getX();
            y = m.getY();
            z = m.getZ();
            System.out.println("Calculadora: Restauranda al Savepoint Inicial");
            System.out.println(this.estadoActual());
            System.out.println("---------------------------------------------------\n\n");
        }
    }
    
    public String estadoActual(){
        return "X= "+x+"\t\tY= "+y+"\t\tZ= "+z;
    }

    
}

