import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelTrianguloDatos extends JPanel
{
  static JTextField Base,Altura;
  static JButton Area, Volumen;
  PanelTrianguloDatos()
  {
    setLayout(new GridLayout(4,2));
    add(new JLabel(""));
    add(new JLabel(""));
    Base = new JTextField("",3);
    Altura = new JTextField("",3);
    Area = new JButton("Área");
    Volumen = new JButton("Volumen");
    add(Base);
    add(Altura);
    add(new JLabel("Base"));
    add(new JLabel("Altura"));
    add(Area);
    add(Volumen);
  }
}
