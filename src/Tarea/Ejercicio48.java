/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa que lea números e indique
 *  si son positivos o negativos y pares o impares
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio48 extends JFrame implements ActionListener{
	// declaracion atributos 
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valx;
		private JTextField valy;


		// Constructores
		
		
		// Constructor vacio
		public Ejercicio48() {
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
			new Ejercicio48();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
		    if(e.getSource()== btnEnviar) {
		        int x = Integer.parseInt(valx.getText());
		        int y = Integer.parseInt(valy.getText());
		        int suma = x + y;
		        
		        etiqueta.setText("Resultado: " + suma);
		        etiqueta.setBounds(20,200, 120,20);

		        String parImpar;
		        if (suma % 2 == 0) {
		            parImpar = "Par";
		        } else {
		            parImpar = "Impar";
		        }
		        etiqueta = new JLabel("Par/Impar: " + parImpar);
		        etiqueta.setBounds(20,230, 120,20);
		        panel.add(etiqueta);

		        String posNeg;
		        if (suma >= 0) {
		            posNeg = "Positivo";
		        } else {
		            posNeg = "Negativo";
		        }
		        etiqueta = new JLabel("Positivo/Negativo: " + posNeg);
		        etiqueta.setBounds(20,260, 120,20);
		        panel.add(etiqueta);

		        JOptionPane.showMessageDialog(null, "Resultado: " + suma, "Titulo", JOptionPane.INFORMATION_MESSAGE);
		    }
		}
}
	

