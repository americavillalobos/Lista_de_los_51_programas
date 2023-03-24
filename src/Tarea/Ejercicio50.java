/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Contar los números introducidos por teclado
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

public class Ejercicio50 extends JFrame implements ActionListener{

    // Declaracion atributos  
    private JLabel etiqueta;
    private JButton btnEnviar;
    private JPanel panel;
    private JTextField valx;
    private int numPositivos; // variable para contar los números positivos introducidos

    // Constructor vacio 
    public Ejercicio50() {
        panel = new JPanel();
        panel.setBounds(10, 10, 380, 380);
        panel.setBackground(Color.pink);
        panel.setLayout(null);
        add(panel);

        etiqueta = new JLabel("Contar los numeros introducidos por teclado ");
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
        numPositivos = 0; // inicializamos la variable en cero
    }

    // Metodo para manejar el evento de clic en el boton
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEnviar) {
            try {
                int x = Integer.parseInt(valx.getText());
                if (x > 0) { // si el número ingresado es positivo, lo contamos
                    numPositivos++;
                }
                JOptionPane.showMessageDialog(null, "Número de positivos introducidos: " + numPositivos);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número entero válido.");
            }
        }
    }

    // Metodo main
    public static void main(String[] args) {
        new Ejercicio50();
    }
}



