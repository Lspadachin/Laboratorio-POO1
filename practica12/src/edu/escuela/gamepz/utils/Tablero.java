package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static final int MAX_SIZE = 10;
	public static Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(){}

	public static void mostrar(){
		int posicion = 1;
		System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
		for (Personaje tmp : personajes ) {
			if (tmp == null){
				System.out.println(posicion + " - - - ");
			} else{
				System.out.println(""+posicion + tmp);
			}
			posicion +=1;
			
		}
	}

	public static void insertar(Personaje p, int pos) throws PersException{
		if (pos < 0 || pos > MAX_SIZE){
			throw new PersException("Incide fuera de rango ", pos);
		}
		personajes[pos] = p;
	}

	public void borrar(int pos) throws PersException{
		if (pos < 0 || pos > MAX_SIZE){
			throw new PersException("Incide fuera de rango ", pos);
		}
		if (personajes[pos] == null){
			throw new PersException("Si personaje para borrar ", pos);
		}
		personajes[pos] = null;
	}
}