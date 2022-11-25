package mx.com.hilos.corredores.hilos;

import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class RunHilos{

	public static void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){

		char ch1 = (txt1.getText().length() > 0) ? ( (txt1.getText().charAt(0) == ' ') ? ('E') : txt1.getText().charAt(0) ) : ('E');
		char ch2 = (txt2.getText().length() > 0) ? ( (txt2.getText().charAt(0) == ' ') ? ('M') : txt1.getText().charAt(0) ) : ('M');
		String salida1 = ""+ch1;
		String salida2 = ""+ch2;
		elem1.setText(salida1);
		elem2.setText(salida2);
		Letra hilo1 = new Letra(elem1, ch1);
		Letra hilo2 = new Letra(elem2, ch2);
		Thread hi1 = new Thread(hilo1);
		Thread hi2 = new Thread(hilo2);
		hi1.start();
		hi2.start();
	}
}