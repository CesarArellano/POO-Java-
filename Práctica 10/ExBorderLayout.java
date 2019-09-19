import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

class ExBorderLayout extends JPanel
{
  public ExBorderLayout()
  {
    setSize(600,200);
    JButton boton1 = new JButton("left");
    JButton boton2 = new JButton("right");
    JButton boton3 = new JButton("top");
    JButton boton4 = new JButton("bottom");
    JButton boton5 = new JButton("center");
    setLayout(new BorderLayout(5,2)); //horizontal, vertical.
    this.add(boton1, BorderLayout.WEST);
    this.add(boton2, BorderLayout.EAST);
    this.add(boton3, BorderLayout.NORTH);
    this.add(boton4, BorderLayout.SOUTH);
    this.add(boton5, BorderLayout.CENTER);
  }
}
