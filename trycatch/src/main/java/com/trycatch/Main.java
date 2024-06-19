package com.trycatch;

public class Main {
    public static void main(String[] args) {
        /* Try con varios catchs y finally o con default */
        try {
            // Intentamos ejecutar un bloque de código que podría lanzar excepciones
            int[] array = new int[5];
            array[6] = 10; // Esto lanzará ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // Esto lanzará NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura y maneja la excepción específica para ArrayIndexOutOfBoundsException
            System.out.println("Error: Índice fuera de rango en el arreglo.");
        } catch (NullPointerException e) {
            // Captura y maneja la excepción específica para NullPointerException
            System.out.println("Error: Intento de acceder a una referencia nula.");
        } catch (Exception e) {
            // Captura y maneja cualquier otra excepción que no haya sido capturada por los catch anteriores
            System.out.println("Ocurrió un error inesperado.");
            e.printStackTrace(); // Imprime el stack trace de la excepción
        } finally {
            // Bloque opcional: se ejecuta siempre, ya sea que se lance una excepción o no
            System.out.println("Bloque finally ejecutado.");
        }
    }
}