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

	public String getDetalle(){
		return (super.getDetalle() + "\t" + getEscudo());
	}

	public void decVida(){
		int vidaPadre = super.getVida();
		if (escudo == 'A'){
			super.decVida(2);
		} 
		else {
			super.decVida();
		}
	}

	public void decVida(int vida){
		if (escudo == 'A'){
			super.decVida(2*vida); 
		}
		else {
			super.decVida(vida);
		}
	}

	public void addVida(){
		if (escudo == 'A') {
			super.addVida(2);
		}
		else {
			super.addVida();
		}
	}

	public void addVida(int vida){
		if (escudo == 'A'){
			super.addVida(2*vida); 
		}
		else{
			super.addVida(vida);
		}
	}

}