package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;

public class PruebaHerencia {
	public static void main(String[] args) {
		int cont = 0;

		Personaje per01 = new Planta("David", 100);
		Personaje per02 = new Zombie("Bianca");
		Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
		Planta plan02 = new Planta("Almendra", 50);
		Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
		Planta plan04 = new Planta("Silvia");
		Zombie zom01 = new Zombie("Armando", 80, false);
		Zombie zom02 = new Zombie("Josseline", true);
		Zombie zom03 = new Zombie("Eduardo");

		Personaje[] personajes = {
			per01, per02,
			plan01, plan02, plan03, plan04,
			zom01, zom02, zom03
		};

		for (Personaje tmp : personajes ) {
			cont++;
			System.out.println(tmp);
			int num = (int)(Math.random()*100);
			if (tmp instanceof Planta){
				Planta tmpPlanta = (Planta) tmp;
				System.out.println("Soy planta "+ tmpPlanta);
				tmp.addVida(num);
			}
			if (tmp instanceof Zombie){
				Zombie tmpZombie = (Zombie) tmp;
				System.out.println("Soy zombie "+ tmpZombie.getAtaque());
				tmp.decVida(num);
				tmpZombie.comer();
			}
			System.out.println(num);
			System.out.println(tmp);
			System.out.println(" ***** Objeto "+ cont +" ***** ");
		}
	}
}