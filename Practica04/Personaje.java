public class Personaje {

	private String nombre;
	private Int edad;

	public Personaje(){
		int edad = 0;
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
		return this.edad;
	}
	public boolean setEdad(int edad) {
		if (0<edad & edad<120) {
			return true;
		} else {
			return false;
		}
	}
}