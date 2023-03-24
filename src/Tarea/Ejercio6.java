/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion:Programa que pase una velocidad     *
 * en Km/h a m/s. La velocidad se lee por teclado.*                    
 *                                                *
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercio6  extends JFrame implements ActionListener  {
	// declacion de atributos
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	public Ejercio6() {
		
		panel = new JPanel();
		panel.setBounds(10, 10, 580, 580);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		add(panel);
		
		etiqueta = new JLabel("Ingrese la velocidad a Km");
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
		    setSize(600, 300);// esta de codigo es para el tamaño de pantalla 
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Ejercio6();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnviar );{
			System.out.println("Click boton");
			
			etiqueta.setText("Resultado");
			etiqueta.setBounds(20,200, 120,20);
			
			double x = Double.parseDouble(valx.getText());
			
			System.out.println("Resultado:  " + ( x * 0.277778));
			JOptionPane.showMessageDialog(null, "Resultado"	+ (x *0.277778 ) , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			

		}
		
		
	}
	
	
	
	
	

}
