import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

public class Frame extends JFrame
{
  static String Datos[][];
  static JTable Tabla;
  static String[] NombreColumnas = {"Dato","Valor"};
  static JPanel panelTable;

  public Frame()
  {
    super("Medidas de Tendencia Central");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new GridLayout(4,1));
    PanelIngDatos IngDatos = new PanelIngDatos();
    this.add(IngDatos);
    panelTable = new JPanel();
    panelTable.setLayout(new BorderLayout());
    this.add(panelTable);
    MEventosMedidasTC Manejador = new MEventosMedidasTC();
    PanelIngDatos.Imprimir.addActionListener(Manejador);
    PanelCalcular BotonCalcularMedia = new PanelCalcular();
    this.add(BotonCalcularMedia);
    PanelCalcular.BotonCalcular.addActionListener(Manejador);
  }
}
