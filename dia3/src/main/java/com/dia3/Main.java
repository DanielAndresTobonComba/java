package com.dia3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 

         // Metodos de array list 

        // Crear un array list es el nombre del arreglo
        java.util.ArrayList<String> list = new ArrayList<>();
        
        // Agregar un elemento
        list.add("Backend java");

        // Agregar de primero
        list.add(0, "Fundamentos");

        // Obtengo el un dato del arreglo list 
       // String elemento = list.get(0);
        list.set(0,"Programacion web");

        // System.out.println(elemento);
        // System.out.println(list);

        // Eliminar un dato 

        //String eliminado = list.remove(0);
       
        // System.out.println(eliminado);
        // System.out.println(list);

        // ELimitar un dato con un verficador boleano 

        list.add("Pasteleria");
        // boolean result = list.remove("Pasteleria");

        // System.out.println(result);

        // Eliminar todo de la lista 
        //list.clear();

        // Recorrer cada item de la lista
        for(String item : list){
            System.out.println(item);
        }

        

    
        */

        // Segunda parte de los apuntes 

        // Declarar un arraylist 

        ArrayList<String> lista = new ArrayList<String>();

        // Añadir Elementos al final de la lista
        lista.add("Backend Java");

        // Agregar en una posicion especifica

        lista.add( 0,"Fundamentos");

        System.out.println("Agregar en una posicion especifica\n" + lista);


        // Acceder a un elemento especifico
        System.out.println("\nAcceder a un elemento especifico");
        String obtenerElemento = lista.get(0);
        System.out.println(obtenerElemento);


        // Reemplaza un elemento en un posicion especifica 
        lista.set(0, "Programacion web");
        System.out.println("\nReemplaza un elemento en un posicion especifica \n"+lista);

        // Eliminar elemento en la posicion especifica 
        String eliminado = lista.remove(1);
        System.out.println(eliminado);
        System.out.println(lista);


        // Saber si la primera ocurrencia de un elemento fue eliminada 
        lista.add("Python xd"); 
        

        boolean result =  lista.remove("Python xd"); // Aqui almaceno la operacion en un booleano para saber si se hizo correctamente 

        System.out.println("\nVerificar si se elimino un dato: " + result);
        System.out.println(lista);


       

        // Obtener el tamaño de un arraylist 
        int tamaño = lista.size();
        System.out.println("\nObtener el tamaño de la lista:" + tamaño);



        // Saber si una lista esta vacia 
        boolean estaVacio = lista.isEmpty();
        System.out.println("\nSaber si una lista esta vacia: " + estaVacio);


        // Buscar elementos 
        boolean contiene = lista.contains("Mysql");
        System.out.println("\nSaber si el arreglo contiene un elemento: " + contiene );


        // Saber la posicion de la primera ocurrencia un elemento 
        // Si no existe devulve -1 
        int indice = lista.indexOf("Postgres");
        System.out.println("\nEl indice de la primera ocurrencia de un elemento: " + indice);


        // Saber la ultima posicion de la ocurrencia de un elemento
        // Si no exite devuelve -1
        lista.add("Mysql");
        int ultimoIndice = lista.lastIndexOf("Mysql");
        System.out.println("El indice de la ultima ocurrencia de un elemento Mysql: "  + ultimoIndice + "\n");


        // Convertir a arraylist a un array object , muestra el contenido en forma de array

        Object[] skills = lista.toArray();
        System.out.println(skills); // Asi no funcio ya que es un objeto toca cambiarlo a string

        String arreglo = Arrays.toString(skills);// Asi se convierte a un arreglo legible

        System.out.println(Arrays.toString(skills)); // Imprimir sin dejarlo en una variable
        System.out.println(arreglo); // Asi se hace legible

        System.out.println(lista);



        // OPCIONES AVANZADAS 

        // añadir todos los elementos de "otralista" al final del ArrayList.

        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Python" , 
        "PHP"));

        lista.addAll(otraLista);
        System.out.println("\nAgregar todos los elementos de una lista a otra:\n" + lista);
        

        // añadir todos los elementos de "otralista" al en una posicion especifica del ArrayList

        lista.addAll(0,otraLista);
        System.out.println("\nañadir todos los elementos de \"otralista\" al en una posicion especifica del ArrayList\n" + lista);


        // Eliminar los elementos del Arraylist original que tambien esta en "otralista"
        lista.removeAll(otraLista);
        System.out.println("\nEliminar los elemtos del Arraylist original que tambien esta en otralista\n" + lista);



        // Retener elementos especificos en el ArrayList 
        lista.retainAll(Arrays.asList("Python", "Mysql"));
        System.out.println(lista);


         // Eliminar todos los elementos de un array list
         lista.clear();
         System.out.println("\nLista eliminada: " + lista);

         







    }
}