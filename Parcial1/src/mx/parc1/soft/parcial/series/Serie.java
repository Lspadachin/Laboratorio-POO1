package mx.parc1.soft.parcial.series;

public class Serie{
	public int genNumero(int numero){
		int n = 0;
		if (numero < 10){
			numero = 100;
		}
		while(n<=numero){
			n = (int)(Math.random()*numero*10);
			System.out.println(n);
		}
		return n;
	}
	public int fiboN(int posicion){
		if ((posicion == 1) | (posicion == 2)){
			return 1;
		}
		int cont = 3;
		int x = 1;
		int y = 1;
		int z = 1;
		while (true){
			x = y;
			y = z;
			z = x+y;
			if (cont == posicion){
				return z;
			}
			cont++;
		}

	}
}