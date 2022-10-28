package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;


public class Zombie extends Personaje implements Muerto {
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
		ataque = false;
	}

	public boolean getAtaque(){
		return ataque;
	}

	public String toString(){
		return (super.toString() + "\t" + getAtaque());
	}

	public void decVida(){
		if (ataque == false){
			setVida(3);
		}
		else {
			setVida(2);
		}
	}

	public void decVida(int vida){
		if (!ataque){
			setVida(getVida()-(3*vida)); 
		}
		else {
			setVida(getVida()-(2*vida));
		}
	}

	public void addVida(){
		if (ataque) {
			setVida(getVida()+3);
		}
	}

	public void addVida(int vida){
		if (ataque){
			setVida(getVida()+3*vida); 
		}
	}

	public void comer(){
		System.out.println("Comer cerebros");
	}
}