package com.ejemplopoo;

import modelentity.Player;
import modelentity.Team;

public class Main {
    public static void main(String[] args) {

        Controller ctrlTeams = new Controller();

        Team equipo = new Team();

        equipo.setNombre("Bucaros");
        equipo.setCiudad("Bucaramanga");

        Player jugador = new Player(1 , "Pepito" , "xxxx" , 23 , 12 , "medio");

        equipo.setLstJugadores(jugador);

        ctrlTeams.equipos.put("001" , equipo);

        equipo = ctrlTeams.equipos.get("001");

        System.out.println("Mi equpo" + equipo.getNombre());
        System.out.println("Jugador" + equipo.getLstJugadores().get(0).getNombre());
        System.out.println("Jugador" + equipo.getCiudad());
        System.out.println("Jugador" + equipo.getNombre());
        

            
            
        }
        
    }
