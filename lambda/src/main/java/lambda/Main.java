package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        
        // Se usa el .aslist para que la expresion lambda se pueda usar correctamente 
/*         List<String> lista = Arrays.asList("uno", "dos", "tres");
        lista.forEach(s -> System.out.println(s));
 */
        // LO mismo con .stream
/*      List<String> lista = Arrays.asList("uno", "dos", "tres");
        lista.stream().forEach(System.out::println); */

/*         List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Ana", 23));
        personas.add(new Persona("Jose", 30));
        personas.add(new Persona("Maria", 20));

        // Usar un Comparator con expresión lambda para ordenar por edad
        Comparator<Persona> porEdad = (p1, p2) -> Integer.compare(p1.getEdad(),
        p2.getEdad());
        Collections.sort(personas, porEdad); */


        // Imprimir 

/*         personas.forEach(p -> 

        System.out.println(

            p.getNombre() + ": " + 
            p.getEdad()

            )
        );  */

        // Imprimir de otra forma usando Consumer 

/*         Consumer<Persona> imprimiNombre = estudiante -> {
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getEdad());

        }; */
        

        //personas.forEach(imprimiNombre);


        // uso de BICOSUMER
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Mango", 25);
        items.put("Grapes", 50);
        // Definir un BiConsumer para procesar las entradas del Map
        BiConsumer<String, Integer> procesarEntrada = (clave, valor) ->
        System.out.println("Fruta: " + clave + ", Cantidad: " + valor);
        // Aplicar el BiConsumer a cada entrada del Map
        items.forEach(procesarEntrada);

        // USANDO SUPPLIER 


        // USANDO PREDICATE 

        // DEVUELVE VERDADERO O FALSE 
        


    
    }

}
