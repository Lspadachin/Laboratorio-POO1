package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje{
	private Escudo escudo;

	public Planta(String nombre, int vida, Escudo escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}

	public Planta(String nombre, Escudo escudo){
		super(nombre, 3);
		this.escudo = escudo;

	}

	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = escudo.NULO;
	}

	public Planta(String nombre){
		super(nombre, 3);
		escudo = escudo.NULO;

	}

	public Escudo getEscudo(){
		return escudo;
	}

	public String toString(){
		return (super.toString() + "\t" + getEscudo())+ "\t" + escudo.getNivel();
	}

	public void decVida(){
		setVida(getVida() - escudo.getNivel());
	}

	public void decVida(int decremento){
		setVida(getVida() - (escudo.getNivel() * decremento));
		
	}

	public void addVida(){
		setVida(getVida() + escudo.getNivel());
	}

	public void addVida(int incremento){
		setVida(getVida() + escudo.getNivel() * incremento);
	}

}