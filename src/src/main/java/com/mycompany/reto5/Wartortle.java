package com.mycompany.reto5;

public class Wartortle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Wartortle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    Wartortle() {
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon Blastoise = new Blastoise(this.nombre, this.nivel, this.salud) ;
        return Blastoise;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
    
}
