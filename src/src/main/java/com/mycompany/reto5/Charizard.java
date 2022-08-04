package com.mycompany.reto5;

import main.java.com.mycompany.reto5.NoEvolucionaException;

public class Charizard extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charizard(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Charizard!";
    }
    
}
