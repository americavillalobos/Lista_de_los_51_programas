/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa que lea una cantidad de   *
 * grados centigrados y le pase a grados  Fahrenheit  *
 * La formula correspondiente es F=32+(9*C/5)      *
 *************************************************/

package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio4 extends JFrame implements ActionListener {
	//Declaracion de atributos 
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	//Contructor vacio
	public Ejercicio4() {
		
		panel = new JPanel();
		panel.setBounds(10, 10, 580, 580);
		panel.setBackground(Color.MAGENTA);
		panel.setLayout(null);
		add(panel);
		
		etiqueta = new JLabel("Ingresa los grados centigrados");
		etiqueta.setBounds(50, 20, 200, 30);
		panel.add(etiqueta);
		
		valx = new JTextField();
		valx.setBounds(300, 50, 200, 20);
		panel.add(valx);
		
		//Boton
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(100, 100, 400, 40);
		btnEnviar.addActionListener(this);
		panel.add(btnEnviar);
		
		setResizable(false);
		setLayout(null);
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		
	}
	public static void main(String[] args) {
		new Ejercicio4();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnviar );{
			System.out.println("Click boton");
			
			etiqueta.setText("Resultado");
			etiqueta.setBounds(20,200, 120,20);
			
			double x = Double.parseDouble(valx.getText());
			
			System.out.println("Resultado:  " + (32 +(9 * x/5)));
			JOptionPane.showMessageDialog(null, "Resultado"	+ (32 +(9 * x/5)) , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			

		}
		
		
	}
	

}
