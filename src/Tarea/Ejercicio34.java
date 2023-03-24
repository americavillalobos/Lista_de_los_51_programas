/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa que lea tres números enteros H, M, S que contienen hora, minutos y
segundos respectivamente, y comprueba si la hora que indican es una hora válida.
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio34 extends JFrame implements ActionListener {
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valh; // campo para hora
	private JTextField valm; // campo para minutos
	private JTextField vals; // campo para segundos
	
	public Ejercicio34() {
	    panel = new JPanel();
	    panel.setBounds(10, 10, 380, 380);
	    panel.setBackground(Color.pink);
	    panel.setLayout(null);
	    add(panel);

	    etiqueta = new JLabel("Ingrese una hora válida");
	    etiqueta.setBounds(20, 20, 200, 30);
	    panel.add(etiqueta);

	    valh = new JTextField(); // campo para hora
	    valh.setBounds(40, 50, 50, 20);
	    panel.add(valh);

	    valm = new JTextField(); // campo para minutos
	    valm.setBounds(110, 50, 50, 20);
	    panel.add(valm);

	    vals = new JTextField(); // campo para segundos
	    vals.setBounds(180, 50, 50, 20);
	    panel.add(vals);

	    btnEnviar = new JButton("Comprobar"); // botón para comprobar
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
	    new Ejercicio34();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    // obtener los valores de hora, minutos y segundos
	    int h = Integer.parseInt(valh.getText());
	    int m = Integer.parseInt(valm.getText());
	    int s = Integer.parseInt(vals.getText());

	    // comprobar si los valores representan una hora válida
	    if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
	        JOptionPane.showMessageDialog(panel, "La hora ingresada es válida.");
	    } else {
	        JOptionPane.showMessageDialog(panel, "La hora ingresada no es válida.");
	    }
	}
}
