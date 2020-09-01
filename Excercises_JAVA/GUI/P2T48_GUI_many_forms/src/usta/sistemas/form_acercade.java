package usta.sistemas;

import javax.swing.*;

public class form_acercade extends JFrame {
    public form_acercade(){
        JLabel label_titulo = new JLabel("Acerca de...");
        label_titulo.setBounds(250,10,300, 30);
        add(label_titulo);

        JLabel label_descri = new JLabel("this software was maked by: xxxxxxxxxxx..");
        label_descri.setBounds(10,15,580, 30);
        add(label_descri);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //se active el botón de cerrar


    }
}
