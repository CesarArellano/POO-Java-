import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PanelForm extends JPanel
{
	static JLabel EncabezadoA,EncabezadoB,Diagonal,NomMedico,FechaEvaluacion,Sexo,Hombre,Mujer,FechaNac,Edad,Anios,Direccion,Calle,NumExterior,NumInterior,Zona,Del_Mun,CP,TelefonoF,TelefonoM,Pregunta1,Anios2,Meses,Pregunta2,EstadoC,Casado,UL,Soltero,Separado,Divorciado,Viudo,NoSabe,Pregunta3,Nota1,NoEstudio,Primaria,Secundaria,Preparatoria,Licenciatura,Postgrado,Num,Num1,Num2,Num3,Num4,Num5,Num6,Num7,Num8,Num9,Num10,Num11,Num12,Num13,Num14,Num15,Num16,Num17,Num18,Num19,Num20,Num21,Num22,Num23,Num24,Num25,Pregunta4,Pregunta5,OpcionS,OpcionN,Pregunta6,Desempleado,JubiladoS,JubiladoC,Profesionista,Jefe,Ama,Pregunta7,Ninguna,Catolica,Cristiana,Judio;
	static JTextField NombreMedico,ApellidoPatMedico,ApellidoMatMedico,DiaEvaluacion,MesEvaluacion,AnioEvaluacion,NomPac,ApPatPac,ApMatPac,DiaNac,MesNac,AnioNac,EdadPac,CallePac,NumExteriorPac,NumInteriorPac,ZonaPac,Del_MPac,CPPac,TelefonoFPac,TelefonoMPac,AniosVivienda,MesesVivienda,EntidadOrigen;
	static JCheckBox Masculino,Femenino,Cas,Union,Solt,Sep,Div,Viu,NoS,N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22,N23,N24,N25,OpS1,OpS2,OpN1,OPN2,Des,JS,JC,Prof,Patron,ACasa,Ning,Cat,Cris,Jd;
	static JButton Guardar;

	PanelForm()
	{
		setLayout(null);
       	setBackground(new Color(41, 41, 41));
	    EncabezadoA = new JLabel("A. Datos de Identificación del encuestador");
	    EncabezadoA.setForeground(Color.white);
	    EncabezadoA.setBounds(25,25,300,25);
	    NomMedico = new JLabel("Nombre del médico y/o nutriólogo:");
	    NomMedico.setForeground(Color.white);
	    NomMedico.setBounds(25,60,300,25);
	    ApellidoPatMedico = new JTextField("Apellido Paterno",15);
	    ApellidoPatMedico.setBounds(280,60,150,25);
	    ApellidoMatMedico = new JTextField("Apellido Materno",15);
	    ApellidoMatMedico.setBounds(450,60,150,25);
	    NombreMedico = new JTextField("Nombre(s)",15);
	    NombreMedico.setBounds(620,60,150,25);
	    FechaEvaluacion = new JLabel("Fecha de Evaluación");
	    FechaEvaluacion.setForeground(Color.white);
	    FechaEvaluacion.setBounds(790,60,300,25);

	    Guardar = new JButton("Guardar Informacion");
	    Guardar.setBounds(385,80,150,25);

	    add(EncabezadoA);
	    add(NomMedico);
	    add(ApellidoPatMedico);
	    add(ApellidoMatMedico);
	    add(NombreMedico);
	    add(FechaEvaluacion);	
		//add(Guardar);
	}
}
