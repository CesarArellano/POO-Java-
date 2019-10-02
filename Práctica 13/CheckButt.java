import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CheckButt extends JPanel
{
	static JLabel Texto;
	static JCheckBox CalcularIntegral, EvaluarEnPunto, EvaluarEnIntervalo;

	CheckButt()
	{
		setLayout(new GridLayout(2,3));
		Texto = new JLabel("¿Qué desea hacer?", SwingConstants.CENTER);
    add(new JLabel(""));
    add(Texto);
    add(new JLabel(""));
		CalcularIntegral = new JCheckBox("Calcular Integral");
		EvaluarEnPunto = new JCheckBox("Evaluar en un punto ");
		EvaluarEnIntervalo = new JCheckBox("Evaluar en intervalo");
		add(CalcularIntegral);
		add(EvaluarEnPunto);
		add(EvaluarEnIntervalo);
	}
}
