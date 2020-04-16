import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Final2 extends JFrame implements ActionListener, ChangeListener{
    
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre = "";
    
    public Final2(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de Uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon-fcb.png")).getImage());
        Final1 ventanaFinal1 = new Final1();
        nombre = ventanaFinal1.texto;
  
        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(Color.black);
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN EXPLÍCITA DEL PROGRAMADOR." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  HECTOR ANTONIO WALDMANN NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (EMPRESA DE DISEÑO Y HECTOR WALDMANN), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR ESCRIBIR A:" + 
                    "\n          hwaldmann@gmail.com");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);
        
        check1 = new JCheckBox("Yo " + nombre + " Acepto");
        check1.setBounds(10,250,150,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/logo-fcb2.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,140,300,300);
        this.repaint();
        add(label2);
        
    }
    
    public void stateChanged(ChangeEvent w){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
            } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
            }
        }

    public void actionPerformed(ActionEvent w){
        if(w.getSource() == boton1){
          Final3 ventanaPrincipal = new Final3();
          ventanaPrincipal.setBounds(0,0,640,535);
          ventanaPrincipal.setVisible(true);
          ventanaPrincipal.setResizable(false);
          ventanaPrincipal.setLocationRelativeTo(null);
          this.setVisible(false);
            } else if(w.getSource() == boton2){
          Final1 ventanabienvenida = new Final1();
          ventanabienvenida.setBounds(0,0,350,450);
          ventanabienvenida.setVisible(true);
          ventanabienvenida.setResizable(false);
          ventanabienvenida.setLocationRelativeTo(null);
          this.setVisible(false);
            }
        }

    
    
    public static void main (String args[]){
        Final2 ventanalicencia = new Final2();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        }
}