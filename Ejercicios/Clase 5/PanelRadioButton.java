import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelRadioButton extends JPanel
{
	static JRadioButton Ninguna,Media,Mucha;
	PanelRadioButton()
	{
		setLayout(new GridLayout(1,3));
		Ninguna = new JRadioButton("Ninguna");
		Media = new JRadioButton("Media");
		Mucha = new JRadioButton("Mucha");

		//Seleccionar un botón a la vez.
		ButtonGroup Grupo1 = new ButtonGroup();
		Grupo1.add(Ninguna);
		Grupo1.add(Media);
		Grupo1.add(Mucha);

		add(Ninguna);
		add(Media);
		add(Mucha);

		setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(),"Dificultad para respirar"));
	}
}