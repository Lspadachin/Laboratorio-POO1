package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("David"),
			new Zombie("Bianca"),
			new Planta("Fabian",10,Escudo.MEDIO),
			new Planta("Almendra",50),
			new Planta("Ricardo",Escudo.BAJO),
			new Planta("Silvia"),
			new Zombie("Armando",80,false),
			new Zombie("Josseline",true),
			new Zombie("Eduardo")
		};

		int pos = 0;
		for (Personaje p : datos ) {
			pos = (Math.random()*20-5);
		}
	} //main

} //clase