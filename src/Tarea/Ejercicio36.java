/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa para pasar una calificación numérica a alfabética.
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio36 extends JFrame implements ActionListener {
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	private JTextField valy;
	private JTextField valz;

	public Ejercicio36() {
		panel = new JPanel();
		panel.setBounds(10, 10, 380, 380);
		panel.setBackground(Color.pink);
		panel.setLayout(null);
		add(panel);

		etiqueta = new JLabel("Ingrese una calificacion");
		etiqueta.setBounds(20, 20, 200, 30);
		panel.add(etiqueta);

		valx = new JTextField();
		valx.setBounds(40, 50, 200, 20);
        panel.add(valx);              

        valy = new JTextField();
		valy.setBounds(40, 100, 200, 20);
        panel.add(valy);              

        valz = new JTextField();
		valz.setBounds(40, 150, 200, 20);
        panel.add(valz);              

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
		new Ejercicio36();
	}

	private String calificacionAlfabetica(int calificacionNumerica) {
		String calificacionAlfabetica = "";
		if (calificacionNumerica >= 90) {
			calificacionAlfabetica = "A";
		} else if (calificacionNumerica >= 80) {
			calificacionAlfabetica = "B";
		} else if (calificacionNumerica >= 70) {
			calificacionAlfabetica = "C";
		} else if (calificacionNumerica >= 60) {
			calificacionAlfabetica = "D";
		} else {
			calificacionAlfabetica = "F";
		}
		return calificacionAlfabetica;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(valx.getText());
		int y = Integer.parseInt(valy.getText());
		int z = Integer.parseInt(valz.getText());

		int promedio = (x + y + z) / 3;
		String calificacion = calificacionAlfabetica(promedio);

		JOptionPane.showMessageDialog(this, "El promedio es " + promedio + ", la calificación es " + calificacion);
	}
}

