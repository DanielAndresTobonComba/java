package com.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main metodo = new Main();

        /* Ejercicio 1 Suma de dos numero  */
       

        double num1 = 0.0;
        double num2 = 0.0;

        try(Scanner sc =  new Scanner(System.in)) {

            do {

                // Verificar si la entrada es un numero 
                System.out.println("Ingrese un numero. "); // Has next int verifica si la entrada es entero o no 
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.out.println(input + " no es un numero valido.");
                    System.out.println("Ingrese un numero:");
                }
                num1 = sc.nextInt();

            }while(false);


            do {

                // Verificar si la entrada es un numero 
                System.out.println("Ingrese un numero. "); // Has next int verifica si la entrada es entero o no 
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.out.println(input + " no es un numero valido.");
                    System.out.println("Ingrese un numero:");
                }
                num2 = sc.nextInt();

            }while(false);
            
            double suma = metodo.suma(num1, num2);

            System.out.println("La suma es: " + suma);

        } catch (InputMismatchException  entero) {
            System.out.println("Ingrese un numero entero.");
        }
           
       

        /*Ejercicio 2 */

        
    }


    public double suma(double a , double b){
        return (a + b) ;
    }
}