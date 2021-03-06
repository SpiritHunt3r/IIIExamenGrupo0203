/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0203;

import Caso1_MEMENTO.Calculadora;
import Caso1_MEMENTO.Historial;
import Caso1_MEMENTO.Operaciones;
import Caso2_COMMAND.*;

import Caso3_MEDIATOR.ConfiguracionLavadora;
import Caso3_MEDIATOR.ParteCalentador;
import Caso3_MEDIATOR.ParteTambor;
import Caso3_MEDIATOR.ParteValvula;
import Caso3_MEDIATOR.TipoRopa;

import Caso4_CHAIN_OF_RESPONSABILITY.*;

import java.util.ArrayList;
/**
 *
 * @author juan_
 */
public class IIIExamenGrupo0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Inicia Caso 1 - Memento
        System.out.println("------------------------------------------");
        System.out.println("Ejecucion del Caso 1 - Memento");
        System.out.println("------------------------------------------");
        //Cuando se crea la calculadora se guarda el estado inicial
        Calculadora calc = new Calculadora(0,1,2);
        calc.setX(25);
        calc.setY(40);
        calc.setZ(77);
        calc.OperarX(Operaciones.Raiz, 0);
        calc.deshacer();
        calc.OperarY(Operaciones.Sumar, 1231);
        calc.OperarZ(Operaciones.Restar, 5554);
        calc.setY(444);
        //Salva el primer save point
        calc.save();
        calc.OperarY(Operaciones.Dividir, 4);
        calc.setX(44);
        calc.setY(55);
        //Salva el segundo save point
        calc.save();
        calc.setZ(66);
        calc.OperarX(Operaciones.Multiplicar, 32);
        calc.OperarY(Operaciones.Dividir, 131);
        calc.OperarZ(Operaciones.Elevar, 2);
        //Salva el tercer save point
        calc.save();
        calc.OperarX(Operaciones.Sumar, 444);
        //Salva el cuarto save point
        calc.save();
        calc.deshacer(2);
        calc.deshacer(4);
        calc.deshacer(3);
        calc.OperarX(Operaciones.Restar, 1024);
        calc.reiniciar();
        calc.setZ(66);
        calc.OperarX(Operaciones.Multiplicar, 32);
        calc.OperarY(Operaciones.Dividir, 131);
        calc.OperarZ(Operaciones.Elevar, 2);
        //Salva el primero save point
        calc.save();
        calc.OperarZ(Operaciones.Raiz, 0);
        
        //Fin Caso 1
        
        //Inicia Caso 2 - Command
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Ejecucion del Caso 2 - Command");
        System.out.println("------------------------------------------");
        
        
        // Se instancia el receptor que tiene las funcionalidades de los concrete commands
        Receptor receptor = new Receptor();
               
        //Crear concrete commands
        
        ICommand enviarCorreo1 = new enviarCorreo(receptor);
        ICommand enviarCorreo2 = new enviarCorreo(receptor);
        
        ICommand enviarSMS1 = new enviarSMS(receptor);
        ICommand enviarSMS2 = new enviarSMS(receptor);
        
        ICommand repCancion1 = new reproducirCancion(receptor);
        ICommand repCancion2 = new reproducirCancion(receptor);
        
        ICommand abrirGaleria = new abrirGaleria(receptor);
        
        //Se crea el invocador
        Invocador invoker = new Invocador();
        
        //Se agregan procesos a la cola
        invoker.addProceso(enviarCorreo1);
        invoker.addProceso(enviarSMS1);
        invoker.addProceso(repCancion1);
        invoker.addProceso(enviarCorreo2);
        invoker.addProceso(abrirGaleria);
        invoker.addProceso(repCancion2);
        invoker.addProceso(enviarSMS2);
        
        //Se ejecuta el invocador
        invoker.run();
        
        //Fin Caso 2
      
        // Inicia Caso 3 - Mediator 
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Ejecucion del Caso 3 - Mediator");
        System.out.println("------------------------------------------");
        //Tipo de Ropa para lavar
        TipoRopa seleccionada = TipoRopa.Jeans;


        
        //Se carga la configuracion al mediador
        ConfiguracionLavadora config = new ConfiguracionLavadora();
        ParteTambor tambor = new ParteTambor(config);
        config.addParte(tambor);
        ParteCalentador calentador = new ParteCalentador(config);
        config.addParte(calentador);
        ParteValvula valvula = new ParteValvula(config);
        config.addParte(valvula);
        //Se imprime la configuracion
        config.iniciar(seleccionada);
        
        // Fin Caso 3
        
        
        
        // Inicia Caso 4 - Chain of Responsability
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Ejecucion del Caso 4 - Chain of Responsability");
        System.out.println("------------------------------------------");
        
        //Los tipos de archivos aceptados son "Texto", "Documento", "Imagen", "Audio", "Video"
        
        Archivo archivo;
        
        Handler manejadorTexto = new HandlerTexto("Manejador de Archivos de Texto");
        Handler manejadorDocumento = new HandlerDocumento("Manejador de Documentos");
        Handler manejadorImagen = new HandlerImagen("Manejador de Imagenes");
        Handler manejadorAudio = new HandlerAudio("Manejador de Audios");
        Handler manejadorVideo = new HandlerVideo("Manejador de Videos");
        
        manejadorTexto.setSiguienteHandler(manejadorDocumento);
        manejadorDocumento.setSiguienteHandler(manejadorImagen);
        manejadorImagen.setSiguienteHandler(manejadorAudio);
        manejadorAudio.setSiguienteHandler(manejadorVideo);
        
        System.out.println("");
        archivo = new Archivo("ArchivoPruebaTexto.txt", "Texto");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        
        System.out.println("");
        
        archivo = new Archivo("ArchivoPruebaAudio.mp3", "Audio"); 
        System.out.println("Procesando " +archivo.getNombre());       
        manejadorTexto.procesar(archivo);
        System.out.println("");
        
        archivo = new Archivo("ArchivoPruebaVideo.mpg", "Video"); 
        System.out.println("Procesando " +archivo.getNombre());       
        manejadorTexto.procesar(archivo);
        System.out.println("");
        
        archivo = new Archivo("ArchivoPruebaDocumento.pdf", "Documento");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("");
       
        archivo = new Archivo("ArchivoPruebaImagen.jpg", "Imagen");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("");
        
        archivo = new Archivo("ArchivoPruebaOTRO.otro", "OTRO");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("");
        
        // Fin Caso 4
        
    }
    
}
