package mx.desasof.inmobiliaria.casas;

public class Casa {
	private String tipo;
	private int hab;
	private float costo;

	public Casa (String tipo, int hab, float  costo) {
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	}

	public Casa (String tipo) {
		this (tipo, 2, 2000000);
	}

	public int hashCode(){
		return (tipo.hashCode())*hab*((int)costo);
	}

	public boolean equals(Object obj){
		return ((tipo.equals(((Casa)obj).tipo)) && (costo == ((Casa)obj).costo));
	}

	public String toString(){
		return (tipo+" "+hab+" "+costo);
	}
}