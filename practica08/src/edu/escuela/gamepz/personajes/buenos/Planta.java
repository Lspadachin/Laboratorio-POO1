package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
	private char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}

	public Planta(String nombre, char escudo){
		super(nombre, 3);
		this.escudo = escudo;

	}

	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = 'A';
	}

	public Planta(String nombre){
		super(nombre, 3);
		escudo = 'A';

	}

	public char getEscudo(){
		return escudo;
	}

	public void decVida(){
		int vidaPadre = super.getVida();
		if (escudo == 'A'){
			super.decVida(2);
		}

		if (escudo != 'A') {
			super.decVida();
		}
	}

	public void decVida(int vida){
		if (escudo == 'A'){
			super.decVida(2*vida); 
		}

		if (escudo != 'A'){
			super.decVida(vida);
		}
	}

	public void addVida(){
		int vidaPadre = super.getVida();
		if (escudo == 'A') {
			super.addVida(2);
		}
		if (escudo != 'A'){
			super.addVida();
		}
	}

	public void addVida(int vida){
		int vidaPadre = super.getVida();
		if (escudo == 'A'){
			super.addVida(2*vida); 
		}

		if (escudo != 'A'){
			super.addVida(vida);
		}
	}

}