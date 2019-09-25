import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelRectanguloImg extends JPanel
{
  PanelRectanguloImg()
  {
    setLayout(new GridLayout(1,2));
    JLabel EtiquetaRectangulo = new JLabel();
    JLabel EtiquetaPrisma = new JLabel();
    Icon Rectangulo = new ImageIcon(getClass().getResource("rectangulo.png"));
    Icon Prisma = new ImageIcon(getClass().getResource("prisma.png"));

    EtiquetaRectangulo.setText("Rectangulo");
    EtiquetaRectangulo.setIcon(Rectangulo);
    EtiquetaRectangulo.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaRectangulo.setVerticalTextPosition(SwingConstants.BOTTOM);

    EtiquetaPrisma.setText("Prisma");
    EtiquetaPrisma.setIcon(Prisma);
    EtiquetaPrisma.setHorizontalTextPosition(SwingConstants.CENTER);
    EtiquetaPrisma.setVerticalTextPosition(SwingConstants.BOTTOM);
    this.add(EtiquetaRectangulo);
    this.add(EtiquetaPrisma);
  }
}
