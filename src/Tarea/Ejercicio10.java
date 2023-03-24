/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion:Programa que lee un número de 3 cifras*
 *  y muestra sus cifras por separado.            *
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio10 extends JFrame implements ActionListener {
	
	//Declaracion de atributos 
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	public Ejercicio10() {
		
		panel = new JPanel();
		panel.setBounds(10, 10, 580, 580);
		panel.setBackground(Color.MAGENTA);
		panel.setLayout(null);
		add(panel);
		
		etiqueta = new JLabel("Introduce el numero de tres cifras");
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
		new Ejercicio10();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnviar );{
			System.out.println("Click boton");
			
			etiqueta.setText("Resultado");
			etiqueta.setBounds(20,200, 120,20);
			
			int x = Integer.parseInt(valx.getText());
			
			System.out.println("Resultado:  " + (x / 100) + (x% 100) / 10 + x% 10);
			JOptionPane.showMessageDialog(null, "Resultado"	+ (x / 100) + (x% 100) / 10 + x% 10 , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			

		}
		
		
	}
	

}
