import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EventosCheck implements ActionListener
{

	public void actionPerformed(ActionEvent Evento)
	{
		if(CheckButt.CalcularIntegral.isSelected())
		{
			try
			{

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introducir sólo números: ","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(CheckButt.EvaluarEnPunto.isSelected())
		{
			try
			{

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introducir sólo números: ","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
    else if(CheckButt.EvaluarEnIntervalo.isSelected())
		{
			try
			{

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introducir sólo números: ","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
  public void ExtraerFuncion()
  {
    Integer.parseInt(PanelIngDatos.NumValores.getText().toString());
  }
}
