import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class PanelRadioButton extends JPanel
{
	static JLabel Texto;
	static JRadioButton CalcularIntegral, EvaluarEnPunto, EvaluarEnIntervalo;

	PanelRadioButton()
	{
		setLayout(new GridLayout(2,3));
		Texto = new JLabel("¿Qué desea hacer?", SwingConstants.CENTER);
	    add(new JLabel(""));
	    add(Texto);
	    add(new JLabel(""));

		CalcularIntegral = new JRadioButton("Calcular Integral");
		EvaluarEnPunto = new JRadioButton("Evaluar en un punto ");
		EvaluarEnIntervalo = new JRadioButton("Evaluar en intervalo");
		ButtonGroup Grupo1 = new ButtonGroup();
		Grupo1.add(CalcularIntegral);
		Grupo1.add(EvaluarEnPunto);
		Grupo1.add(EvaluarEnIntervalo);

		add(CalcularIntegral);
		add(EvaluarEnPunto);
		add(EvaluarEnIntervalo);
	}
}
