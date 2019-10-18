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
				int DiaNac = Integer.parseInt(PanelForm.DiaNac.getText().toString());
				int MesNac = Integer.parseInt(PanelForm.MesNac.getText().toString());
				int AnioNac = Integer.parseInt(PanelForm.AnioNac.getText().toString());
				String Calle = PanelForm.Calle.getText().toString();
				int NumExterior = Integer.parseInt(PanelForm.NumExterior.getText().toString());
				int NumInterior = Integer.parseInt(PanelForm.NumInterior.getText().toString());
				int Zona = Integer.parseInt(PanelForm.Zona.getText().toString());
				String Del_Mun = PanelForm.Del_Mun.getText().toString();
				String CP = PanelForm.CP.getText().toString();
				String TelefonoFijo = PanelForm.TelefonoF.getText().toString();
				String TelefonoMovil = PanelForm.TelefonoM.getText().toString();
				int AniosVivienda = Integer.parseInt(PanelForm.AniosVivienda.getText().toString());
				int MesesVivienda = Integer.parseInt(PanelForm.MesesVivienda.getText().toString());
				String EntidadOrigen = PanelForm.EntidadOrigen.getText().toString();
				String EstadoCivil = PanelForm.GrupoEstadoCivil.getSelection().getActionCommand();
				int AniosEstudios = Integer.parseInt(PanelForm.GrupoEstudios.getSelection().getActionCommand());
				String Leer = PanelForm.GrupoLeer.getSelection().getActionCommand();
				String Escribir = PanelForm.GrupoEscribir.getSelection().getActionCommand();
				String Empleo = PanelForm.GrupoEmpleo.getSelection().getActionCommand();
				String Religion = PanelForm.GrupoReligion.getSelection().getActionCommand();

				System.out.println(NombreMedico);
				System.out.println(ApellidoPatMedico);
				System.out.println(ApellidoMatMedico);
				System.out.println(DiaEvaluacion+"/"+MesEvaluacion+"/"+AnioEvaluacion);
				System.out.println(NomPac);
				System.out.println(ApPatPac);
				System.out.println(ApMatPac);
				System.out.println(Sexo);
				System.out.println(DiaNac+"/"+MesNac+"/"+AnioNac);
				//System.out.println(Edad);
				System.out.println(Calle);
				System.out.println(NumExterior+","+NumInterior);
				System.out.println(Zona);
				System.out.println(Del_Mun);
				System.out.println(CP);
				System.out.println(TelefonoFijo);
				System.out.println(TelefonoMovil);
				System.out.println(AniosVivienda);
				System.out.println(MesesVivienda);
				System.out.println(EntidadOrigen);
				System.out.println(EstadoCivil);
				System.out.println(AniosEstudios);
				System.out.println(Leer);
				System.out.println(Escribir);
				System.out.println(Empleo);
				System.out.println(Religion);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error","Error de Entrada", JOptionPane.ERROR_MESSAGE);
	    }
	  }
	}
}
