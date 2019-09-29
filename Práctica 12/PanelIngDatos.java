import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIngDatos extends JPanel
{
	static JLabel Texto;
	static JTextField NumValores;
	static JButton Imprimir;

	PanelIngDatos()
	{
		setLayout(null);
		Texto = new JLabel("Número de Datos",SwingConstants.CENTER);
		//(x,y,width,height) -> esquina superior izquierda
		Texto.setBounds(20,22,120,25);
		add(Texto);
		NumValores = new JTextField("",3);
		NumValores.setBounds(150,22,140,25);
		add(NumValores);
		Imprimir = new JButton("Ingresa Datos");
		Imprimir.setBounds(300,22,130,25);
		add(Imprimir);
	}
}
