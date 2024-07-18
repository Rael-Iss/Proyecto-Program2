import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Texto here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
class Texto extends JLabel {
    public Texto(String txt, int px, int py, int width, int height) {
        setText(txt);
        setBounds(px, py, width, height);
        setFont(new Font("Arial", Font.BOLD, 14));
    }
}

class TextoT extends JLabel {
    public TextoT(String txt, int px, int py, int width, int height) {
        setText(txt);
        setBounds(px, py, width, height);
        setFont(new Font("Arial", Font.BOLD, 20));
    }
}
