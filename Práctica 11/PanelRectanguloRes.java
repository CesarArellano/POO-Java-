import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelRectanguloRes extends JPanel
{
  static JLabel Resultado;
  PanelRectanguloRes()
  {
    setLayout(new GridLayout(3,1));
    Resultado = new JLabel("Resultado a calcular:",SwingConstants.CENTER);
    this.add(new JLabel(""));
    this.add(Resultado);
    this.add(new JLabel(""));
  }
}
