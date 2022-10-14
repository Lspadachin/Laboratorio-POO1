package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;

public class PruebaCasa{
	public static void main(String[] args) {
		int i = 0;

		Casa[] casas = {
			new Casa("Estandar", 3, 3000000),
			new Campo("Cazador",3.5f,10f),
			new Urbana("Residencia",3,2500000,2),
			new Casa("Estandar", 3, 3000000),
			new Campo("Cazador",3.5f,10),
			new Urbana("Residencia", 3, 2500000,2),
			new Casa("Estandar"),
			new Campo("Cazador",4,15000,3f,5f),
			new Urbana("Residencia",5)
		};

		while( i < casas.length){
			for (Casa c: casas){
				if (casas[i] == c){
					System.out.println(casas[i] + " es igual a " + c);
					System.out.println(" = = = = = ");
				} else if (casas[i].equals(c)) {
					System.out.println(casas[i]+" y "+ c +" son objetos iguales.");
					System.out.println(" e e e e e ");
				} else {
					System.out.println(casas[i] + " no es igual a " + c);
					System.out.println(" ! ! ! ! ! ");
				}
			}//for
			i++;
		}//while
	}//main
}//clase