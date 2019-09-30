import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

public class Frame extends JFrame
{
  public Frame()
  {
    super("Respiracion");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new GridLayout(2,1));
    CheckButt IngDatos = new CheckButt();
    this.add(IngDatos);
    PanelRadioButton IngDatos2 = new PanelRadioButton();
    this.add(IngDatos2);
    EventosCheck Manejador = new EventosCheck();
    CheckButt.Diagnostico.addActionListener(Manejador);
    PanelRadioButton.Ninguna.addActionListener(Manejador);
  }
}
