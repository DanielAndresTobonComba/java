package modelentity;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String nombre;
    private String ciudad;
    private List<Player> lstJugadores;
    private List<Coach> lstEntrenadores;
    private List<Doctor> lstDoctores;

    public Team() {

        lstEntrenadores = new ArrayList<Coach>();
        lstJugadores = new ArrayList<Player>();
        lstDoctores = new ArrayList<Doctor>();
    }

    

    public Team(String nombre, String ciudad, List<Player> lstJugadores, List<Coach> lstEntrenadores,
            List<Doctor> lstDoctores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lstJugadores = lstJugadores;
        this.lstEntrenadores = lstEntrenadores;
        this.lstDoctores = lstDoctores;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Player> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(Player player) {
        this.lstJugadores.add(player);
    }

    public List<Coach> getLstEntrenadores() {
        return lstEntrenadores;
    }

    public void setLstEntrenadores(Coach coach) {
        this.lstEntrenadores.add(coach);
    }

    public List<Doctor> getLstDoctores() {
        return lstDoctores;
    }

    public void setLstDoctores(Doctor doctor) {
        this.lstDoctores.add(doctor);
    }

    
    

}
