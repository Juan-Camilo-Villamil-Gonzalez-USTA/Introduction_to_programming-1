package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class formulario02 extends JFrame {

    private Container panel;
    private JButton miboton;

    public formulario02() {
        super("Ejemplo 02 con botón");
        // Configurar componentes ;
        miboton = new JButton("Aceptar");
        miboton.setBounds(100,100,200,100);
        panel = getContentPane();
        panel.add(miboton);
        setLayout(null);
        setVisible(true);
        setSize(250,150);
        setBounds(0,0,400,400);      //para que tenga 400px de ancho y 300px de alto
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        formulario02 aplicacion = new formulario02();
    }
}