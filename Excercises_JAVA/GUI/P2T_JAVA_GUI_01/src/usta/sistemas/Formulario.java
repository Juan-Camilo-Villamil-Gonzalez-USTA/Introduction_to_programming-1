package usta.sistemas;

import javax.swing.*;

public class Formulario extends JFrame{
    // Constantes y componentes (objetos)
    private JLabel label1;

    public Formulario(){
        // Configurar Componentes ;
        label1 = new JLabel("Mi primer formulario usando el GUI Swing");
        label1.setBounds(5,5,300,300);
        add(label1);
        setLayout(null);                            //para ubicar cosas en el formulario (x,y)
        setVisible(true);                           //para que se haga visible
        setBounds(0,0,400,300); //para que tenga 400px de ancho y 300px de alto
        setLocationRelativeTo(null);
        // Configurar Manejadores Eventos ;
        // Terminar la aplicación al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]){

        Formulario formulario1 = new Formulario();
    }
}
