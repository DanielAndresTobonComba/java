package com.nuevo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       
        // Usar un array list con la clase estudiantes 
        ArrayList<Estudiante> lstEstudents = new ArrayList<>();
        Estudiante student ; // Traigo la clase estudiante y le doy un nombre de variable a esa clase para trabajarla aca 


        //_____________________________________________

        // Usar JOptionPane 

         try (Scanner sc = new Scanner(System.in)) {

            while ( JOptionPane.showConfirmDialog(null, "Quiere agregar un estudiante?" , "Informacion" , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE ) == 0 ) {

            // Se debe crear en el while para crear un nuevo objeto cada vez que se quiera insertar un estudiante 

            student = new Estudiante(null, null, 0);

            System.out.println("Ingrese el nombre del estudiante");
            student.setNombre(sc.nextLine());

            System.out.println("Ingrese el apellido del estudiante");
            student.setApellido(sc.nextLine());

            System.out.println("Ingrese la edad del estudiante");
            student.setEdad(sc.nextInt());

            sc.nextLine();

            lstEstudents.add(student);
         }
            
        }

        // Se coloca estudiente porque es un  de tipo objeto y luego el nombre del arrays list donde estoy guardando toso
        for(Estudiante item : lstEstudents){
            System.out.println(item.getNombre());
        }








        

       
    }
}