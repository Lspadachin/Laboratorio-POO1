//Practica iniciada a las 7:35, practica finalizada 10:16
package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;

public abstract class Personaje implements Comparable<Personaje>{

	private String nombre;
	protected int vida;
	private float size;

	public Personaje(String nombre, int vida, float size){
		if (size == 0.0f){
			this.size = genSize();
		} else {
			this.size = Math.round(size)/100;
		}
		this.nombre = nombre;
		setVida(vida);
	}

	public Personaje(String personaje){
		this(personaje, 3, 0.0f);
	}

	public void setNombre(String nombre) {
		int longitud = nombre.length();
		if ((longitud > 3) && (longitud < 25)){
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void Saludar() {
		System.out.println("Hola Alumno de POO " + nombre);
	}
	public int getVida() {
		return vida;
	}
	public boolean setVida(int vida) {
		if (0<vida && vida<100) {
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public String toString(){
		return ""+nombre+"\tV:"+vida+"\tS"+size;
	}

	public float genSize(){
		float  size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}

	public float getSize(){
		return size;
	}

	public abstract void decVida();

	public abstract void decVida(int vida);

	public abstract void addVida();

	public abstract void addVida(int vida);

	public int compareTo(Personaje p){
		if (this.nombre.compareTo(p.nombre) != 0){
			return this.nombre.compareTo(p.nombre);
		}
		if (this.vida != p.vida){
			return p.vida - vida;
		}
		return (this.size > p.size)?(-1):(1);
	}
}