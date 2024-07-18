    
import javax.swing.*;
import java.awt.event.*;
import javafx.stage.Window;
import java.awt.*;
/**
 * Write a description of class SistemaMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SistemaMenu extends JFrame implements ActionListener
{
    //Create Objects
    private Texto titulo= new Texto("STREAMING SERVICE", 240, 10, 150, 10);
    private BotonGr btnCliente= new BotonGr("Clientes",23,50);
    private BotonGr btnServicio= new BotonGr("Servicios",163,50);
    private BotonGr btnSuscripcion= new BotonGr("Suscripciones",313,50);
    private BotonGr btnPago= new BotonGr("Pagos",463, 50);

    public SistemaMenu()
    {
        //add Objects;
        add(titulo);
        add(btnCliente);
        add(btnServicio);
        add(btnPago);
        add(btnSuscripcion);
                
        //Action Buttons
        btnCliente.addActionListener(this);
        btnServicio.addActionListener(this);
        btnPago.addActionListener(this);
        btnSuscripcion.addActionListener(this);
        
        getContentPane().setBackground(new Color(224, 224, 224));
        //Config Frame
        setLayout(null);
        setTitle("LOGIN");
        setSize(650, 380);
        setLocation(350, 150);
        setVisible(true);
        }
     
    public static VentanaC frmVentanaC;
    public static VentanaS frmVentanaS;
    public static VentanaP frmVentanaP;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==btnCliente) 
        {
            setVisible(false);
            frmVentanaC= new VentanaC();
        }
            
        if (e.getSource()==btnServicio) 
        {
            setVisible(false);
            frmVentanaS= new VentanaS();
        }
            
        if (e.getSource()==btnPago) 
        {
            setVisible(false);
            frmVentanaP= new VentanaP();
        }
    }
}