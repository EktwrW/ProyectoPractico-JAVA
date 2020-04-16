
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Final1 extends JFrame implements ActionListener{
    
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    public static String texto = "";
    
    public Final1(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(000, 015, 117));
        setIconImage(new ImageIcon(getClass().getResource("images/icon-fcb.png")).getImage());
        
        ImageIcon imagen = new ImageIcon("images/cabezal-fcb.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel(" Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 1, 18));
        label2.setForeground(Color.white);
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(Color.white);
        add(label3);
        
        label4 = new JLabel("©2017 FC Barcelona - Spain");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(Color.white);
        add(label4);
        
        textfield1 = new JTextField();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(000, 015, 117));
        add(textfield1);
        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(Color.white);
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(000, 015, 117));
        boton1.addActionListener(this);
        add(boton1);
    }
    
    public void actionPerformed(ActionEvent w){
        if(w.getSource() == boton1){
            texto = textfield1.getText().trim();
            if(texto.equals("")){
              JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            } else {
              Final2 ventanalicencia = new Final2();
              ventanalicencia.setBounds(0,0,600,360);
              ventanalicencia.setVisible(true);
              ventanalicencia.setResizable(false);
              ventanalicencia.setLocationRelativeTo(null);
              this.setVisible(false);
            }
        }
    }
    
    public static void main (String args[]){
        Final1 ventanabienvenida = new Final1();
        ventanabienvenida.setBounds(0,0,350,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
        }
}