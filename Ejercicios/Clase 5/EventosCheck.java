import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EventosCheck implements ActionListener
{
	public void actionPerformed(ActionEvent Evento)
	{
		if(Evento.getSource() == CheckButt.Diagnostico)
		{
			try
			{
				int Contador = 0;
				if(CheckButt.MayorPeso.isSelected())
					Contador += 1;
				if(CheckButt.FrecuenciaAlta.isSelected())
					Contador += 1;
				if(CheckButt.MayorEdad.isSelected())
					Contador += 1;
				System.out.println(Contador);
				if(Contador>=2)
					JOptionPane.showMessageDialog(null,"Validar más datos","Salida Diagnóstico",JOptionPane.ERROR_MESSAGE);
				
				else
					JOptionPane.showMessageDialog(null,"Todo OK","Salida Diagnóstico",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introducir sólo números: ","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
		if(PanelRadioButton.Ninguna.isSelected())
		{
			JOptionPane.showMessageDialog(null,"Opción Ninguna","Respiración",JOptionPane.ERROR_MESSAGE);
		}
	}
}