/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0203;

import Caso4_CHAIN_OF_RESPONSABILITY.*;

/**
 *
 * @author juan_
 */
public class IIIExamenGrupo0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        // Inicia Caso 4 - Chain of Responsability
        
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
