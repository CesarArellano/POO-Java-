import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.border.*;


public class Frame extends JFrame
{
    static String Datos[][];
    static JTable Tabla;
    static String[] NombreColumnas = {"Punto","Evaluación"};
    static JPanel panelTable;
    public Frame()
    {
       super("Integral Calculator");
       setSize(600,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(new GridLayout(3,1));
       PanelIngDatos IngDatos = new PanelIngDatos();
       //Arriba, Izquierda, Abajo, Derecha
       //IngDatos.setBorder(new EmptyBorder(80,80,80,80));
       this.add(IngDatos);
       PanelRadioButton Opciones = new PanelRadioButton();
       Opciones.setBorder(new EmptyBorder(10,20,10,10));
       this.add(Opciones);
       panelTable = new JPanel();
       panelTable.setLayout(new BorderLayout());
       this.add(panelTable);
       //Eventos
       EventosRadio Manejador = new EventosRadio();
       PanelRadioButton.CalcularIntegral.addActionListener(Manejador);
       PanelRadioButton.EvaluarEnPunto.addActionListener(Manejador);
       PanelRadioButton.EvaluarEnIntervalo.addActionListener(Manejador);       
    }
}
