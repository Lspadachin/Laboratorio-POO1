public class TestSaludador {
	//Metodo principal (main)
	public static void main(String[] args) {
		//creando una instancia del Objeto Saludador
		Saludador alumno = new Saludador();
		//accediendo al metodo saludar al alumno
		alumno.saludar();
	}
}
//el error de usar javac TestSaludador.java se soluciona cambiando el nombre de este archivo a TestSaludador, el problema era que el archivo TestSaludador no existia, ademas la clase no tenia el mismo nombre que el archivo

