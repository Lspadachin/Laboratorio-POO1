//Practica iniciada a las 7:35
package edu.escuela.gamepz.personajes;
public class Personaje {

	private String nombre;
	private int vida;

	public Personaje(Strig nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
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
		this.vida -= 1;
	}

	public void decVida(int vida){
		this.vida -+ vida;
	}

	public void addVida(){
		this.vida += 1;
	}

	public void addVida(int vida){
		this.vida += vida;
	}
}