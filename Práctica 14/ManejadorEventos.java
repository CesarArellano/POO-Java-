import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class ManejadorEventos implements ActionListener
{
	static int[] Fechas = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int FlagFunc,EdadPaciente;
	ArrayList<Paciente> ListaPacientes = new ArrayList<Paciente>();
	public void actionPerformed(ActionEvent Evento)
	{
	  if(Evento.getSource() == PanelForm.Guardar)
		{
			try
			{
				int FlagNomMedico, FlagApPatMedico, FlagApMatMedico, FlagNomPac, FlagApPatPac, FlagApMatPac, FlagDel_Mun, FlagCP, FlagTF, FlagTM, FlagEntidad, FlagNac, FlagEval;
				//Obtener Fecha Actual
				Date Fecha = new Date(); 
				SimpleDateFormat ObjetoFormato = new SimpleDateFormat("dd"); 
				SimpleDateFormat ObjetoFormato2 = new SimpleDateFormat("MM"); 
				SimpleDateFormat ObjetoFormato3 = new SimpleDateFormat("yyyy");
				int DiaActual= Integer.parseInt(ObjetoFormato.format(Fecha));
				int MesActual= Integer.parseInt(ObjetoFormato2.format(Fecha));
				int AnioActual= Integer.parseInt(ObjetoFormato3.format(Fecha));
				
				//Obtener cadenas a verificar
				String NombreMedico = PanelForm.NombreMedico.getText().toString();
				String ApellidoPatMedico = PanelForm.ApellidoPatMedico.getText().toString();
				String ApellidoMatMedico = PanelForm.ApellidoMatMedico.getText().toString();
				String NomPac = PanelForm.NomPac.getText().toString();
				String ApPatPac = PanelForm.ApPatPac.getText().toString();
				String ApMatPac = PanelForm.ApMatPac.getText().toString();
				String Del_Mun = PanelForm.Del_Mun.getText().toString();
				String EntidadOrigen = PanelForm.EntidadOrigen.getText().toString();
				String CP = PanelForm.CP.getText().toString();
				String TelefonoFijo = PanelForm.TelefonoF.getText().toString();
				String TelefonoMovil = PanelForm.TelefonoM.getText().toString();	

				//Verificación cadenas, sólo deben contener letras.
				FlagNomMedico = SoloLetras(NombreMedico);
				FlagApPatMedico = SoloLetras(ApellidoPatMedico);
				FlagApMatMedico = SoloLetras(ApellidoMatMedico);
				FlagNomPac = SoloLetras(NomPac);
				FlagApPatPac = SoloLetras(ApPatPac);
				FlagApMatPac = SoloLetras(ApMatPac);
				FlagDel_Mun = SoloLetras(Del_Mun);
				FlagEntidad = SoloLetras(EntidadOrigen);

				//Verificación cadenas, sólo deben contener números.
				FlagCP = SoloNumeros(CP,5);
				FlagTF = SoloNumeros(TelefonoFijo,8);
				FlagTM = SoloNumeros(TelefonoMovil,10);	

				//Errores en pantalla
				if(FlagNomMedico == 1)
					JOptionPane.showMessageDialog(null,"Error, el nombre del médico contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApPatMedico == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido paterno del médico contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApMatMedico == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido materno del médico contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagNomPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el nombre del paciente contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApPatPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido paterno del paciente contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApMatPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido materno del paciente contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagDel_Mun == 1)
					JOptionPane.showMessageDialog(null,"Error, la delegación / municipio contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagEntidad == 1)
					JOptionPane.showMessageDialog(null,"Error, la entidad de origen contiene números","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagCP == 1)
					JOptionPane.showMessageDialog(null,"Error, el código postal contiene letras y/o no es de 5 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagTF == 1)
					JOptionPane.showMessageDialog(null,"Error, teléfono fijo contiene letras y/o no es de 8 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagTM == 1)
					JOptionPane.showMessageDialog(null,"Error, teléfono móvil contiene letras y/o no es de 10 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);

				//Obtener fechas para verificar
				int DiaEvaluacion = Integer.parseInt(PanelForm.DiaEvaluacion.getText().toString());
				int MesEvaluacion = Integer.parseInt(PanelForm.MesEvaluacion.getText().toString());
				int AnioEvaluacion = Integer.parseInt(PanelForm.AnioEvaluacion.getText().toString());
				int DiaNac = Integer.parseInt(PanelForm.DiaNac.getText().toString());
				int MesNac = Integer.parseInt(PanelForm.MesNac.getText().toString());
				int AnioNac = Integer.parseInt(PanelForm.AnioNac.getText().toString());
				
				//Validando Fechas
				FlagEval = ValidacionFechas(DiaEvaluacion,MesEvaluacion,AnioEvaluacion,DiaActual,MesActual,AnioActual);
				FlagNac = ValidacionFechas(DiaNac,MesNac,AnioNac,DiaActual,MesActual,AnioActual);
				
				if(FlagEval == 1)
					JOptionPane.showMessageDialog(null,"Error, la fecha de evaluacion es incorrecta"," Error de Entrada", JOptionPane.ERROR_MESSAGE);
				
				if(FlagNac == 1)
					JOptionPane.showMessageDialog(null,"Error, la fecha de nacimiento es incorrecta"," Error de Entrada", JOptionPane.ERROR_MESSAGE);
				else
				{
					EdadPaciente = ObtenerEdadPaciente(DiaNac,MesNac,AnioNac,DiaActual,MesActual,AnioActual);
					if(EdadPaciente<=60)
						JOptionPane.showMessageDialog(null,"Error, edad del paciente debe ser superior a los 60 años","Error Edad", JOptionPane.ERROR_MESSAGE);
				}

				//No necesitan ser verificados.
				String Sexo = PanelForm.GrupoSexo.getSelection().getActionCommand();
				String Calle = PanelForm.Calle.getText().toString();
				int NumExterior = Integer.parseInt(PanelForm.NumExterior.getText().toString());
				int NumInterior = Integer.parseInt(PanelForm.NumInterior.getText().toString());
				int Zona = Integer.parseInt(PanelForm.Zona.getText().toString());
				int AniosVivienda = Integer.parseInt(PanelForm.AniosVivienda.getText().toString());
				int MesesVivienda = Integer.parseInt(PanelForm.MesesVivienda.getText().toString());
				String EstadoCivil = PanelForm.GrupoEstadoCivil.getSelection().getActionCommand();
				int AniosEstudios = Integer.parseInt(PanelForm.GrupoEstudios.getSelection().getActionCommand());
				String Leer = PanelForm.GrupoLeer.getSelection().getActionCommand();
				String Escribir = PanelForm.GrupoEscribir.getSelection().getActionCommand();
				String Empleo = PanelForm.GrupoEmpleo.getSelection().getActionCommand();
				String Religion = PanelForm.GrupoReligion.getSelection().getActionCommand();

				if (FlagNomMedico == 0 && FlagApPatMedico == 0 && FlagApMatMedico == 0 && FlagNomPac==0 && FlagApPatPac==0 && FlagApMatPac==0 && FlagDel_Mun == 0 && FlagCP == 0 && FlagTF == 0 && FlagTM == 0 && FlagEntidad == 0 && FlagNac == 0 && FlagEval == 0 && EdadPaciente > 60)
				{
					PanelForm.Edad.setText("B.4 Edad: "+EdadPaciente+" Años");
					JOptionPane.showMessageDialog(null,"Se agregó con éxito a (el/la) paciente: "+NomPac+" al ArrayList","Mensaje Usuario", JOptionPane.INFORMATION_MESSAGE);
					ListaPacientes.add(new Paciente(NombreMedico,ApellidoPatMedico,ApellidoMatMedico,NomPac,ApPatPac, ApMatPac, Sexo, Calle, Del_Mun, TelefonoFijo, TelefonoMovil, EntidadOrigen, EstadoCivil, Leer, Escribir, Empleo, Religion, DiaEvaluacion, MesEvaluacion, AnioEvaluacion, DiaNac, MesNac, AnioNac, EdadPaciente, NumExterior, NumInterior, Zona, AniosVivienda, MesesVivienda, AniosEstudios));
					for (int i = 0; i<ListaPacientes.size();i++)
					{
						System.out.println("Paciente: "+(i+1));
						System.out.println(ListaPacientes.get(i).Impresion());
					}					
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error, Campos Vacíos / Datos Incorrectos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
	    	}
	  }
	}
	public int SoloLetras(String Cadena)
	{
		if (Pattern.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+",Cadena))
			FlagFunc = 0;
		else
			FlagFunc = 1;
		return FlagFunc;
	}
	public int SoloNumeros(String Cadena, int Num)
	{
		if (Pattern.matches("[0-9]+",Cadena) && (Cadena.length() == Num))
			FlagFunc = 0;
		else
			FlagFunc = 1;
		return FlagFunc;
	}
	public int ValidacionFechas(int d, int m, int a,int d2, int m2, int a2)
	{
		if(m>=1 && m<=12 && d>0 && d<=Fechas[m-1])
 			FlagFunc=0;
 		else
 			FlagFunc = 1;

 		if(a > a2)
			FlagFunc = 1;
		if(a == a2)
		{
			if(m > m2)
				FlagFunc = 1;
		}
		if(a == a2)
		{
			if(m == m2)
			{
				if(d > d2)
				 	FlagFunc = 1;
			}
		}
		return FlagFunc;
	}

	public int ObtenerEdadPaciente(int d, int m, int a,int d2, int m2, int a2)
	{		
		int Temp1, Temp2, Dias, Edad;
		Temp1 = (a*365)+(m*30)+d;
		Temp2 = (a2*365)+(m2*30)+d2;
		Dias = Temp2-Temp1;
		Edad = Dias/365;
		return Edad;
	}
}
