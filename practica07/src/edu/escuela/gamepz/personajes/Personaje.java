package edu.escuela.gamepz.personajes;
public class Personaje {

	private String nombre;
	private int edad;

	public Personaje(String personaje){
		setNombre(personaje);
		int edad = 0;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		int longitud = nombre.length();
		if ((longitud > 5) && (longitud < 25)){
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void Saludar() {
		System.out.println("Hola Alumno de POO " + nombre);
	}
	public int getEdad() {
		edad = this.edad;
		return edad;
	}
	public boolean setEdad(int edad) {
		if (0<edad & edad<120) {
			this.edad = edad;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		return ""+nombre+"\t"+edad;
	}
}