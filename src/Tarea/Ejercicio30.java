/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa para comprobar si un número de tres cifras es capicúa.
 *************************************************/
package Tarea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio30 extends JFrame implements ActionListener{
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	
	public Ejercicio30() {
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
		new Ejercicio30();
	}
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnEnviar) {
	        System.out.println("Clic del boton");

	        etiqueta.setText("Resultado: ");
	        etiqueta.setBounds(20, 200, 120, 20);

	        // Leer los valores de los campos de texto
	        String x = valx.getText();

	        // Comprobar si es un número
	        if (x.length() != 3 || !Character.isDigit(x.charAt(0)) || !Character.isDigit(x.charAt(1)) || !Character.isDigit(x.charAt(2))) {
	            JOptionPane.showMessageDialog(null, "El caracter introducido no es un número de tres cifras.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            // Comprobar si es capicúa
	            if (x.charAt(0) == x.charAt(2)) {
	                JOptionPane.showMessageDialog(null, "El número " + x + " es capicúa.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(null, "El número " + x + " no es capicúa.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	            }
	        }
	    }
	}
}
