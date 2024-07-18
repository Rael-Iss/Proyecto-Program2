import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class VentanaUs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class VentanaU extends JFrame implements ActionListener{
    private TextoT titulo = new TextoT("Registrar Nuevo Usuario", 100, 20, 300, 20);

    private Texto txtUsuario= new Texto("Usuario", 150, 120, 150, 10);
    private Texto txtPass= new Texto("Contraseña", 150, 160, 150, 10);

    private Caja txUsuario= new Caja(250, 110);
    private Caja txPass= new Caja(250, 150);

    private Boton btnRegistrar = new Boton("REGISTRAR", 430, 190);
    private Boton btnCancelar = new Boton("CANCELAR", 270, 190);

    public VentanaU(){
        add(titulo);
        add(txtUsuario);
        add(txUsuario);
        add(txPass);
        add(txtPass);

        add(btnRegistrar);
        add(btnCancelar);

        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);

        setLayout(null);
        setTitle("LOGIN"); 
        setSize(650, 380);
        setLocation(350, 150);
        setVisible(true);
    }
    
    public void registroUsuario(){
        String us = txUsuario.getText();
        String pas = txPass.getText();

            Usuario usu = new Usuario(us, pas); 
            DBA.setUsuario(usu);
            
            // Limpiar los campos después del registro
            txUsuario.setText("");
            txPass.setText("");
        
        setVisible(false);
    }
    
    public void abrirLogin(){
        Login lg= new Login();
        lg.setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            registroUsuario();
            abrirLogin();
        }

        if (e.getSource() == btnCancelar) {
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            window.dispose();
        }
    }
}
