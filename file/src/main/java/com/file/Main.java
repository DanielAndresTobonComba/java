package com.file;

import java.io.File; // Importar la clase file 

public class Main {
    public static void main(String[] args) {

        String paquete = "file/src/main/java/com/file/Data"; //Esta seria la ruta
        String file = "contenido.txt"; //Nombre del archivo


        File carpeta = new File(paquete); //Transformo el paquete a objeto "ruta"

        //carpeta.mkdirs();
        
        File archivo = new File(carpeta,file); // Creo un objeto la una ruta - nombre del file/archivo
        

        try {
            if(archivo.createNewFile()){
                System.out.println("Archivo creado: " + archivo.getName());
            }else{
                System.out.println("EL archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }




    }
}