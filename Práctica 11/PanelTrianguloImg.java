import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelTrianguloImg extends JPanel
{
  PanelTrianguloImg()
  {
    setLayout(new GridLayout(1,2));
    JLabel EtiquetaTriangulo = new JLabel();
    JLabel EtiquetaPiramide = new JLabel();
    Icon Triangulo = new ImageIcon(getClass().getResource("triangulo.png"));
    Icon Piramide = new ImageIcon(getClass().getResource("piramide.png"));

    EtiquetaTriangulo.setText("Triangulo");
    EtiquetaTriangulo.setIcon(Triangulo);
    EtiquetaTriangulo.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaTriangulo.setVerticalTextPosition(SwingConstants.BOTTOM);

    EtiquetaPiramide.setText("Piramide");
    EtiquetaPiramide.setIcon(Piramide);
    EtiquetaPiramide.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaPiramide.setVerticalTextPosition(SwingConstants.BOTTOM);
    this.add(EtiquetaTriangulo);
    this.add(EtiquetaPiramide);
  }
}
