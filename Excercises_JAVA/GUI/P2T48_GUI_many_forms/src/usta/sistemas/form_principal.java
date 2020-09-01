package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form_principal extends JFrame {
    public form_principal(){

        setTitle("----Menú principal----");
        setLayout(new BorderLayout());
        //panel superior
        JLabel label_menu = new JLabel("MENÚ PRINCIPAL",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        JPanel panel_superior = new JPanel();
        panel_superior.add(label_menu);

        //Panel izquierdo: donde van a estar los botones
        JPanel panel_izquierdo= new JPanel();
        //le decimos que queremos que el panel tenga siete filas (una para cada botón)
        panel_izquierdo.setLayout(new GridLayout(7,1));
        //creamos el primer boton
        JButton boton_acercade= new JButton("Acerca de...");
        boton_acercade.setBounds(0,0,100,30);
        boton_acercade.addActionListener( new buton_acercade_clic());

        panel_izquierdo.add(boton_acercade);
        panel_izquierdo.add(new JLabel(""));  //fila vacia
        //creamos el segundo boton
        JButton boton_formulario1= new JButton("ir a formulario 1");
        boton_formulario1.setBounds(0,0,100,30);
        boton_formulario1.addActionListener(new boton_formulario1_clic());
        panel_izquierdo.add(boton_formulario1);
        panel_izquierdo.add(new JLabel(""));  //fila vacia
        //creamos el tercer boton
        JButton boton_formulario2= new JButton("ir a formulario 2");
        boton_formulario2.setBounds(0,0,100,30);
        panel_izquierdo.add(boton_formulario2);

        //agregamos los planes al Jframe (formulario)
        add(panel_superior,BorderLayout.NORTH);
        add(panel_izquierdo,BorderLayout.WEST);
        //agregamos otro label en la parte inferior del formulario
        add(new JLabel("Creado por: xxxxxxx",SwingConstants.CENTER),BorderLayout.SOUTH);

        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //se active el botón de cerrar
    }
}
class buton_acercade_clic implements ActionListener {
    public  void actionPerformed(ActionEvent e){
        form_acercade form_acercade1 = new form_acercade();
    }
}
class boton_formulario1_clic implements ActionListener {
    public  void actionPerformed(ActionEvent e){
        form_student form_student = new form_student();
    }
}
