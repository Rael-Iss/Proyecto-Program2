import javax.swing.*;
/**
 * Write a description of class Caja here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
class Caja extends JTextField {
    public Caja(int px, int py) {
        setBounds(px, py, 200, 30);
    }
}

class CajaGrande extends JTextField
{
    public void CajaGrande(int px, int py)
    {
        setLocation(px, py);
        setSize(150, 30);
    }
}

class CajaPass extends JPasswordField 
{
    public CajaPass(int px, int py) {
        setBounds(px, py, 200, 30);
    }
}