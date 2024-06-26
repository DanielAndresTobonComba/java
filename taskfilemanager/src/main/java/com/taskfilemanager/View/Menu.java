package com.taskfilemanager.View;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.taskfilemanager.Controller;

public class Menu {

    public static void start(File archivo){

        Scanner scanner = new Scanner(System.in);

        int opcion;
            do {
                System.out.println("\nGestor de Tareas");
                System.out.println("1. Agregar Tarea");
                System.out.println("2. Listar Tareas");
                System.out.println("3. Buscar Tarea");
                System.out.println("4. Eliminar Tarea");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Escribe la tarea a agregar: ");
                        String nuevaTarea = scanner.nextLine();
                        Controller.agregarTarea(archivo, nuevaTarea);
                        break;
                    case 2:
                        Controller.listarTareas(archivo);
                        break;
                    case 3:
                        System.out.print("Escribe la tarea a buscar: ");
                        String tareaBuscar = scanner.nextLine();
                        Controller.buscarTarea(archivo, tareaBuscar);
                        break;
                    case 4:
                        System.out.print("Escribe la tarea a eliminar: ");
                        String tareaEliminar = scanner.nextLine();
                        Controller.eliminarTarea(archivo, tareaEliminar);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        scanner.close();
                }
            } while (opcion != 5);
    }



}
