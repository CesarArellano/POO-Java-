import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelRectanguloDatos extends JPanel
{
  static JTextField Base,Altura,Profundidad;
  static JButton Area, Volumen;
  PanelRectanguloDatos()
  {
    setLayout(new GridLayout(4,2));
    Base = new JTextField("Base",3);
    Altura = new JTextField("Altura",3);
    Profundidad = new JTextField("Profundidad",3);
    add(new JLabel(""));
    add(new JLabel(""));
    add(Base);
    add(Altura);
    add(Profundidad);
    add(new JLabel(""));
    Area = new JButton("Área");
    Volumen = new JButton("Volumen");
    add(Area);
    add(Volumen);
  }
}
