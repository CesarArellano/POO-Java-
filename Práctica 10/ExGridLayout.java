import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ExGridLayout extends JPanel
{
  public ExGridLayout()
  {
    setSize(600,200);
    setBackground(Color.green);

    JTextField texto = new JTextField(10);

    ExBorderLayout Pos1 = new ExBorderLayout();
    JButton Pos2 = new JButton("B2");
    ExFlowLayout Pos3= new ExFlowLayout();
    ExFlowLayout Pos4= new ExFlowLayout();
    JButton Pos5 = new JButton("B5");
    ExBorderLayout Pos6 = new ExBorderLayout();

    setLayout(new GridLayout(2,3));
    this.add(Pos1);
    this.add(Pos2);
    this.add(Pos3);
    this.add(Pos4);
    this.add(Pos5);
    this.add(Pos6);
  }
}
