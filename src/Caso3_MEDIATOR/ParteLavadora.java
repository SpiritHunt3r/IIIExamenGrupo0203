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
public abstract class ParteLavadora{

    protected boolean firstExec;
    private Panel mediator;
    
    public ParteLavadora(Panel m) {
      mediator = m;
    }
    
    
    public void iniciar(TipoRopa tp) {
     mediator.iniciar(tp);
    }
    
  public Panel getMediator() {return mediator;}
  public abstract void exec(TipoRopa tp);
  public abstract boolean isFirstExec();
  public abstract void setFirstExec(boolean firtExec);
  
}
