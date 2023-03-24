/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Comprobar si un número es múltiplo de dos o de tres.
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

public class Ejercicio24 extends JFrame implements ActionListener{
	//Declaracion de atributos 
    private JLabel etiqueta;
    private JButton btnEnviar;
    private JPanel panel;
    private JTextField valx;
    
    public Ejercicio24() {
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
        new Ejercicio24();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnEnviar ) {
            System.out.println("Click boton");

            etiqueta.setText("Resultado");
            etiqueta.setBounds(20,200, 120,20);

            int x = Integer.parseInt(valx.getText());

            // Verificar si el número es múltiplo de dos o de tres
            if (x % 2 == 0) {
                System.out.println("El número es múltiplo de dos");
                JOptionPane.showMessageDialog(null, "El número ingresado es múltiplo de dos", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (x % 3 == 0) {
                System.out.println("El número es múltiplo de tres");
                JOptionPane.showMessageDialog(null, "El número ingresado es múltiplo de tres", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("El número no es múltiplo de dos ni de tres");
                JOptionPane.showMessageDialog(null, "El número ingresado no es múltiplo de dos ni de tres", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
  


