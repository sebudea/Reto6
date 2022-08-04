package com.mycompany.reto5;

public class Pikachu extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Pikachu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    Pikachu() {
    }
    
    

    @Override
    public Pokemon evolucionar() {
        Pokemon Raichu = new Raichu(this.nombre, this.nivel, this.salud) ;
        return Raichu;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
    }
    
}
