package usta.sistemas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {

    JButton button1;

    public form_menu(){
      //label
      JLabel label1 = new JLabel("SOFTWARE DE PRUEBA");
      label1.setBounds(250,10,300, 30);
      add(label1);
      // label de quien lo creo
        JLabel label2 = new JLabel("Creado por: Luis Fdo Castellanos G");
        label2.setBounds(5,300, 595,20);
        add(label2);
      //button
       button1 = new JButton("Iniciar");
       button1.setBounds(250,200, 100, 50);
       button1.addActionListener(new button1_clic());
       add(button1);
      setLayout(null);
      setVisible(true);
      setResizable(false);
      setBounds(0,0,600,400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);  //se active el botón de cerrar
    }

}
class button1_clic implements ActionListener{
    public  void actionPerformed(ActionEvent e){
        form_principal form_principal1= new form_principal();
    }
}


