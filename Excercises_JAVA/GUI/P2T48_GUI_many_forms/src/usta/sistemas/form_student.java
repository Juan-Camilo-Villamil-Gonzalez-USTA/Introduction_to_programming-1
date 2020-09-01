package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_student extends JFrame {
    JTextField text_name, text_lastname,text_faculty;
    public form_student(){
        setTitle("----Input the new student----");
        setLayout(new BorderLayout());
        //panel superior
        JLabel label_menu = new JLabel("New student",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,16));
        JPanel panel_superior = new JPanel();
        panel_superior.add(label_menu);

        //Panel central donde van a estar las etiquetas y los cajas de texto
        JPanel panel_central= new JPanel();
        panel_central.setLayout(new GridLayout(5,2));
        panel_central.add(new JLabel(""));panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Name:"));
        panel_central.add(text_name=new JTextField());
        panel_central.add(new JLabel("LastName:"));
        panel_central.add(text_lastname= new JTextField(""));
        panel_central.add(new JLabel("Faculty:"));
        panel_central.add(text_faculty= new JTextField(""));
        panel_central.add(new JLabel(""));panel_central.add(new JLabel(""));

        JPanel panel_inferior= new JPanel();
        JButton boton_guardar= new JButton("Guardar");
        boton_guardar.setBounds(0,0,100,30);
        boton_guardar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });

        panel_inferior.add(boton_guardar);

        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        add(panel_inferior,BorderLayout.SOUTH);

        //parametros del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
    }
    private void showDialog()
    {
        //creamos un formulario que sea modal (osea que no se pueda cerrar)
        JDialog dialog = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
        JPanel panel_central= new JPanel();
        panel_central.add(new JLabel("Se guardo con exito: \n"+text_name.getText(),SwingConstants.CENTER));
        dialog.add(panel_central,BorderLayout.CENTER);
        dialog.setBounds(0, 0, 300, 200);
        setLocationRelativeTo(null);
        dialog.setVisible(true);

    }

}
