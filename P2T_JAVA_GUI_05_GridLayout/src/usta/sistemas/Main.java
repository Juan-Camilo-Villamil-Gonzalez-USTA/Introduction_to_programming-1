package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        super("Ejemplo de GridLayout");
        setLayout(new GridLayout(4, 3, 5, 5));

        for(int i = 1; i <= 10; i++)
            add(new JButton(Integer.toString(i)));
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main aplicacion = new Main();
    }
}
