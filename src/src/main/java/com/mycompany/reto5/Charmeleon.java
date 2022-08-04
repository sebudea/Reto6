package com.mycompany.reto5;

public class Charmeleon extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charmeleon(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon Charizard = new Charizard(this.nombre, this.nivel, this.salud) ;
        return Charizard;
    }

    @Override
    public String gritar() {
        return "Charmeleon!";
    }
    
}
