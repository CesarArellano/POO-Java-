import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIngDatos extends JPanel
{
	static JLabel Texto;
	static JTextField Integral;

	PanelIngDatos()
	{
		setLayout(new GridLayout(1,2));
    Texto = new JLabel("Ingrese ecuación (2°)",SwingConstants.CENTER);
    Integral = new JTextField("",15);
    add(Texto);
		add(Integral);
	}
}
