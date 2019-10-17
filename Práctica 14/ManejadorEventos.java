import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;

public class ManejadorEventos implements ActionListener
{
	public void actionPerformed(ActionEvent Evento)
	{
	  if(Evento.getSource() == PanelForm.Guardar)
		{
			try
			{
				String NombreMedico = PanelForm.NombreMedico.getText().toString();
				String ApellidoPatMedico = PanelForm.ApellidoPatMedico.getText().toString();
				String ApellidoMatMedico = PanelForm.ApellidoMatMedico.getText().toString();
				int DiaEvaluacion = Integer.parseInt(PanelForm.DiaEvaluacion.getText().toString());
				int MesEvaluacion = Integer.parseInt(PanelForm.MesEvaluacion.getText().toString());
				int AnioEvaluacion = Integer.parseInt(PanelForm.AnioEvaluacion.getText().toString());
				String NomPac = PanelForm.NomPac.getText().toString();
				String ApPatPac = PanelForm.ApPatPac.getText().toString();
				String ApMatPac = PanelForm.ApMatPac.getText().toString();
				String Sexo = PanelForm.GrupoSexo.getSelection().getActionCommand();

				System.out.println(NombreMedico);
				System.out.println(ApellidoPatMedico);
				System.out.println(ApellidoMatMedico);
				System.out.println(DiaEvaluacion);
				System.out.println(MesEvaluacion);
				System.out.println(AnioEvaluacion);
				System.out.println(NomPac);
				System.out.println(ApPatPac);
				System.out.println(ApMatPac);
				System.out.println(Sexo);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error","Error de Entrada", JOptionPane.ERROR_MESSAGE);
	    }
	  }
	}
}
