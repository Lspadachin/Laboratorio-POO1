package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
		};//datos

		TreeSet<Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<>();

		//Ruta de mi home
		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		//Creacion del Scanner
		Scanner s = new Scanner(System.in);
		//Introducir nombre del archivo
		String fname = s.nextLine();
		//Agregamos el nombre del archivo a la ruta del home
		path += fname;

		//Creamos un archivo con la ruta
		File f = new File(path);

		for (Personaje tmp : datos ) {

			arbol.add(tmp);
			lista.add(tmp);
		}//for

		//Si el archivo/directorio exsite
		if (f.exists()) {
			//Si es un archivo -> si no es archivo es directorio
			if (f.isFile()){
				System.out.println("Existe");
				System.exit(0);
			}
			else {
				mostrarDirectorio(f);
				System.exit(0);
			}//else
			
		}//if
		else {
			//gardarObjetos(file, arbol);
			System.out.println("Test");
		}//else

		System.out.println(" - - - Orden Natural - - - ");

		for (Personaje p:arbol){
			System.out.println(p);
		}//for

		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p:lista){
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
			System.out.println(p);
		}

	} //main

	private static void mostrarDirectorio(File file){
		System.out.println(file);
		FileReader a = new FileReader(file);
		FileWriter b = new FileWriter(a);
	}
	//private static void guardarObjetos(File file,TreeSet coleccion){
//
//	}

}//clase