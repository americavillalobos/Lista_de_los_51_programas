/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa Java que lea dos números y
 *  muestre los números pares entre ellos
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio46 extends JFrame implements ActionListener{
	// declaracion atributos 
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valx;
		private JTextField valy;


		// Constructores
		
		
		// Constructor vacio
		public Ejercicio46() {
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
			new Ejercicio46();
		}
		@Override
	    public void actionPerformed(ActionEvent e) {
	        // Aquí se reciben los eventos del mouse o del teclado
	        if (e.getSource() == btnEnviar) {
	            etiqueta.setText("Resultados: ");
	            etiqueta.setBounds(20, 200, 120, 20);

	            int x = Integer.parseInt(valx.getText());
	            int y = Integer.parseInt(valy.getText());
	            String resultado = "Números pares entre " + x + " y " + y + ": ";

	            for (int i = x; i <= y; i++) {
	                if (i % 2 == 0) {
	                    resultado += i + " ";
	                }
	            }

	            System.out.println(resultado);
	            JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	}


