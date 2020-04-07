package usta.sistemas;
import javax.swing.*;
import java.awt.*;

public class Formulario04 extends JFrame {

    public Formulario04() {
        super("Ejemplo de BorderLayout");
        // BorderLayout
        setLayout(new BorderLayout(5, 10));
        add(new JButton("1"), BorderLayout.EAST);
        add(new JButton("2"), BorderLayout.SOUTH);
        add(new JButton("3"), BorderLayout.WEST);
        add(new JButton("4"), BorderLayout.NORTH);
        add(new JButton("5"), BorderLayout.CENTER);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Formulario04 aplicacion = new Formulario04();
    }
}
