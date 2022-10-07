//Practica iniciada a las 7:35, practica finalizada 10:16
package edu.escuela.gamepz.personajes;

public class Personaje {

	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		setVida(vida);
	}

	public Personaje(String personaje){
		setNombre(personaje);
		int vida = 3;
		this.vida = vida;
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
		vida = this.vida;
		return vida;
	}
	public boolean setVida(int vida) {
		if (0<vida & vida<100) {
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		return ""+nombre+"\t"+vida;
	}

	public void decVida(){
		if ((vida-1) >= 0) {
			vida -= 1;;
		}
	}

	public void decVida(int vida){
		if ((this.vida-vida) >= 0){
			this.vida -= vida; 
		}
	}

	public void addVida(){
		if ((vida+1) <= 99) {
			vida += 1;
		}
	}

	public void addVida(int vida){
		if ((this.vida+vida) <= 99){
			this.vida += vida; 
		}
	}
}