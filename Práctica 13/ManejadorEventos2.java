import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManejadorEventos2 implements ActionListener
{
	public void actionPerformed(ActionEvent Evento)
	{
		if(Evento.getSource() == PanelIngDatos.LimpiarCampo)
		{
			PanelIngDatos.Entrada.setText("");
		}
	}
}