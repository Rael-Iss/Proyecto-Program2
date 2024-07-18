import javax.swing.*;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class ButtonA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

class Boton extends JButton {
    public Boton(String txt, int px, int py) {
        setText(txt);
        setSize(150, 35);
        setLocation(px, py);
        setBackground(new Color(0, 32, 96));
        setForeground(Color.WHITE); 
    }
}

class BotonGr extends JButton {
    public BotonGr(String txt, int px, int py, Color bgColor, Color fgColor) {
        setText(txt);
        setSize(150, 45);
        setLocation(px, py);
        setBackground(bgColor);
        setForeground(fgColor);
    }

    public BotonGr(String txt, int px, int py) {
        this(txt, px, py, new Color(0, 32, 96), Color.WHITE);
    }
}