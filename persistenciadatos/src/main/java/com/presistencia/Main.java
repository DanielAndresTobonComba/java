package com.presistencia;

import java.io.File; // import del file
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser; // import del javax.swing

public class Main {
    public static void main(String[] args) {

        /* 

        // Escoger un archivo que esta guardado para ejcutarlo

        //Pero aca solo obtengo la ruta 

        JFileChooser j = new JFileChooser(); // froam simple 

        // javax.swing.JFileChooser j = new  javax.swing.JFileChooser(); 

        try {

            j.showOpenDialog(j);

            String path = j.getSelectedFile().getAbsolutePath(); 
    
            System.out.println(path);
            
        } catch (Exception e) {
        System.out.println("No se seleccion ningun archivo");
        }
        */

        // Crear un archivo y modificar sus datos
        /* 
        try {

            File variableArchivo = new File("data.txt"); // Abrir el archivo
            FileWriter writer = new FileWriter(variableArchivo);
            PrintWriter pw = new PrintWriter(writer , true); 

            pw = new PrintWriter(writer);
            //pw.append("ajajajajajaja"); // Agregar
            pw.println("Esto es una linea de texto"); 
            writer.close();


            
            // Cerrar archivo

        } catch (Exception e) {
           System.out.println("No se selecciono un archivo");
        }
        */


        
       
    }
}