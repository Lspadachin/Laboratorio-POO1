package mx.desasof.inmobiliaria.casas;

public class Campo extends Casa{
	float piscina[] = new float[2];

	public Campo (String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}

	public Campo (String tipo, float ancho, float largo){
		super(tipo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}

 	//hash del padre por ancho por largo dividido entre 5
	public int hashCode(){
		return (int)((super.hashCode())*piscina[0]*piscina[1]/5);
	}

	//ademas del del padre son de tipo campo
	public boolean equals(Object obj){
		return ((super.equals(obj)) && (obj instanceof Campo));
	}
	//tipo, habitaciones, costo, ancho, largo
	public String toString() {
		return super.toString()+" "+piscina[0]+" "+piscina[1];
	}
}