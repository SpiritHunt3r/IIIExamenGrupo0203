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
      System.out.println("Inicia el proceso de Lavado");
      System.out.println("Se realiza conexion con la Valvula para el agua");
      for(ParteLavadora parte: partes) {
          if (parte.getClass().equals(ParteValvula.class)){
              parte.exec(tp);
              parte.setFirstExec(false);
          }
      }
      System.out.println("Se realiza conexion con el Calentador");
      for(ParteLavadora parte: partes) {
          if (parte.getClass().equals(ParteCalentador.class)){
              parte.exec(tp);
              parte.setFirstExec(false);
          }
      }
      System.out.println("Se realiza conexion con la Valvula para los extras");
      for(ParteLavadora parte: partes) {
          if (parte.getClass().equals(ParteValvula.class)){
              parte.exec(tp);
          }
      }
      System.out.println("Se realiza conexion con el Tambor");
      for(ParteLavadora parte: partes) {
          if (parte.getClass().equals(ParteTambor.class)){
              parte.exec(tp);
              parte.setFirstExec(false);
          }
      }
      System.out.println("\nInicio de Tiempo de Lavado en ejecucion...\n");
      //Suponiendo que se ejecuta durante 5 min
      for (int i=0;i<5;i++){
          System.out.println("Checkeo de Temperatura #"+(i+1));
          for(ParteLavadora parte: partes) {
              if (parte.getClass().equals(ParteCalentador.class)){
                  parte.exec(tp);
              }
          }
      }
      System.out.println("\nFin de Tiempo de Lavado...\n");
      System.out.println("Se realiza conexion con el Tambor");
      for(ParteLavadora parte: partes) {
          if (parte.getClass().equals(ParteTambor.class)){
              parte.exec(tp);
          }
      }
      System.out.println("Eliminando Desechos...");
      System.out.println("Fin del proceso de Lavado");
  }
  
  

}
