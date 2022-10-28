//Practica iniciada a las 7:35, practica finalizada 10:16
package edu.escuela.gamepz.personajes;

public abstract class Personaje {

	private String nombre;
	protected int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		setVida(vida);
	}

	public Personaje(String personaje){
		setNombre(personaje);
		vida = 3;
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
	public String getDetalle(){
		return ""+nombre+"\t"+vida;
	}

	public abstract void decVida(){
		if ((vida-1) >= 0) {
			vida -= 1;;
		}
	}

	public abstract void decVida(int vida);

	public void addVida();

	public void addVida(int vida){
		if ((this.vida+vida) <= 99){
			this.vida += vida; 
		}
	}
}