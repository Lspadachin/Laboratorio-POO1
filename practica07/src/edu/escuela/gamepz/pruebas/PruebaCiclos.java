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
			n = (int) (Math.random()*100);
			m = (int) (Math.random()*100);
		}

		System.out.println(n);
		System.out.println(m);

		outfor:
		for (int o = n ; o<m ; o++) {
			int ed;
			Personaje[] Personajes = {per01,per02,per03};
			for (Personaje tmp : Personajes ) {
				ed = (int)(Math.random()*250);
				if (tmp.setEdad(ed)){
					System.out.println(tmp.getDetalle()+ " se modifico la edad");
				}
				else {
					System.out.println(tmp.getDetalle() + " sin modificaciones a la edad a "+ed);
				}
			}
			do{
				ed = (int)(Math.random()*200);
				System.out.println(ed);
				if (ed > 150){
					System.out.println("El numero generado es mayor a 150");
					continue outfor;
				}
			} while(!(per04.setEdad(ed)));
			per04.getDetalle();
		}
	}
}