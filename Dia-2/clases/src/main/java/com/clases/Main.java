package com.clases;

import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
        /* 
        // Matrices

        // Declaracion 
        int [][] myMatriz = new int[2][3];

        // Declaracion y signacion 
        String [][] names = {{"John" , "Jane"} , {"Peter" , "Mary"}};

        // Tamaño de la matriz         
        int numRows = myMatriz.length; // Sera 2
        int numCols = myMatriz[0].length; // Sera 3
    
    

        // PROGRAMACION ORIENTADA A OBJETOS 

        // Clases: Plantilla generica 
        // Objeto: Individuo o cosa que salio de la clase / platilla
        // Atributo: Caracteristicas 
        // Metodos: Funciones , cambia el estado del objeto 


         
         Clase: Animal 
         Objetos: Leon , Gato
         Atributos: 9años , 4años 
         Metodos: Dezplazarse , comer 
        */

        

        // Clases 
        
        

        Main principal = new Main();

        System.out.println(principal.suma(4,7)); 


        // Creacion de el objeto mi estudiante

        
        Estudiante myStudent = new Estudiante(null,null,0);

        myStudent.setNombre("Juanito");
        myStudent.setApellido("Perez");
        myStudent.setEdad(13);

        // Obtengo el nonbre de la clase estudiante
        System.out.println(myStudent.getNombre());
        


        
        
        

         

    }

    
    public int suma (int a , int b){
        return a+b;
    }
    
}
