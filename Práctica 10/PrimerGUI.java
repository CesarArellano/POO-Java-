import java.awt.GridLayout;
import javax.swing.JFrame;

public class PrimerGUI extends JFrame
{
  public PrimerGUI ()
  {
    super("Título de ventana");
    setSize(700,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(300,300);
    setResizable(false);
    setLayout(new GridLayout(3,1)); //filas, columnas
    //PrimerPanel panelUno = new PrimerPanel();
    //this.add(panelUno);
    ExFlowLayout panelDos = new ExFlowLayout();
    this.add(panelDos);
    ExGridLayout panelTres = new ExGridLayout();
    this.add(panelTres);
    ExBorderLayout panelCuatro = new ExBorderLayout();
    this.add(panelCuatro);
  }
}
