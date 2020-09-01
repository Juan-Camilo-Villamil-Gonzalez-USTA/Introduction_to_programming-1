package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Formulario03 extends JFrame {
    public Formulario03() {
        super("Ejemplo de uso de Layout");
        // Configurar componentes ;
        // Configurar layout ;
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        //agregar 10 nuevos botones al layout
        for (int i = 1; i <= 10; i++)
            add(new JButton("Componente " + i));

        setSize(200, 200);//pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Formulario03 aplicacion = new Formulario03();
    }
}
