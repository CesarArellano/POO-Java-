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
  //Arriba, Izquierda, Abajo, Derecha
    public Frame()
    {
       super("Formulario");
       setSize(1200,700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
       setLayout(new GridLayout(1,1));
       PanelForm Formulario = new PanelForm();
       this.add(Formulario);
       /*ManejadorEventos Manejador = new ManejadorEventos();
       PanelButton.CalcularIntegral.addActionListener(Manejador);
      */
    }
}
