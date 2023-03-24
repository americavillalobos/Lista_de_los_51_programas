/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa que calcula el número de
 * la suerte de una persona a partir de su fecha de
nacimiento.
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

public class Ejercicio14 extends JFrame implements  ActionListener {
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	private JTextField valy;
	
	public Ejercicio14() {
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
		
		//setLocationRelativeTo(null);  este metodo se utiliza para centrar la pantalla
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
	public static void main(String[] args) {
		new Ejercicio14();
	}
	public void actionPerformed(ActionEvent e) {
		//Aqui se resiben los eventos del mouse o del teclado
		if(e.getSource()== btnEnviar) {
			System.out.println("Clik del boton");
			
			etiqueta.setText("Resultado: ");
			etiqueta.setBounds(20,200, 120,20);
			
			int x = Integer.parseInt(valx.getText());
			
			int y = Integer.parseInt(valy.getText());
			System.out.println("Resultado:  " + x *(1+y)/100);
			JOptionPane.showMessageDialog(null, "Resultado"	+ x *(1+y)/100 , "Titulo", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
	}
	
	

}
