import javax.swing.*;
import java.awt.event.*;
import javafx.stage.Window;
import java.awt.*;
/**
 * Write a description of class VnetanaNSus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaNSus extends JFrame implements ActionListener
{
    private TextoT titulo= new TextoT("NUEVA SUSCRIPCIÓN", 190, 20, 300, 20);
    private BotonGr btnCliente= new BotonGr("Clientes",90,60);
    private BotonGr btnServicio= new BotonGr("Servicios",240,60);
    private BotonGr btnPago= new BotonGr("Pagar",390, 60);
    
    private Texto txtCodigo= new Texto("Codigo", 140, 80, 150, 10);
    private Texto txtCodigoCli= new Texto("Codigo Cliente", 140, 120, 150, 10);
    private Texto txtCodigoSer= new Texto("Codigo Servicio", 140, 160, 150, 10);
    private Texto txtFechaInicio= new Texto("Fecha", 140, 200, 150, 10);
    private Texto txtFrecCobro= new Texto("Mensual-Anual", 140, 240, 150, 10);

    private Caja txCodigo= new Caja(260, 70);
    private Caja txCodigoCli= new Caja(260, 110);
    private Caja txCodigoSer= new Caja(260, 150);
    private Caja txFechaInicio= new Caja(260, 190);
    private Caja txFrecCobro= new Caja(260, 230);

    private Boton btnAceptar = new Boton("ACEPTAR", 430, 280);
    private Boton btnCancelar = new Boton("CANCELAR", 270, 280);
    public VentanaNSus(){
        //add Objects;
        add(titulo);
        /*add(btnCliente);
        add(btnServicio);
        add(btnPago);*/
        add(btnAceptar);
        add(btnCancelar);
        
        add(txtCodigo);
        add(txCodigo);
        add(txtCodigoCli);
        add(txCodigoCli);
        add(txtCodigoSer);
        add(txCodigoSer);
        add(txtFechaInicio);
        add(txFechaInicio);
        add(txtFrecCobro);
        add(txFrecCobro);
 
        //Action Buttons
        btnCliente.addActionListener(this);
        btnServicio.addActionListener(this);
        btnPago.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);
        
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
        if (e.getSource() == btnAceptar) {
            registroSuscripcion();
            volver();
        }

        if (e.getSource() == btnCancelar) {
            volver();
        }
    }
    
    public void registroSuscripcion() {
        int cod = Integer.parseInt(txCodigo.getText());
        String codC = txCodigoCli.getText();
        String codS = txCodigoSer.getText();
        String fec = txFechaInicio.getText();
        String cob = txFrecCobro.getText();
    
        // Buscar si el cliente con el código ingresado existe
        Cliente cliente = DBA.buscarClienteCodigo(codC);
        // Buscar si el servicio con el código ingresado existe
        Servicio servicio = DBA.buscarServicioCodigo(codS);

        if (cliente != null && servicio != null) {
            // Si ambos existen, registrar la suscripción
            Suscripcion sus = new Suscripcion(cod, codC, codS, fec, cob);
            DBA.setSuscripcion(sus);
    
            // Limpiar los campos después del registro
            txCodigo.setText("");
            txCodigoCli.setText("");
            txCodigoSer.setText("");
            txFechaInicio.setText("");
            txFrecCobro.setText("");
    
            setVisible(false);
        } else {
            // Mostrar un mensaje de error si el cliente o servicio no existen
            String errorMsg = "Error: ";
            if (cliente == null) {
                errorMsg += "Cliente no encontrado. ";
            }
            if (servicio == null) {
                errorMsg += "Servicio no encontrado. ";
            }
            JOptionPane.showMessageDialog(this, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static VentanaSus frmVentanaSusv;
    public void volver(){
        setVisible(false);
        frmVentanaSusv= new VentanaSus();
    }
}
