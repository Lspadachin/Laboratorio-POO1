package mx.desasof.inmobiliaria.casas;

public class Urbana extends Casa{
	public int banios;

	public Urbana(String tipo, int hab, float costo, int banios){
		super(tipo, hab, costo);
		this.banios = banios;
	}

	public Urbana(String tipo, int banios){
		super(tipo);
		this.banios = banios;
	}

	//hashcode del padre por banios por 23
	public int hashCode(){
		return ((super.hashCode())*banios*23);
	}

	//equals del padre y si es urbana
	public boolean equals(Object obj){
		return ((super.equals(obj) && (obj instanceof Urbana)));
	}

	//toString todos los atributos
	public String toString(){
		return ((super.toString()+" "+banios));
	}
}