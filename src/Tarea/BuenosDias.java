/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion:Programa Java que lea un nombre y   *
 * muestre por pantalla: “Buenos dias             *
 *      nombre_introducido”.                      *
 *                                                *
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BuenosDias extends JFrame implements ActionListener {
	//declaracion atributos 
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx; 
	
	// Constructor vacio
	public BuenosDias() {
		panel = new JPanel();
		 panel.setBounds(10, 10, 580, 580);
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		  add(panel);
		  
		etiqueta = new JLabel("Ingresa tu nombre ");
		etiqueta.setBounds(50, 20, 200, 30);
		panel.add(etiqueta);
		
		valx = new JTextField();
		valx.setBounds(300, 50, 200, 20);
		panel.add(valx);
		
		// boton
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
		new BuenosDias();
	}
	
	public void actionPerformed(ActionEvent e) {
		//Aqui se resiben los eventos del mouse o del teclado
		if(e.getSource()== btnEnviar) {
			System.out.println("Clik del boton");
			
			etiqueta.setText("Buenos Dias: ");
			etiqueta.setBounds(20,200, 120,20);
			
			String x = valx.getText();

			System.out.println("Buenos Dias:  " + x);
			JOptionPane.showMessageDialog(null, "Buenos Dias "			+ x , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
	}
}



