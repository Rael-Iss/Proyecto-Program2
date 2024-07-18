import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class VentanaBC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaBC extends JFrame implements ActionListener {
    // Create Objects
    private TextoT titulo = new TextoT("BUSCAR CLIENTE", 210, 20, 250, 20);
    private Texto txtCodigo = new Texto("Código", 140, 70, 150, 20);
    private Caja txCodigo = new Caja(200, 65);
    private Boton btnBuscar = new Boton("Buscar", 420, 60);
    private Boton btnVolver = new Boton("Volver", 420, 290);
    
    private Texto txtNombre = new Texto("Nombre", 150, 125, 170, 10);
    private Texto txtApellido = new Texto("Apellido", 150, 165, 150, 10);
    private Texto txtEmail = new Texto("Email", 150, 205, 150, 10);
    private Texto txtTelefono = new Texto("Teléfono", 150, 245, 150, 10);

    private Caja txNombre = new Caja(250, 120);
    private Caja txApellido = new Caja(250, 160);
    private Caja txEmail = new Caja(250, 200);
    private Caja txTelefono = new Caja(250, 240);

    public VentanaBC() {
        // add Objects
        add(titulo);
        add(txtCodigo);
        add(txCodigo);
        add(btnBuscar);
        add(btnVolver);
        
        add(txtNombre);
        add(txNombre);
        add(txtApellido);
        add(txApellido);
        add(txtEmail);
        add(txEmail);
        add(txtTelefono);
        add(txTelefono);
                
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
            buscarCliente();
        }
        
        if (e.getSource() == btnVolver) {
            volver();
        }
    }
    
    public void buscarCliente() {
        try {
            String codigo = txCodigo.getText();
            Cliente cliente = DBA.buscarClienteCodigo(codigo);
            
            if (cliente != null) {
                txNombre.setText(cliente.getNombre());
                txApellido.setText(cliente.getApellido());
                txEmail.setText(cliente.getEmail());
                txTelefono.setText(cliente.getTelefono());
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
                limpiarCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }
    
    private void limpiarCampos() {
        txNombre.setText("");
        txApellido.setText("");
        txEmail.setText("");
        txTelefono.setText("");
    }
    
    public static VentanaC frmVentanaCv;
    public void volver(){
        setVisible(false);
        frmVentanaCv= new VentanaC();
    }
}
