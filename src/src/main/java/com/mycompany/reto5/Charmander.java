package com.mycompany.reto5;

public class Charmander extends Pokemon{
    private String nombre;
    private byte nivel;
    private int salud;

    public Charmander(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public Charmander(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.salud = 100;
    }

    Charmander() {
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon Charmeleon = new Charmeleon(this.nombre, this.nivel, this.salud);
        return Charmeleon;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }

    @Override
    public String toString() {
        return "Charmander{" + "nombre=" + nombre + ", nivel=" + nivel + ", salud=" + salud + '}';
    }
    
}
