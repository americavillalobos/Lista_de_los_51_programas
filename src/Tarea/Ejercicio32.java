/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa que lea dos números por teclado 
 * y muestre el resultado de la división del
mayor entre el menor. Se debe comprobar que el
 divisor no puede ser cero.
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Ejercicio32 extends JFrame implements ActionListener{
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	private JTextField valy;
	
	public Ejercicio32() {
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
	public static void main(String[] args) {
		new Ejercicio32();
	}
	
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEnviar) {
            try {
                double num1 = Double.parseDouble(valx.getText());
                double num2 = Double.parseDouble(valy.getText());

                if (num2 == 0) {
                    etiqueta.setText("El segundo número no puede ser cero");
                } else {
                    double mayor = Math.max(num1, num2);
                    double menor = Math.min(num1, num2);
                    double resultado = mayor/menor;
                    etiqueta.setText("El resultado es: " + resultado);
                }
            } catch (NumberFormatException ex) {
                etiqueta.setText("Ingrese números válidos");
            }
        }
    }

}
