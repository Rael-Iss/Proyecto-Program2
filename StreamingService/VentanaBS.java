import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class VentanaBS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaBS extends JFrame implements ActionListener {
    // Create Objects
    private TextoT titulo = new TextoT("BUSCAR SERVICIO", 210, 20, 250, 20);
    private Texto txtCodigo = new Texto("Código", 140, 70, 150, 20);
    private Caja txCodigo = new Caja(200, 65);
    private Boton btnBuscar = new Boton("Buscar", 420, 60);
    private Boton btnVolver = new Boton("Volver", 420, 290);
    
    private Texto txtNombre = new Texto("Nombre", 150, 125, 170, 10);
    private Texto txtPrecio = new Texto("Precio", 150, 165, 150, 10);
    private Texto txtDescripcion = new Texto("Descripción", 150, 205, 150, 10);
    
    private Caja txNombre = new Caja(250, 120);
    private Caja txPrecio = new Caja(250, 160);
    private Caja txDescripcion = new Caja(250, 200);

    public VentanaBS() {
        // add Objects
        add(titulo);
        add(txtCodigo);
        add(txCodigo);
        add(btnBuscar);
        add(btnVolver);
        
        add(txtNombre);
        add(txNombre);
        add(txtPrecio);
        add(txPrecio);
        add(txtDescripcion);
        add(txDescripcion);
                
        // Action Buttons
        btnBuscar.addActionListener(this);
        btnVolver.addActionListener(this);
        
        getContentPane().setBackground(new Color(224, 224, 224));
        // Config Frame
        setLayout(null);
        setTitle("Buscar Cliente");
        setSize(650, 380);
        setLocation(350, 150);
        setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            buscarServicio();
        }
        
        if (e.getSource() == btnVolver) {
            volver();
        }
    }
    
    public void buscarServicio() {
        try {
            String codigo = txCodigo.getText();
            Servicio servicio = DBA.buscarServicioCodigo(codigo);
            
            if (servicio != null) {
                txNombre.setText(servicio.getNombre());
                 txPrecio.setText(Double.toString(servicio.getPrecio()));
                txDescripcion.setText(servicio.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(this, "Servicio no encontrado.");
                limpiarCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }
    
    private void limpiarCampos() {
        txNombre.setText("");
        txPrecio.setText("");
        txDescripcion.setText("");
    }
    
    public static VentanaS frmVentanaSv;
    public void volver(){
        setVisible(false);
        frmVentanaSv= new VentanaS();
    }
}
