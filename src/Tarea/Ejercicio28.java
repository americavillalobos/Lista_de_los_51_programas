/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:  Programa que lea un carácter y compruebe si es un número (Carácter entre '0' y '9').
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio28 extends JFrame implements ActionListener {
	// declaracion atributos 
			private JLabel etiqueta;
			private JButton btnEnviar;
			private JPanel panel;
			private JTextField valx;
			private JTextField valy;
			
			public Ejercicio28() {
				panel = new JPanel();
				panel.setBounds(10, 10, 380, 380);
				panel.setBackground(Color.pink);
				panel.setLayout(null);
				add(panel);
				
				etiqueta = new JLabel("Ingrese un caracter");
				etiqueta.setBounds(20, 20, 200, 30);
				panel.add(etiqueta);
				
				valx = new JTextField();
				valx.setBounds(40, 50, 200, 20);
		        panel.add(valx);
		        
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
			
			public static void main(String[] args) {
				new Ejercicio28();
			}
			
			public void actionPerformed(ActionEvent e) {
			    if (e.getSource() == btnEnviar) {
			        System.out.println("Clik del boton");

			        etiqueta.setText("Resultado: ");
			        etiqueta.setBounds(20, 200, 120, 20);

			        // Leer los valores de los campos de texto
			        String x = valx.getText();
			        
			        // Comprobar si es un número
			        if (x.length() == 1 && Character.isDigit(x.charAt(0))) {
			            JOptionPane.showMessageDialog(null, "El caracter introducido es un número.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			        } else {
			            JOptionPane.showMessageDialog(null, "El caracter introducido no es un número.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			}

			
	}      
	


