package modelentity;

public class Player extends Person {

    private int dorsal; 
    private String posicion;

    public Player() {
        super(); // Para crear de la clase principal
    }

    public Player(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public Player(int id, String nombre, String apellido, int edad, int dorsal, String posicion) {

        super(id, nombre, apellido, edad); // El super es para heredar
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    
    
}
