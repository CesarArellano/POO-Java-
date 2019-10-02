import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.border.*;

public class Frame extends JFrame
{
  public Frame()
  {
    super("Integral Calculator");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new GridLayout(2,1));
    PanelIngDatos IngDatos = new PanelIngDatos();
    //Arriba, Izquierda, Abajo, Derecha
    IngDatos.setBorder(new EmptyBorder(80,80,80,80));
    this.add(IngDatos);
    CheckButt Opciones = new CheckButt();
    Opciones.setBorder(new EmptyBorder(10,20,10,10));
    this.add(Opciones);
    //EventosCheck Manejador = new EventosCheck();
    //CheckButt.CalcularIntegral.addActionListener(Manejador);
    //CheckButt.EvaluarEnPunto.addActionListener(Manejador);
    //CheckButt.EvaluarEnIntervalo.addActionListener(Manejador);
  }
}
