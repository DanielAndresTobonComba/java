package com.intro;

import java.text.MessageFormat;

// Para poder usar scanner
import java.util.Scanner;

/*psvm : Para crear la rama padre si la borro */
public class Main {


    public static void main(String[] args) {

        /* 
        // Imprimir algo en consola
        // System.out.println("Hello world!");

        // Declarar una variable
        int edad = 15 ;

        // Asignar el valor a una variable
        double precio = 200000; 

        // Declarar un string , debe se mayuscula la S
        String nombre = "Juan";

        // Declarar un valor flotante debe llevar la F ya sea minuscula o mayuscula los decimales se colocan con un punto (.).
        float flotante = 23.5F; 

        

        // Concatenar una variable 
        System.out.println(nombre + " tiene " + edad + " años. ");

        // Mejor forma de imprimir datos de forma formateada
        System.out.println(MessageFormat.format("{0} tiene {1} años y tanto {2} de dinero",nombre,edad,precio));

        // Escanner se usa para la captura de datos 
        // El try se usa para obtener los datos de forma segura
        try (Scanner sc = new Scanner(System.in)) {
            
            // Lectura de la edad
            System.out.println("Ingrese la edad");
            edad = sc.nextInt(); // Next int para decir que es un enterp

            sc.nextLine(); // Limpiar la entrada de datos

            // Lectura del nombre
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine(); // NextLine decir que sera una cadena de texto

            System.out.println("Ingrese la cantidad de dinero");
            precio = sc.nextDouble(); // NextDouble para un dato de entrada de tipo double

            System.out.println(MessageFormat.format("{0} tiene {1} años y tanto {2} de dinero",nombre,edad,precio));


            sc.close(); // Cerrar el buf de del scanner
        }

        */

        /* 
        String mensaje = "Hola\nMundo";
        String tabla = "Nombre \t Apellido \t Edad";
        String retroceso = "123\b45";
        String ruta = "c:\\Users\\Usuario\\Documentos";
        String comillas = "\"Esto es una cita\"" ;

        System.out.println(mensaje);
        System.out.println(tabla);
        System.out.println(retroceso);
        System.out.println(ruta);
        System.out.println(comillas);
        */

        /* @SuppressWarnings({"resource"}) // No recomendado usar mejor usar un try
        Scanner sc = new Scanner(System.in); */

        /*Condicional if 

        try (Scanner sc = new Scanner(System.in)){

            int edad = 0; 

            System.out.println("Ingrese la edad");

            edad = sc.nextInt();

            if(edad >= 18){
                System.out.println("Persona mayor de edad");
            }else {
                System.out.println("Persona menor de edad");
            }

        }*/

        /*Condicional switch*/
        
       
        /* 
        try (Scanner sc = new Scanner(System.in)){
            int edad = 0;

            System.out.println("Ingresa la edad");
            edad = sc.nextInt(); 
            sc.nextLine();


            switch (edad) {
                case edad >= 18:
                    System.out.println("Eres mayor de edad");
                    break;

                case edad < 18:
                     System.out.println("Ingresa menor edad");
                    break;
            
                default:
                    System.out.println("Dato incorrecto");
                    break;
            }
        }
        */


       

       

            int edad = 0; 
            float precio = 23.5F;
            String nombre;
            int valor = 0;
            int acum = 0;
            int nrosInvalidos = 0;
            int nrosValidos = 0;

            try (Scanner sc = new Scanner(System.in)){
                 /*Ciclo while 
                while (valor >= 0){

                    System.out.println("Ingrese un valor mayor que '0'. ");
                    valor = sc.nextInt();

                    sc.nextLine();

                    if (valor < 0) break;

                    acum += valor;
                }*/ 
            

                 /*Ciclo do while */

                 /* 
                do {
                    System.out.println("Ingrese un valor mayor que '0'. ");
                    valor = sc.nextInt();
                    sc.nextLine();

                    if (valor < 0) break;

                    acum += valor;

                }while(valor >= 0);
                */

                /* Ciclo for */

                /* 
                for(int i = 0 ; i <=3 ; i++){
                    System.out.println("Ingrese un valor mayor que '0'. ");
                    valor = sc.nextInt();
                    sc.nextLine();

                    if (valor < 0){
                        nrosInvalidos++;
                        continue; // El continue permite seguir con el codigo y que se ejecute lo que esta mas abajo 
                    } 
                    nrosValidos++;
                    acum += valor;
                }

                System.out.println(MessageFormat.format("La suma de los numeros ingresados es = {0} y se contaros {1} numeros negativos y {2} numeros positivos", acum,nrosInvalidos,nrosValidos));
            
                */

            

                // Metodos de java 

                /* 
                // lenght : Longitud de una cadena
                String s = "abc";
                System.out.println(s.length()); 

                // charAt : obtener un elemente basado en una posicion
                System.out.println("abc".charAt(1)); 

                // Comparacion de cadenas 
                String cadena1 = "pepe";
                String cadena2 = "juan";
                if(cadena1.equals(cadena2)) {}
                if(cadena1.equalsIgnoreCase(cadena2)) {} // Nose para que sirve

                //Conversion de cadenas

                String piStr = "3.1416";
                float pi = Float.valueOf(piStr);

                // Subcadenas 
                String str = "El lenguaje de java";
                String subStr = str.substring(12); // desde la pos 12
                String subStr1 = str.substring(3,12); // desde la 3 a la 12

                // Conversion implicita 
                int numeroEntero = 10;
                double numeroDoble = numeroEntero;

                // COnversion Explicita 
                double numeroDouble = 3.14;
                int numeroEntero1 = (int) numeroDouble;

                // imuutabilidad 
                String inmutableStr = "Hola";
                inmutableStr = inmutableStr.concat(", mundo!");
                System.out.println(inmutableStr); // Salida: Hola

                */
                /*Arreglos*/
                // Los arreglos empiezan en 0 y la ultima posicion es -1


                int [] numero = {1,2,3,4,5};
                String[] nombres = new String[3];

                int LongitudNumeros = numero.length;
                int LongitudNombres = nombres.length;

                System.out.println(LongitudNumeros);
                System.out.println(LongitudNombres);




       
            }
        

        



    }

    

    


}