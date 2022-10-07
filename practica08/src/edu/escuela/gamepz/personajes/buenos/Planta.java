package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
	private char escudo;
	private int vida = 3;

	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}

	public Planta(String nombre, char escudo){
		super(nombre, vida);
		this.escudo = escudo;

	}

	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = "A";
	}

	public Planta(String nombre){
		super(nombre, vida);
		escudo = "A";

	}

	public char getEscudo(){
		return escudo;
	}

	public void decVida(){
		if ((escudo = "A")&&(vida-2) >= 0)){
			vida -= 2;
	}

	


	public 

}