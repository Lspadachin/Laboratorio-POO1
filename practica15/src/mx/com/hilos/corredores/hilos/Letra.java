package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;

public class Letra implements Runnable{
	private char letra;
	private JLabel etq;

	public Letra(JLabel etq, char letra){
		this.etq = etq;
		this.letra = letra;
	}
	public void run(){
		String cadena = etq.getText();
		for (int i = 0 ; i<51 ; i++ ) {
			cadena += ""+letra;
			etq.setText(cadena);
			int rand = (int)(Math.random()*1000);
			try{
				Thread.sleep(rand);
			} catch (InterruptedException e){
				System.out.println("Algun error ha ocurrido en el tiempo de espera.");
			}
		} //for
		cadena += "Finalizado";
		etq.setText(cadena);
	}
}