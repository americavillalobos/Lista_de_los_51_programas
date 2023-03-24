/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion: . Programa Java que lea un número entero y calcule si es positivo o negativo.
 *************************************************/
package Tarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio18 extends JFrame implements ActionListener{
	//Declaracion de atributos 
    private JLabel etiqueta;
    private JButton btnEnviar;
    private JPanel panel;
    private JTextField valx;
    
    public Ejercicio18() {
        panel = new JPanel();
        panel.setBounds(10, 10, 580, 580);
        panel.setBackground(Color.MAGENTA);
        panel.setLayout(null);
        add(panel);

        etiqueta = new JLabel("Ingresa un número entero");
        etiqueta.setBounds(50, 20, 300, 30);
        panel.add(etiqueta);

        valx = new JTextField();
        valx.setBounds(300, 50, 200, 20);
        panel.add(valx);

        //Boton
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(100, 100, 400, 40);
        btnEnviar.addActionListener(this);
        panel.add(btnEnviar);

        setResizable(false);
        setLayout(null);
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ejercicio18();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnEnviar );{
            System.out.println("Click boton");

            etiqueta.setText("Resultado");
            etiqueta.setBounds(20,200, 120,20);

            int x = Integer.parseInt(valx.getText());

            String resultado;

            if(x > 0){
                resultado = "El número ingresado es positivo";
            }
            else if(x < 0){
                resultado = "El número ingresado es negativo";
            }
            else{
                resultado = "El número ingresado es cero";
            }

            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
	
}
