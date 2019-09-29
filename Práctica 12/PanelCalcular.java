import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCalcular extends JPanel
{
	static JLabel Resultado;
	static JButton BotonCalcular;

	PanelCalcular()
	{
		setLayout(null);
		BotonCalcular = new JButton("Calcular Media");	
		Resultado = new JLabel("El valor de la media es:",SwingConstants.CENTER);
		BotonCalcular.setBounds(140,22,140,25);
		Resultado.setBounds(280,22,250,25);
		add(BotonCalcular);

		add(Resultado);
	}
}
