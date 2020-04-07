package usta.sistemas;
import javax.swing.*;
import java.awt.*;

public class Formulario06 extends JFrame {

    public Formulario06()  {
        setTitle("Horno microondas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Creamos el panel p1 para los 10 botones de numeros + star y stop
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        // Add buttons to the panel
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("" + 0)); //agregamos el boton de 0 al final
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));
        //creamos el segun panel P2 para P1 y el textfield
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Aquí saldra el tiempo"),BorderLayout.NORTH);
        //creamos un borderlayout  donde pondremos un boton y los demas paneles
        p2.add(p1, BorderLayout.CENTER);
        // Add p2 and a button to the frame
        add(p2, BorderLayout.EAST);
        add(new Button("Aquí se visualiza la comida"),BorderLayout.CENTER);
        setSize(500, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Formulario06 aplicacion = new Formulario06();
    }
}
