package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;


public class Zombie extends Personaje implements Muerto {
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida, 0.0f);
		this.ataque = ataque;
	}

	public Zombie(String nombre, boolean ataque){
		this(nombre, 3, ataque);
	}

	public Zombie(String nombre, int vida){
		super(nombre, vida, 0.0f);
	}

	public Zombie(String nombre){
		this(nombre, 3, false);
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
			setVida(vida-(3*vida)); 
		}
		else {
			setVida(vida-(2*vida));
		}
	}

	public void addVida(){
		if (ataque) {
			setVida(vida+3);
		}
	}

	public void addVida(int vida){
		if (ataque){
			setVida(vida+3*vida); 
		}
	}

	public void comer(){
		System.out.println("Comer cerebros");
	}
}