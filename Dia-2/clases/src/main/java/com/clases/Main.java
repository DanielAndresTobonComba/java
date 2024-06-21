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
        System.out.println(myStudent.getApellido());
        System.out.println(myStudent.getEdad());
        


        
        
        

         

    }

    
    public int suma (int a , int b){
        return a+b;
    }
    
}
