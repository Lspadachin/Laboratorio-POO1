package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje {
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}

	public Zombie(String nombre, boolean ataque){
		super(nombre, 3);
		this.ataque = ataque;
	}

	public Zombie(String nombre){
		super(nombre, 3);
		this.ataque = false;
	}

	public boolean getAtaque(){
		ataque = this.ataque;
		return ataque;
	}

	public String getDetalle(){
		return (super.getDetalle() + getAtaque());
	}

	public void decVida(){
		if (ataque == false){
			super.decVida(3);
		}
		else {
			super.decVida(2);
		}
	}

	public void decVida(int vida){
		if (ataque == false){
			super.decVida(3*vida); 
		}
		else {
			super.decVida(2*vida);
		}
	}

	public void addVida(){
		if (ataque == true) {
			super.addVida(3);
		}
	}

	public void addVida(int vida){
		if (ataque == true){
			super.addVida(3*vida); 
		}
	}
}