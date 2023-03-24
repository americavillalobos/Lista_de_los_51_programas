/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:  Programa que lea dos caracteres por teclado y compruebe si son iguales
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio26 extends JFrame implements ActionListener {

	// declaracion atributos 
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valx;
		private JTextField valy;


		// Constructores
		
		
		// Constructor vacio
		public Ejercicio26() {
			panel = new JPanel();
			panel.setBounds(10, 10, 380, 380);
			panel.setBackground(Color.pink);
			panel.setLayout(null);
			add(panel);
			
			etiqueta = new JLabel(" suma de dos numeros");
			etiqueta.setBounds(20, 20, 200, 30);
			panel.add(etiqueta);
			
			etiqueta = new JLabel("X: ");
			etiqueta.setBounds(20, 50, 200, 20);
			panel.add(etiqueta);
		
			valx = new JTextField();
			valx.setBounds(40, 50, 200, 20);
	        panel.add(valx);	
	        
	        etiqueta = new JLabel("Y: ");
			etiqueta.setBounds(20, 100, 200, 20);
			panel.add(etiqueta);
		
			valy = new JTextField();
			valy.setBounds(40, 100, 200, 20);
	        panel.add(valy);		
			
			
			
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(50, 300, 300, 40);
			btnEnviar.addActionListener(this);
			panel.add(btnEnviar);
			
			setResizable(false);
			setLayout(null);
			setLocationRelativeTo(null); 
			setSize(400,400);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		// Metodos
	
		
		public static void main(String[] args) {
			new Ejercicio25();
		}
		
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == btnEnviar) {
		        System.out.println("Clik del boton");

		        etiqueta.setText("Resultado: ");
		        etiqueta.setBounds(20, 200, 120, 20);

		        // Leer los valores de los campos de texto
		        String x = valx.getText();
		        String y = valy.getText();
		        
		        // Comprobar si son iguales
		        if (x.equals(y)) {
		            JOptionPane.showMessageDialog(null, "Los caracteres son iguales.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Los caracteres son diferentes.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
}
}