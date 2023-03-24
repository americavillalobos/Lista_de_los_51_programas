/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Comprobar si dos números enteros terminan con la misma cifra.
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio22 extends JFrame implements ActionListener{
	// declaracion atributos 
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valx;
		private JTextField valy;


		// Constructores
		
		
		// Constructor vacio
		public Ejercicio22() {
			panel = new JPanel();
			panel.setBounds(10, 10, 380, 380);
			panel.setBackground(Color.pink);
			panel.setLayout(null);
			add(panel);
			
			etiqueta = new JLabel(" compara numeros");
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
			//center el JFrame en la Pantalla
		
			setLocationRelativeTo(null); // este metodo se utiliza para centrar la pantalla
			setSize(400,400);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		// Metodos

		public static void main(String[] args) {
			new Ejercicio22();
		}
		
		public void actionPerformed(ActionEvent e) {
			//Aqui se resiben los eventos del mouse o del teclado
			if(e.getSource() == btnEnviar) {
			    System.out.println("Click boton");

			    etiqueta.setText("Resultado");
			    etiqueta.setBounds(20,200, 120,20);

			    int x = Integer.parseInt(valx.getText());
			    int y = Integer.parseInt(valy.getText());

			    if (x % 10 == y % 10) {
			        JOptionPane.showMessageDialog(null, "Los números ingresados terminan con la misma cifra", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			    } else {
			        JOptionPane.showMessageDialog(null, "Los números ingresados no terminan con la misma cifra", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			    }
			}
		}

}
