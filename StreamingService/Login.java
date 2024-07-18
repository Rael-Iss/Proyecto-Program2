import javafx.stage.Window;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Login extends JFrame implements ActionListener {
    // Create Objects
    private TextoT titulo = new TextoT("Iniciar sesión", 240, 60, 150, 15);
    private Texto txtUsuario = new Texto("Usuario", 160, 110, 150, 10);
    private Texto txtPass = new Texto("Contraseña", 150, 150, 150, 10);
    private Caja txUsuario = new Caja(250, 100);
    private JPasswordField txPass = new CajaPass(250, 140);
    private Boton btnIngresar = new Boton("Ingresar", 145, 200);
    private Boton btnCancelar = new Boton("Cancelar", 305, 200);
    private Boton btnNuevo = new Boton("Nuevo", 450, 250);

    public Login() {
        // Add Objects
        add(titulo);
        add(txtUsuario);
        add(txUsuario);
        add(txtPass);
        add(txPass);
        add(btnIngresar);
        add(btnCancelar);
        add(btnNuevo);

        // Action Buttons
        btnIngresar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnNuevo.addActionListener(this);

        // Config Frame
        getContentPane().setBackground(new Color(224, 224, 224));
        setLayout(null);
        setTitle("LOGIN");
        setSize(650, 450);
        setLocation(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();
    }

    public static VentanaU frmVentanaU;
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            ingresar();
        }

        if (e.getSource() == btnNuevo) {
            setVisible(false);
            frmVentanaU = new VentanaU();
        }

        if (e.getSource() == btnCancelar) {
            System.exit(0);
        }
    }

    public static VentanaC frmVentanaC;

    public void ingresar() {
        Usuario us= new Usuario(txUsuario.getText(),txPass.getText());
        if (DBA.existeUsuario(us)) {
            frmVentanaC = new VentanaC();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no registrado.");
            limpiarCampos();
        }
    }
    
    private void limpiarCampos() {
        txUsuario.setText("");
        txPass.setText("");
    }
}