package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario07 extends JFrame {
    JButton boton;
    public Formulario07() {
        setTitle("Botón con pitido");
        boton = new JButton("Pulsa!");
        boton.setBounds(150,80,100,20);
        add(boton);
        boton.addActionListener(new OyenteBoton());
        setLayout(null);
        setBounds(0,0,400,200);      //para que tenga 400px de ancho y 300px de alto
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Formulario07 aplicacion = new Formulario07();
    }
}
class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
    }
}


