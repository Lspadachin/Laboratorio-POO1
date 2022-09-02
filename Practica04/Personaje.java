//iniciada a las 7:35
public class Personaje {

	private String nombre;
	public Personaje(int edad) {
		edad = 0;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void Saludar() {
		System.out.println("Hola Alumno de POO " + nombre);
	}
	
	public int getEdad() {
		return (int edad);
	}
	public boolean setEdad(edad) {
		if (0 > edad > 120)
			return true
		else 
			return false
	}

}