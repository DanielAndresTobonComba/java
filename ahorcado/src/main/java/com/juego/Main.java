package com.juego;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {

        // Declaracion de arreglos 
        String[] lstNombres = {"Negro", "Prieto", "Manzana", "Persona", "David", "Universo", "Presona", "Animal", "Pescador", "Programado"};

        ArrayList<String> lstLetras = new ArrayList<>();
        ArrayList<String> vacio = new ArrayList<>();

        // Declaracion de variables
        int numeroRandom = (int) (Math.random() * lstNombres.length);

        int intentos = 0;

        String palabra = lstNombres[numeroRandom].toLowerCase();

        int desicion = JOptionPane.showConfirmDialog(null, "¿Deseas jugar?", "Juego del Ahorcado", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // Impresion de datos
        System.out.println("Número aleatorio: " + numeroRandom);
        System.out.println("Palabra seleccionada: " + palabra);

       

        

        if (desicion == JOptionPane.YES_OPTION) {
            Scanner sc1 = new Scanner(System.in);

            System.out.println("\nJUEGO DEL AHORCADO");


            int longitud = palabra.length();
                
            int veces = 0;

            while (veces < longitud) {

                vacio.add("_ "); 

                veces ++;
            }

            do {

                


                System.out.println("\nLa palabra tiene: " + palabra.length() + " caracteres.\n");


                System.out.println(vacio + "\n"); 


                System.out.println("Intento numero: " + intentos + 1);

                System.out.println("Ingresa una letra:");
                String letra = sc1.nextLine().toLowerCase();

                for(String item : lstLetras){
                    if (item.toLowerCase() == letra){
                        System.out.println("La letra ya fue ingresada");
                        break;
                    } continue;
                    
                }
                
                
                if (palabra.contains(letra)) {
                    System.out.println("\nLetra correcta");

                    
    
                    System.out.println("\nTodas las ocurrencias...");
                    for (int i = -1; (i = palabra.indexOf(letra, i + 1)) != -1; i++) {
                        System.out.println("Posición: " + i);

                        vacio.set(i,letra);

                    } 

                    

                        
                
                    
                    
                } else {
                    System.out.println("La letra no está en la palabra.");
                    intentos++ ;
                    lstLetras.add(letra);
                    
                }

               
            } while (intentos < 3);

            System.out.println("Has terminado el juego.");
            sc1.close(); // Cerramos el Scanner al final del uso
        } else {
            System.out.println("Adiós");
        }

        /* 
        String [] lstNombres = {"Negro" , "Prieto" , "Manzana" , "Persona" ,"David" , "Universo" , "Presona" , "Animal" , "Pescador" , "Programado"};

        int numeroRandom = (int) (Math.random() * 10) + 1;
        String palabra = lstNombres[numeroRandom]; 

        System.out.println(numeroRandom);
        System.out.println(palabra);
        
        int intentos = 0;
        

        int desicion = JOptionPane.showConfirmDialog(null, "Deseas Jugar" , "Informacion" , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );

        if (desicion == 0){

            do{

                
                try (Scanner sc1 = new Scanner(System.in)){

                   System.out.println("La palabra tiene " + palabra.length() + "caracteres");

                   System.out.println("Ingresa la letra");
                   String letra = sc1.nextLine();
                   
                   if (palabra.contains(letra)){
                    System.out.println("La letra esta ");

                   } else {

                    System.out.print("La letra no esta");
                    intentos++;
                    
                   } 
            
                }

            }while(intentos <= 3);
            
        }else {
            System.out.println("BYE");
        }

        */
            

            
         }
            
        
    }



