/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0203;

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
        
        //Inicia Caso 2 - Command
        
        //Crear cola
        ArrayList<ICommand> queue = new ArrayList<>();
        
        //Crear concrete commands
        
        ICommand enviarCorreo1 = new enviarCorreo();
        ICommand enviarCorreo2 = new enviarCorreo();
        
        ICommand enviarSMS1 = new enviarSMS();
        ICommand enviarSMS2 = new enviarSMS();
        
        ICommand repCancion1 = new reproducirCancion();
        ICommand repCancion2 = new reproducirCancion();
        
        ICommand abrirGaleria = new abrirGaleria();
        
        queue.add(enviarCorreo1);
        queue.add(enviarSMS1);
        queue.add(repCancion1);
        queue.add(enviarCorreo2);
        queue.add(abrirGaleria);
        queue.add(repCancion2);
        queue.add(enviarSMS2);
        
        // Crear invocador
        Invocador invoker;
        
        //Ejecutar el invocador con cada accion en la cola
        for (ICommand comando : queue) {
            invoker = new Invocador(comando);
            invoker.run();
        }
        
        //Fin Caso 2
      
        // Inicia Caso 3 - Mediator 
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Ejecucion del Caso 3 - Mediator");
        System.out.println("------------------------------------------");
        //Tipo de Ropa para lavar
        TipoRopa seleccionada = TipoRopa.Algodon;


        
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
        
        System.out.println("\n");
        archivo = new Archivo("ArchivoPruebaTexto.txt", "Texto");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        
        System.out.println("\n");
        
        archivo = new Archivo("ArchivoPruebaAudio.mp3", "Audio"); 
        System.out.println("Procesando " +archivo.getNombre());       
        manejadorTexto.procesar(archivo);
        System.out.println("\n");
        
        archivo = new Archivo("ArchivoPruebaVideo.mpg", "Video"); 
        System.out.println("Procesando " +archivo.getNombre());       
        manejadorTexto.procesar(archivo);
        System.out.println("\n");
        
        archivo = new Archivo("ArchivoPruebaDocumento.pdf", "Documento");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("\n");
        
        archivo = new Archivo("ArchivoPruebaImagen.jpg", "Imagen");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("\n");
        
        archivo = new Archivo("ArchivoPruebaOTRO.otro", "OTRO");
        System.out.println("Procesando " +archivo.getNombre());
        manejadorTexto.procesar(archivo);
        System.out.println("\n");
        
        // Fin Caso 4
        
    }
    
}
