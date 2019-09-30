import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

enum Caracteristica
{
	MAYORPESO,FRECUENCIAALTA,MAYORTREINTA;
}

public class CheckButt extends JPanel
{
	static JLabel Texto;
	static JCheckBox MayorPeso, FrecuenciaAlta, MayorEdad;
	static JButton Diagnostico;

	CheckButt()
	{
		setLayout(null);
		Texto = new JLabel("Selecciona opciones", SwingConstants.CENTER);
		Texto.setBounds(190,22,145,25);
		add(Texto);
		MayorPeso = new JCheckBox("Obesidad");
		MayorPeso.setBounds(70,70,120,25);
		FrecuenciaAlta = new JCheckBox("Frecuencia Alta");
		FrecuenciaAlta.setBounds(190,70,120,25);
		MayorEdad = new JCheckBox("Mayor Treinta");
		MayorEdad.setBounds(320,70,120,25);
		add(MayorPeso);
		add(FrecuenciaAlta);
		add(MayorEdad);
		Diagnostico = new JButton("Diagnostico");
		Diagnostico.setBounds(190,140,120,25);
		add(Diagnostico);
	}
}