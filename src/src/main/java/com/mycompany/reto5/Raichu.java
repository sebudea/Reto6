package com.mycompany.reto5;

import main.java.com.mycompany.reto5.NoEvolucionaException;

public class Raichu extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Raichu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public Raichu() {
    }
    
    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }
    
}
