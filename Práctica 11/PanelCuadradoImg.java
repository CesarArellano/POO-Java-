import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCuadradoImg extends JPanel
{
  PanelCuadradoImg()
  {
    setLayout(new GridLayout(1,2));
    JLabel EtiquetaCuadrado = new JLabel();
    JLabel EtiquetaCubo = new JLabel();
    Icon Cuadrado = new ImageIcon(getClass().getResource("cuadrado.png"));
    Icon Cubo = new ImageIcon(getClass().getResource("cubo.png"));

    EtiquetaCuadrado.setText("Cuadrado");
    EtiquetaCuadrado.setIcon(Cuadrado);
    EtiquetaCuadrado.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaCuadrado.setVerticalTextPosition(SwingConstants.BOTTOM);

    EtiquetaCubo.setText("Cubo");
    EtiquetaCubo.setIcon(Cubo);
    EtiquetaCubo.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaCubo.setVerticalTextPosition(SwingConstants.BOTTOM);
    this.add(EtiquetaCuadrado);
    this.add(EtiquetaCubo);
  }
}
