import javax.swing.*;
import java.awt.event.*;
import javafx.stage.Window;
import java.awt.*;
/**
 * Write a description of class VentanaNS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaNS extends JFrame implements ActionListener
{
    //Create Objects
    private TextoT titulo= new TextoT("REGISTRAR NUEVO SERVICIO", 190, 20, 300, 20);
    private BotonGr btnCliente= new BotonGr("Clientes",90,60);
    private BotonGr btnServicio= new BotonGr("Servicios",240,60);
    private BotonGr btnPago= new BotonGr("Pagar",390, 60);
    
    private Texto txtCodigo= new Texto("Codigo", 150, 80, 150, 10);
    private Texto txtNombre= new Texto("Nombre", 150, 120, 150, 10);
    private Texto txtPrecio= new Texto("Precio", 150, 160, 150, 10);
    private Texto txtDescripcion= new Texto("Descripción", 150, 200, 150, 10);

    private Caja txCodigo= new Caja(250, 70);
    private Caja txNombre= new Caja(250, 110);
    private Caja txPrecio= new Caja(250, 150);
    private Caja txDescripcion= new Caja(250, 190);

    private Boton btnRegistrar = new Boton("REGISTRAR", 430, 280);
    private Boton btnCancelar = new Boton("CANCELAR", 270, 280);
    public VentanaNS(){
        //add Objects;
        add(titulo);
        /*add(btnCliente);
        add(btnServicio);
        add(btnPago);*/
        add(btnRegistrar);
        add(btnCancelar);
        
        add(txtCodigo);
        add(txCodigo);
        add(txtNombre);
        add(txNombre);
        add(txtPrecio);
        add(txPrecio);
        add(txtDescripcion);
        add(txDescripcion);
                
        //Action Buttons
        btnCliente.addActionListener(this);
        btnServicio.addActionListener(this);
        btnPago.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        
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
        if (e.getSource() == btnRegistrar) {
            registroServicio();
            volver();
        }

        if (e.getSource() == btnCancelar) {
            volver();
        }
    }
    
    public void registroServicio(){
        String cod= txCodigo.getText();
        String nom= txNombre.getText();
        double precio= Double.parseDouble(txPrecio.getText());
        String desc= txDescripcion.getText();

            Servicio s= new Servicio(cod, nom, precio, desc); 
            DBA.setServicio(s);
            
            // Limpiar los campos después del registro
            txCodigo.setText("");
            txNombre.setText("");
            txPrecio.setText("");
            txDescripcion.setText("");
        
        setVisible(false);
    }
    
    public static VentanaS frmVentanaSv;
    public void volver(){
        setVisible(false);
        frmVentanaSv= new VentanaS();
    }
}
