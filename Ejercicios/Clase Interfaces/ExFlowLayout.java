import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ExFlowLayout extends JPanel
{
  public ExFlowLayout()
  {
    setSize(600,200);
    setBackground(Color.yellow);
    JLabel etiqueta = new JLabel("Nombre: ");
    etiqueta.setToolTipText("Nombre del usuario: ");

    JTextField texto = new JTextField(10);
    JButton boton = new JButton("Aceptar");
    setLayout(new FlowLayout());
    this.add(etiqueta);
    this.add(texto);
    this.add(boton);
  }
}
