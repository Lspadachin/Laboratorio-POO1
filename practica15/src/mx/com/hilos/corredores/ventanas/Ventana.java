package mx.com.hilos.corredores.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import mx.com.hilos.corredores.hilos.RunHilos;

public class Ventana extends JFrame {
	private JLabel lblTitulo;
	private JLabel lblElem1;
	private JLabel lblElem2;
	private JLabel hElem1;
	private JLabel hElem2;
	private JTextField txtElem1;
	private JTextField txtElem2;
	private JButton btnStart;

	public Ventana(){
		initComponents();
	}

	public void initComponents(){
		int ancho = 550;
		int alto = 250;
		Dimension lblDim = new Dimension(ancho-15,alto/10);
		Color border = new Color(0, 0, 255);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblTitulo = new JLabel("* Practica 15 Manejo de hilos *");
		lblTitulo.setPreferredSize(lblDim);
		lblElem1 = new JLabel("Hilo 1");
		txtElem1 = new JTextField(3);
		lblElem2 = new JLabel("Hilo 2");
		txtElem2 = new JTextField(3);
		btnStart = new JButton("Comenzar");

		hElem1 = new JLabel(" Aqui va el hilo 1 ");
		hElem1.setBorder(BorderFactory.createLineBorder(border));
		hElem1.setPreferredSize(lblDim);
		hElem2 = new JLabel(" Aqui va el hilo 2 ");
		hElem2.setBorder(BorderFactory.createLineBorder(border));
		hElem2.setPreferredSize(lblDim);
		btnStart.setPreferredSize(lblDim);
		
		btnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnStart.setEnabled(false);
				RunHilos.iniciar(txtElem1, txtElem2, hElem1, hElem2);
			}
		});

		this.setTitle("Practica 15");
		this.setLayout(new FlowLayout());
		this.setSize(ancho,alto);
		this.add(lblTitulo);
		this.add(lblElem1);
		this.add(txtElem1);
		this.add(lblElem2);
		this.add(txtElem2);
		this.add(btnStart);
		this.add(hElem1);
		this.add(hElem2);
	}

}