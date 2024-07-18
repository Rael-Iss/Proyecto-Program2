import javax.swing.*;
import java.awt.event.*;
import javafx.stage.Window;
import java.awt.*;
/**
 * Write a description of class VentanaNC here.
 * 
* @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaNC extends JFrame implements ActionListener
{
    private TextoT titulo= new TextoT("REGISTRAR NUEVO CLIENTE", 190, 20, 300, 20);
    private BotonGr btnCliente= new BotonGr("Clientes",90,60);
    private BotonGr btnServicio= new BotonGr("Servicios",240,60);
    private BotonGr btnPago= new BotonGr("Pagar",390, 60);
    
    private Texto txtCodigo= new Texto("Codigo", 150, 80, 150, 10);
    private Texto txtNombre= new Texto("Nombre", 150, 120, 150, 10);
    private Texto txtApellido= new Texto("Apellido", 150, 160, 150, 10);
    private Texto txtEmail= new Texto("Email", 150, 200, 150, 10);
    private Texto txtTelefono= new Texto("Teléfono", 150, 240, 150, 10);

    private Caja txCodigo= new Caja(250, 70);
    private Caja txNombre= new Caja(250, 110);
    private Caja txApellido= new Caja(250, 150);
    private Caja txEmail= new Caja(250, 190);
    private Caja txTelefono= new Caja(250, 230);

    private Boton btnRegistrar = new Boton("REGISTRAR", 430, 280);
    private Boton btnCancelar = new Boton("CANCELAR", 270, 280);
    public VentanaNC(){
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
        add(txtApellido);
        add(txApellido);
        add(txtEmail);
        add(txEmail);
        add(txtTelefono);
        add(txTelefono);
 
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
            registroCliente();
            volver();
        }

        if (e.getSource() == btnCancelar) {
            volver();
        }
    }
    
    public void registroCliente(){
        String cod= txCodigo.getText();
        String nom= txNombre.getText();
        String ape= txApellido.getText();
        String ema= txEmail.getText();
        String telef= txTelefono.getText();

            Cliente c= new Cliente(cod, nom, ape, ema, telef); 
            DBA.setCliente(c);
            
            // Limpiar los campos después del registro
            txCodigo.setText("");
            txNombre.setText("");
            txApellido.setText("");
            txEmail.setText("");
            txTelefono.setText("");
        
        setVisible(false);
    }
    
    public static VentanaC frmVentanaCv;
    public void volver(){
        setVisible(false);
        frmVentanaCv= new VentanaC();
    }
}
