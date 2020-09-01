package usta.sistemas;

import javax.swing.*;

public class Formulario extends JFrame{

    public Formulario(){
        //label (etiqueta)
        JLabel label1 = new JLabel("Este es mi primer programa GUI");
        //la ubicamos en el formulario
        label1.setBounds(5,5,300,30);
        //agregamos al fomulario
        add(label1);
        //Agregar un boton
        JButton button1 = new JButton("Aceptar");
        button1.setBounds(180,180,100, 50);
        add(button1);
        setLayout(null);  //ubicar formulario en la mitad
        setVisible(true);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        //Formulario formulario1 = new Formulario();
        Formulario2 formulario2= new Formulario2();
    }
}
