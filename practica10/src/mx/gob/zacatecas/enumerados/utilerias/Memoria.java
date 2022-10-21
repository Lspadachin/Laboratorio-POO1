public enum Memoria{
	DDR("Memoria RAM", 166, 30),
	DDR2("Laptop", 240, 35),
	DDR3("Laptop nueva", 533, 40),
	DDR4("Gamer", 1600, 40);

	private String tipo;
	private float velocidad;
	private int pines;

	private Memoria(String tipo, float velocidad, int pines){
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.pines = pines;
	}

	public String getTipo(){
		return tipo;
	}

	public float getVelocidad(){
		return velocidad;
	}

	public int getPines(){
		return pines;
	}

}