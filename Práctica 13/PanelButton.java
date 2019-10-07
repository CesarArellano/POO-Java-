import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class PanelButton extends JPanel
{
	static JLabel Texto;
	static JCheckBox CalcularIntegral, EvaluarEnPunto, EvaluarEnIntervalo;

	PanelButton()
	{
		setLayout(new GridLayout(2,3));
		setBackground(new Color(20, 102, 175));
		Texto = new JLabel("¿Qué desea hacer?", SwingConstants.CENTER);
	    Texto.setForeground(Color.white);
	    add(new JLabel(""));
	    add(Texto);
	    add(new JLabel(""));

		CalcularIntegral = new JCheckBox("Calcular Integral");
		EvaluarEnPunto = new JCheckBox("Evaluar en un punto ");
		EvaluarEnIntervalo = new JCheckBox("Evaluar en intervalo");

		CalcularIntegral.setForeground(Color.white);
		CalcularIntegral.setBackground(new Color(22, 109, 211));
		EvaluarEnPunto.setForeground(Color.white);
		EvaluarEnPunto.setBackground(new Color(22, 109, 211));
		EvaluarEnIntervalo.setForeground(Color.white);
		EvaluarEnIntervalo.setBackground(new Color(22, 109, 211));
		
		ButtonGroup Grupo1 = new ButtonGroup();
		Grupo1.add(CalcularIntegral);
		Grupo1.add(EvaluarEnPunto);
		Grupo1.add(EvaluarEnIntervalo);

		add(CalcularIntegral);
		add(EvaluarEnPunto);
		add(EvaluarEnIntervalo);
	}
}
