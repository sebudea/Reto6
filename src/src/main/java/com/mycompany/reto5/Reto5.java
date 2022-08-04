package main.java.com.mycompany.reto5;

import com.mycompany.reto5.Charmander;
import com.mycompany.reto5.Pokebola;
import com.mycompany.reto5.Pokemon;

/*Grupo de actividad Sebastian Aristizabal y Sebastian Gomez
*/
public class Reto5 {

    public static void main(String[] args) {
        
        Pokebola pokebolaroja = new Pokebola();
        
        Charmander fuego = new Charmander("mauricio");
        
        System.out.println("POkemon capturado: " + fuego.toString() );
        
        System.out.println("poke grito " + fuego.gritar() );
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        
    }
}
