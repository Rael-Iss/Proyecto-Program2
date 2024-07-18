    
import javax.swing.*;
import java.awt.event.*;
import javafx.stage.Window;
import java.awt.*;
/**
 * Write a description of class VentanaC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaC extends JFrame implements ActionListener
{
    //Create Objects
    private TextoT titulo= new TextoT("STREAMING SERVICE", 210, 20, 250, 20);
    private BotonGr btnCliente= new BotonGr("Clientes",23,50);
    private BotonGr btnServicio= new BotonGr("Servicios",163,50);
    private BotonGr btnSuscripcion= new BotonGr("Suscripciones",313,50);
    private BotonGr btnPago= new BotonGr("Pagos",463, 50);
    private Boton btnNuevoCliente= new Boton("Nuevo Cliente",165,150);
    private Boton btnVerCliente= new Boton("Ver Clientes",320,150);
    public VentanaC(){
        //add Objects;
        add(titulo);
        add(btnCliente);
        add(btnServicio);
        add(btnPago);
        add(btnSuscripcion);
        add(btnNuevoCliente);
        add(btnVerCliente);
                
        //Action Buttons
        btnCliente.addActionListener(this);
        btnServicio.addActionListener(this);
        btnPago.addActionListener(this);
        btnSuscripcion.addActionListener(this);
        btnNuevoCliente.addActionListener(this);
        btnVerCliente.addActionListener(this);
        
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
    private VentanaSus frmVentanaSus;
    private VentanaNC frmVentanaNC;
    private VentanaBC frmVentanaBC;
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
        
        if (e.getSource()==btnSuscripcion) 
        {
            setVisible(false);
            frmVentanaSus= new VentanaSus();
        }
        
        if (e.getSource()==btnNuevoCliente)
        {
            setVisible(false);
            frmVentanaNC= new VentanaNC();
        }
        
        if (e.getSource()==btnVerCliente)
        {
            setVisible(false);
            frmVentanaBC= new VentanaBC();
        }
    }
}
