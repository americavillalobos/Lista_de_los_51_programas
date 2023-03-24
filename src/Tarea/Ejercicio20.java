/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion: Programa que lea dos números y comprueba si son iguales
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio20 extends JFrame implements ActionListener{

	//Declaracion de atributos 
		private JLabel etiqueta, etiqueta2;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valx, valy;

		public Ejercicio20() {
			panel = new JPanel();
			panel.setBounds(10, 10, 580, 580);
			panel.setBackground(Color.MAGENTA);
			panel.setLayout(null);
			add(panel);

			etiqueta = new JLabel("Ingresa un número entero de 5 cifras");
			etiqueta.setBounds(50, 20, 300, 30);
			panel.add(etiqueta);

			valx = new JTextField();
			valx.setBounds(300, 50, 200, 20);
			panel.add(valx);

			etiqueta2 = new JLabel("Ingresa otro número entero de 5 cifras");
			etiqueta2.setBounds(50, 80, 300, 30);
			panel.add(etiqueta2);

			valy = new JTextField();
			valy.setBounds(300, 110, 200, 20);
			panel.add(valy);

			//Boton
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(100, 160, 400, 40);
			btnEnviar.addActionListener(this);
			panel.add(btnEnviar);

			setResizable(false);
			setLayout(null);
			setSize(600,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public static void main(String[] args) {
			new Ejercicio20();
		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar ) {
				System.out.println("Click boton");

				etiqueta.setText("Resultado");
				etiqueta.setBounds(20,200, 120,20);

				int x = Integer.parseInt(valx.getText());
				int y = Integer.parseInt(valy.getText());

				if (x == y) {
					JOptionPane.showMessageDialog(null, "Los números ingresados son iguales.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Los números ingresados no son iguales.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
}
