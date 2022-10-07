//Practica iniciada a las 7:35
package edu.escuela.gamepz.personajes;
public class Personaje {

	private String nombre;
	private int vida;

	public Personaje(String personaje){
		setNombre(personaje);
		int vida = 0;
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
	public int getvida() {
		vida = this.vida;
		return vida;
	}
	public boolean setvida(int vida) {
		if (0<vida & vida<120) {
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		return ""+nombre+"\t"+vida;
	}
}