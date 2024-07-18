import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class VentanaP here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class VentanaP extends JFrame implements ActionListener {
    // Crear objetos
    private TextoT titulo = new TextoT("PAGAR", 210, 20, 250, 20);
    private Texto txtCodigo = new Texto("Código", 130, 70, 150, 20);
    private Caja txCodigo = new Caja(190, 65);
    private Boton btnBuscar = new Boton("Buscar", 410, 60);
    private Boton btnVolver = new Boton("Volver", 250, 280);
    private Boton btnPagar = new Boton("Pagar", 410, 280);
    private Texto txtCliente = new Texto("Cliente", 140, 125, 170, 10);
    private Texto txtCodigoC = new Texto("Codigo Cliente", 140, 165, 150, 10);
    private Texto txtTotal = new Texto("Total", 140, 205, 150, 10);
    private Texto txtEstadoPago = new Texto("Estado de Pago", 140, 245, 150, 10);
    private Caja txCliente = new Caja(260, 120);
    private Caja txCodigoC = new Caja(260, 160);
    private Caja txTotal = new Caja(260, 200);
    private Caja txEstadoPago = new Caja(260, 240);

    public VentanaP() {
        // Añadir objetos
        add(titulo);
        add(txtCodigo);
        add(txCodigo);
        add(btnBuscar);
        add(btnVolver);
        add(btnPagar);
        add(txtCliente);
        add(txCliente);
        add(txtCodigoC);
        add(txCodigoC);
        add(txtTotal);
        add(txTotal);
        add(txtEstadoPago);
        add(txEstadoPago);

        // Acciones de botones
        btnBuscar.addActionListener(this);
        btnPagar.addActionListener(this);
        btnVolver.addActionListener(this);

        getContentPane().setBackground(new Color(224, 224, 224));
        // Configurar ventana
        setLayout(null);
        setTitle("Pagar Suscripción");
        setSize(650, 380);
        setLocation(350, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            buscarSuscripcion();
        } else if (e.getSource() == btnPagar) {
            pagarSuscripcion();
        } else if (e.getSource() == btnVolver) {
            volver();
        }
    }

    private void buscarSuscripcion() {
        try {
            int codigo = Integer.parseInt(txCodigo.getText());
            Suscripcion suscripcion = DBA.buscarSuscripcionCodigo(codigo);

            if (suscripcion != null) {
                Cliente cliente = DBA.buscarClienteCodigo(suscripcion.getCCliente());
                Servicio servicio = DBA.buscarServicioCodigo(suscripcion.getCServicio());

                if (cliente != null && servicio != null) {
                    txCliente.setText(cliente.getNombre());
                    txCodigoC.setText(cliente.getCodigo());
                    txTotal.setText(String.valueOf(servicio.getPrecio()));
                    txEstadoPago.setText(suscripcion.getPagada() ? "Pagada" : "No pagada");
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente o servicio no encontrado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Suscripción no encontrada.");
                limpiarCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }

    private void pagarSuscripcion() {
        try {
            int codigo = Integer.parseInt(txCodigo.getText());
            boolean exito = DBA.pagarSuscripcion(codigo);
            if (exito) {
                JOptionPane.showMessageDialog(this, "Suscripción pagada exitosamente.");
                buscarSuscripcion(); // Actualizar la información mostrada
            } else {
                JOptionPane.showMessageDialog(this, "Error al pagar la suscripción.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }

    private void limpiarCampos() {
        txCodigo.setText("");
        txCliente.setText("");
        txCodigoC.setText("");
        txTotal.setText("");
        txEstadoPago.setText("");
    }

    public static VentanaC frmVentanaCv;
    public void volver() {
        setVisible(false);
        frmVentanaCv = new VentanaC();
    }
}
