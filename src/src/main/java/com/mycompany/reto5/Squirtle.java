
package com.mycompany.reto5;

public class Squirtle extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Squirtle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    @Override
    public Pokemon evolucionar() {
        Pokemon Wartortle = new Wartortle(this.nombre, this.nivel, this.salud) ;
        return Wartortle;
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
    
}
