import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

public class Frame extends JFrame
{
  static String datos[][];
  static JTable tabla;
  static String[] columNames = {"Dato","Valor"};
  static JPanel panelTable;

  public Frame()
  {
    super("Medidas de Tendencia Central");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new GridLayout(2,1));
    PanelIngDatos ingD = new PanelIngDatos();
    this.add(ingD);
    panelTable = new JPanel();
    panelTable.setLayout(new BorderLayout());
    this.add(panelTable);
    MEventosMedidasTC manejador = new MEventosMedidasTC();
    PanelIngDatos.imprimir.addActionListener(manejador);
  }
}
