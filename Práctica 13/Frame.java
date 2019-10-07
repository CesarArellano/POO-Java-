import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.ImageIcon;


public class Frame extends JFrame
{
    static String Datos[][];
    static JTable Tabla;
    static String[] NombreColumnas = {"Punto","Evaluación"};
    static JPanel panelTable;
    public Frame()
    {
       super("Integral Calculator");
       setSize(580,350);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
       setLayout(new GridLayout(3,1));
       PanelIngDatos IngDatos = new PanelIngDatos();
       //Arriba, Izquierda, Abajo, Derecha
       IngDatos.setBorder(new EmptyBorder(10,10,10,10));
       this.add(IngDatos);
       PanelButton Opciones = new PanelButton();
       Opciones.setBorder(new EmptyBorder(20,20,20,15));
       this.add(Opciones);
       panelTable = new JPanel();
       panelTable.setLayout(new BorderLayout(10,10));
       panelTable.setBackground(new Color(20, 102, 175));
       this.add(panelTable);
       //Eventos
       ManejadorEventos Manejador = new ManejadorEventos();
       PanelIngDatos.LimpiarCampo.addActionListener(Manejador);
       PanelButton.CalcularIntegral.addActionListener(Manejador);
       PanelButton.EvaluarEnPunto.addActionListener(Manejador);
       PanelButton.EvaluarEnIntervalo.addActionListener(Manejador);       
    }
}
