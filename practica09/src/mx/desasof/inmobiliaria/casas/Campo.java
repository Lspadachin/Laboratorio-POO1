package mx.desasof.inmobiliaria.casas;

public class Campo extends Casa{
	float piscina[] = new float[2];

	public Campo (String tipo, int hab, float  costo, int ancho, int largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
}