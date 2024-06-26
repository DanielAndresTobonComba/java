package com.taskfilemanager;

import java.io.File;
import java.nio.file.Path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;


public class Controller {

    private static final String FILE_NAME = "tasks.txt";

    public static File crearArchivo (){

        Path path, rutaPaquete;
        File archivo = null;
        

        try {

            path = Paths.get(Controller.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();


            Path projectDir = path.getParent();

            rutaPaquete = projectDir.resolve(Paths.get("src", "main", "java", "com", "taskfilemanager", "data"));

            File carpeta = rutaPaquete.toFile();

            archivo = new File(carpeta, FILE_NAME);


            // Crear la carpeta si no existe
            if (!carpeta.exists()) {
                if (carpeta.mkdirs()) {
                    System.out.println("Carpeta creada: " + carpeta.getAbsolutePath());
                } else {
                    System.out.println("Error al crear la carpeta.");
                    
                }
            }


            // Crear el archivo si no existe
            if (!archivo.exists()) {
                try {
                    if (archivo.createNewFile()) {
                        System.out.println("Archivo de tareas creado: " + archivo.getName());
                    } else {
                        System.out.println("Error al crear el archivo de tareas.");
                        
                    }
                } catch (IOException e) {
                    System.out.println("Error al crear el archivo");
                    e.printStackTrace();
                }
            }

            return archivo;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        

        return archivo;

    }

    public static void agregarTarea(File archivo, String tarea) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), StandardCharsets.UTF_8))) {
            writer.write(tarea);
            writer.newLine();
            System.out.println("Tarea agregada: " + tarea);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al agregar la tarea.");
            e.printStackTrace();
        }
        }
    
        public static void listarTareas(File archivo) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo, StandardCharsets.UTF_8))) {
                String tarea;
                System.out.println("\nLista de Tareas:");
                while ((tarea = reader.readLine()) != null) {
                    System.out.println(tarea);
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al listar las tareas.");
                e.printStackTrace();
            }
        }
    
        public static void buscarTarea(File archivo, String tareaBuscada) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo, StandardCharsets.UTF_8))) {
                String tarea;
                boolean encontrada = false;
                while ((tarea = reader.readLine()) != null) {
                    if (tarea.contains(tareaBuscada)) {
                        System.out.println("Tarea encontrada: " + tarea);
                        encontrada = true;
                        break;
                    }
                }
                if (!encontrada) {
                    System.out.println("Tarea no encontrada.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al buscar la tarea.");
                e.printStackTrace();
            }
        }
    
        public static void eliminarTarea(File archivo, String tareaEliminar) {
            File tempFile = new File(archivo.getAbsolutePath() + ".tmp");
            boolean eliminada = false;
    
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo, StandardCharsets.UTF_8));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8))) {
                String tarea;
                while ((tarea = reader.readLine()) != null) {
                    if (tarea.equals(tareaEliminar)) {
                        eliminada = true;
                        continue;
                    }
                    writer.write(tarea);
                    writer.newLine();
                }
                if (!eliminada) {
                    System.out.println("Tarea no encontrada para eliminar.");
                } else {
                    System.out.println("Tarea eliminada: " + tareaEliminar);
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al eliminar la tarea.");
                e.printStackTrace();
            }
    
            // Reemplazar el archivo original con el archivo temporal
            if (!archivo.delete()) {
                System.out.println("Error al eliminar el archivo original.");
                return;
            }
            if (!tempFile.renameTo(archivo)) {
                System.out.println("Error al renombrar el archivo temporal.");
            }
            
        }
    

}
