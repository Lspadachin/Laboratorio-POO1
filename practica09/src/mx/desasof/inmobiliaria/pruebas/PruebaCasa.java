package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;

public class PruebaCasa{
	int i = 0;
	int casas = 5;
	while( i < casas.length){
		for (casa c: casas){
			System.out.println(".");
		}//for
		i++;
	}//while
}
/*
new Casa("Estandar", 3, 3000000),
new Campo("Cazador",3.5f,10f),
new Urbana("Residencia",3,2500000,2),
new Casa("Estandar", 3, 3000000),
new Campo("Cazador",3.5f,10),
new Urbana("Residencia", 3, 2500000,2),
new Casa("Estandar"),
new Campo("Cazador",4,15000,3f,5f),
new Urbana("Residencia",5)

*/