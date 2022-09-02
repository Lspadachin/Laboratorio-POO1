//iniciada a las 7:35
public class Personaje {

	private String nombre;
	private String edad;
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void Saludar() {
		System.out.println("Hola Alumno de POO " + nombre);
	}
	

	public void Obligatorio() {
		edad = 0;
	}
	public int getEdad() {
		return (int this.edad);
	}
	public boolean setEdad(edad) {
		if (0 > edad > 120)
			return true
		else 
			return false
	}

}