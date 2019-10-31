import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.sql.SQLException;
import java.io.*;

public class ManejadorEventos implements ActionListener
{
	static int[] Fechas = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int FlagFunc;
	static String NombreMedico, ApellidoPatMedico, ApellidoMatMedico,NomPac, ApPatPac, ApMatPac,Sexo,Calle,Del_Mun,CP,TelefonoFijo,TelefonoMovil,EntidadOrigen,EstadoCivil,Leer,Escribir,Ocupacion,Religion,FNacimiento,FEvaluacion;
  	static int DiaEvaluacion, MesEvaluacion, AnioEvaluacion, DiaNac, MesNac, AnioNac, DiaActual, MesActual, AnioActual, EdadPaciente,NumExterior,NumInterior,Zona,AniosVivienda,MesesVivienda,AniosEstudios;
	Conectar conx = new Conectar();
	public void actionPerformed(ActionEvent Evento)
	{
	  if(Evento.getSource() == PanelForm.Guardar)
		{
			try
			{
				int FlagNomMedico, FlagApPatMedico, FlagApMatMedico, FlagNomPac, FlagApPatPac, FlagApMatPac, FlagDel_Mun, FlagCP, FlagTF, FlagTM, FlagEntidad, FlagNac, FlagEval,FlagZona=0, FlagNumExt=0, FlagNumInt=0,FlagAniosdeEstudio=0,FlagMesesVivienda=0,FlagAniosVivienda=0;
				//Obtener Fecha Actual
				Date Fecha = new Date(); 
				SimpleDateFormat ObjetoFormato = new SimpleDateFormat("dd"); 
				SimpleDateFormat ObjetoFormato2 = new SimpleDateFormat("MM"); 
				SimpleDateFormat ObjetoFormato3 = new SimpleDateFormat("yyyy");
				DiaActual = Integer.parseInt(ObjetoFormato.format(Fecha));
				MesActual= Integer.parseInt(ObjetoFormato2.format(Fecha));
				AnioActual= Integer.parseInt(ObjetoFormato3.format(Fecha));
				
				//Obtener cadenas a verificar
				NombreMedico = PanelForm.NombreMedico.getText().toString();
				ApellidoPatMedico = PanelForm.ApellidoPatMedico.getText().toString();
				ApellidoMatMedico = PanelForm.ApellidoMatMedico.getText().toString();
				NomPac = PanelForm.NomPac.getText().toString();
				ApPatPac = PanelForm.ApPatPac.getText().toString();
				ApMatPac = PanelForm.ApMatPac.getText().toString();
				Del_Mun = PanelForm.Del_Mun.getText().toString();
				EntidadOrigen = PanelForm.EntidadOrigen.getText().toString();
				CP = PanelForm.CP.getText().toString();
				TelefonoFijo = PanelForm.TelefonoF.getText().toString();
				TelefonoMovil = PanelForm.TelefonoM.getText().toString();	

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
					JOptionPane.showMessageDialog(null,"Error, el nombre del médico contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApPatMedico == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido paterno del médico contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApMatMedico == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido materno del médico contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagNomPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el nombre del paciente contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApPatPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido paterno del paciente contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagApMatPac == 1)
					JOptionPane.showMessageDialog(null,"Error, el apellido materno del paciente contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagDel_Mun == 1)
					JOptionPane.showMessageDialog(null,"Error, la delegación / municipio contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagEntidad == 1)
					JOptionPane.showMessageDialog(null,"Error, la entidad de origen contiene números o caracteres alfanúmericos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagCP == 1)
					JOptionPane.showMessageDialog(null,"Error, el código postal contiene letras y/o no es de 5 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagTF == 1)
					JOptionPane.showMessageDialog(null,"Error, teléfono fijo contiene letras y/o no es de 8 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				if(FlagTM == 1)
					JOptionPane.showMessageDialog(null,"Error, teléfono móvil contiene letras y/o no es de 10 dígitos","Error de Entrada", JOptionPane.ERROR_MESSAGE);

				//Obtener fechas para verificar
				DiaEvaluacion = Integer.parseInt(PanelForm.DiaEvaluacion.getText().toString());
				MesEvaluacion = Integer.parseInt(PanelForm.MesEvaluacion.getText().toString());
				AnioEvaluacion = Integer.parseInt(PanelForm.AnioEvaluacion.getText().toString());
				DiaNac = Integer.parseInt(PanelForm.DiaNac.getText().toString());
				MesNac = Integer.parseInt(PanelForm.MesNac.getText().toString());
				AnioNac = Integer.parseInt(PanelForm.AnioNac.getText().toString());
				
				//Validando Fechas
				FlagEval = ValidacionFechas(DiaEvaluacion,MesEvaluacion,AnioEvaluacion,DiaActual,MesActual,AnioActual);
				FlagNac = ValidacionFechas(DiaNac,MesNac,AnioNac,DiaEvaluacion,MesEvaluacion,AnioEvaluacion);
				
				if(FlagEval == 1)
					JOptionPane.showMessageDialog(null,"Error, la fecha de evaluacion es incorrecta"," Error de Entrada", JOptionPane.ERROR_MESSAGE);
				
				if(FlagNac == 1)
					JOptionPane.showMessageDialog(null,"Error, la fecha de nacimiento es incorrecta"," Error de Entrada", JOptionPane.ERROR_MESSAGE);
				else
				{
					EdadPaciente = ObtenerEdadPaciente(DiaNac,MesNac,AnioNac,DiaEvaluacion,MesEvaluacion,AnioEvaluacion);
					if(EdadPaciente<=60  || EdadPaciente>120)
						JOptionPane.showMessageDialog(null,"Error, edad del paciente debe ser superior a los 60 años o es mayor de 120 años","Error Edad", JOptionPane.ERROR_MESSAGE);
				}

				//No necesitan ser verificados.
				Sexo = PanelForm.GrupoSexo.getSelection().getActionCommand();
				Calle = PanelForm.Calle.getText().toString();
				NumExterior = Integer.parseInt(PanelForm.NumExterior.getText().toString());
				NumInterior = Integer.parseInt(PanelForm.NumInterior.getText().toString());
				Zona = Integer.parseInt(PanelForm.Zona.getText().toString());
				AniosVivienda = Integer.parseInt(PanelForm.AniosVivienda.getText().toString());
				MesesVivienda = Integer.parseInt(PanelForm.MesesVivienda.getText().toString());
				EstadoCivil = PanelForm.GrupoEstadoCivil.getSelection().getActionCommand();
				AniosEstudios = Integer.parseInt(PanelForm.GrupoEstudios.getSelection().getActionCommand());
				Leer = PanelForm.GrupoLeer.getSelection().getActionCommand();
				Escribir = PanelForm.GrupoEscribir.getSelection().getActionCommand();
				Ocupacion = PanelForm.GrupoEmpleo.getSelection().getActionCommand();
				Religion = PanelForm.GrupoReligion.getSelection().getActionCommand();

				if(NumExterior < 0)
				{
					FlagNumExt = 1;
					JOptionPane.showMessageDialog(null,"Error, el número exterior no puede ser negativo","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				}
				if(NumExterior < 0)
				{
					FlagNumInt = 1;
					JOptionPane.showMessageDialog(null,"Error, el número interior no puede ser negativo","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				}
				if(Zona < 0)
				{
					FlagZona = 1;
					JOptionPane.showMessageDialog(null,"Error, la zona no puede ser negativa","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				}				
				if(MesesVivienda < 0 || MesesVivienda > 12)
				{
					FlagMesesVivienda = 1;
					JOptionPane.showMessageDialog(null,"Error, el mes ingresado no puede ser superior a 12 meses o negativo","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				}
				if(AniosVivienda < 0)
				{
					FlagAniosVivienda = 1;
					JOptionPane.showMessageDialog(null,"Error, el año no puede ser negativo","Error de Entrada", JOptionPane.ERROR_MESSAGE);
				}


				if(AniosEstudios !=0)
				{
					if(Leer.equals("Si") && Escribir.equals("Si"))
						FlagAniosdeEstudio = 0;
					else
					{
						FlagAniosdeEstudio = 1;
						JOptionPane.showMessageDialog(null,"Error, debe saber leer y escribir para el nivel académico seleccionado","Error de Entrada", JOptionPane.ERROR_MESSAGE);
					}
				}

				if (FlagNomMedico == 0 && FlagApPatMedico == 0 && FlagApMatMedico == 0 && FlagNomPac==0 && FlagApPatPac==0 && FlagApMatPac==0 && FlagDel_Mun == 0 && FlagCP == 0 && FlagTF == 0 && FlagTM == 0 && FlagEntidad == 0 && FlagNac == 0 && FlagEval == 0 && FlagAniosdeEstudio == 0 && FlagMesesVivienda ==0 && FlagAniosVivienda == 0 && FlagNumExt == 0 && FlagNumInt == 0 && FlagZona == 0 && (EdadPaciente > 60 && EdadPaciente <= 120)) 
				{
					FNacimiento = AnioNac+"-"+MesNac+"-"+DiaNac;
					FEvaluacion= AnioEvaluacion+"-"+MesEvaluacion+"-"+DiaEvaluacion;
					PanelForm.Edad.setText("B.4 Edad: "+EdadPaciente+" Años");
					JOptionPane.showMessageDialog(null,"Se agregó con éxito a (el/la) paciente: "+NomPac+" al ArrayList","Mensaje Usuario", JOptionPane.INFORMATION_MESSAGE);
					conx.getConnection();
					conx.GuardarRegistros();	
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
		if (Pattern.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ. ]+",Cadena))
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
