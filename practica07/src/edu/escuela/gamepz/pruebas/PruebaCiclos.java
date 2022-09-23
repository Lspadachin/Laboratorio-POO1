package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
public class PruebaCiclos{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Diego");
		Personaje per02 = new Personaje("Almendra");
		Personaje per03 = new Personaje("Bianca");
		Personaje per04 = new Personaje("Jordan");

		int n = 0;
		int m = 0;

		while ( n>=m ) {
			n = (int) Math.random()*100;
			m = (int) Math.random()*100;
		}
		System.out.println(n);
		System.out.println(m);

		for (int o = n ; o<m ; o++) {
			int ed = (int)(Math.random()*250);
			if (per01.setEdad(ed)){
				System.out.prinln(per01.getNombre()+ " " +per01.getEdad() + "se modifico la edad");
			}
			else {
				//String eda = (String)ed;
				System.out.prinln(per01.getNombre()+ " " +per01.getEdad() + "sin modificaciones a la edad a ");
			}
		}
	}
}