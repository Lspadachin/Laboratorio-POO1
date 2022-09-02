public class PruebaPersonaje {
	public static void main(String[] args) {
		Personaje alumno = new Personaje();
		alumno.setNombre("Kobie Brayant");
		alumno.Saludar();
		System.out.println("Modificando el nombre "+alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.Saludar();
	}
}