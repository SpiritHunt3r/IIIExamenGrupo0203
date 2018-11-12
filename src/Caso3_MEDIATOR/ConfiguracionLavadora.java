/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_MEDIATOR;

import java.util.ArrayList;

/**
 *
 * @author juan_ 
 */
public class ConfiguracionLavadora implements Panel {
  private ArrayList<ParteLavadora> partes;
  public ConfiguracionLavadora() {
    partes = new ArrayList<ParteLavadora>();
  }
  public void addParte(ParteLavadora parte) {
    partes.add(parte);
  }
  
  public void iniciar(TipoRopa tp) {
    for(ParteLavadora parte: partes) {
        parte.show(tp);
    }
  }
  
  

}
