/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa Java que muestre los números
 *  desde N hasta 1 utilizando las instrucciones
for, while y do .. while
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio44 extends JFrame implements ActionListener{
	// declaracion atributos
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	// Constructor vacio
	public Ejercicio44() {
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
		new Ejercicio44();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Aqui se resiben los eventos del mouse o del teclado
		if(e.getSource()== btnEnviar) {
			System.out.println("Clik del boton");
			etiqueta.setText("Resultado: ");
			etiqueta.setBounds(20,200, 120,20);
			int x = Integer.parseInt(valx.getText());
			System.out.println("Resultado:  " + (x));
			JOptionPane.showMessageDialog(null, "Resultado"	+ (x) , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			
			//Mostrar los números del 1 al N
			int n = Integer.parseInt(valx.getText());
			
			// Usando instrucción for
			for(int i = n; i >= 1; i--) {
				System.out.println(i);
			}
			
			// Usando instrucción while
			int j = n;
			while(j >= 1) {
				System.out.println(j);
				j--;
			}
			
			// Usando instrucción do...while
			int k = n;
			do {
				System.out.println(k);
				k--;
			} while(k >= 1);
		}
	}
}
