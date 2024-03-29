import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.SwingConstants;

public class PanelForm extends JPanel
{
	static JLabel EncabezadoA,EncabezadoB,Diagonal,NomMedico,FechaEvaluacion,Sexo,NomPaciente,FechaNac,Edad,Anios,Direccion,TF,TM,Pregunta1,Anios2,Meses,Pregunta2,EstadoCivil,Pregunta3,Nota,NoEstudio,Primaria,Secundaria,Preparatoria,Licenciatura,Postgrado,Pregunta4,Pregunta5,Pregunta6,Pregunta7,Dia,Mes,Anio,MesesVida,AniosVida,TextoApPat,TextoApMat,TextoNom,TextoCalle,TextoNumExt,TextoNumInt,TextoZona,TextoDelg,TextoCP;
	static JTextField NombreMedico,ApellidoPatMedico,ApellidoMatMedico,DiaEvaluacion,MesEvaluacion,AnioEvaluacion,NomPac,ApPatPac,ApMatPac,DiaNac,MesNac,AnioNac,Calle,NumExterior,NumInterior,Zona,Del_Mun,CP,TelefonoF,TelefonoM,AniosVivienda,MesesVivienda,EntidadOrigen;
	static JRadioButton Masculino,Femenino,Casado,UnionL,Soltero,Separado,Divorciado,Viudo,NoSabe,Num,Num1,Num2,Num3,Num4,Num5,Num6,Num7,Num8,Num9,Num10,Num11,Num12,Num13,Num14,Num15,Num16,Num17,Num18,Num19,Num20,Num21,Num22,Num23,Num24,Num25,OpcionS1,OpcionS2,OpcionN1,OpcionN2,Desempleado,JubiladoS,JubiladoC,Profesionista,Jefe,AmaCasa,Ninguna,Catolica,Cristiana,Judio;
	static ButtonGroup GrupoSexo,GrupoEstadoCivil,GrupoEstudios,GrupoLeer,GrupoEscribir,GrupoEmpleo,GrupoReligion;
	static JButton Guardar;	

	PanelForm()
	{
		setLayout(null);
       	setBackground(new Color(41, 41, 41));
       	Font Fuente = new Font("Ubuntu", 3, 16);
       	Font Fuente2 = new Font("Ubuntu", 1, 14);

       	JLabel EtiquetaImagen = new JLabel();
       	Icon Encabezado = new ImageIcon(getClass().getResource("clinica2.png"));
	    EtiquetaImagen.setText("");
   		EtiquetaImagen.setIcon(Encabezado);
    	EtiquetaImagen.setHorizontalTextPosition(SwingConstants.CENTER);
    	EtiquetaImagen.setVerticalTextPosition(SwingConstants.CENTER);
	    //(x,y,width,height) -> esquina superior izquierda
		EtiquetaImagen.setBounds(580,10,40,40);

	    EncabezadoA = new JLabel("A. Datos de Identificación del encuestador");
	    EncabezadoA.setForeground(Color.white);
	    EncabezadoA.setFont(Fuente);
	    EncabezadoA.setBounds(25,45,350,25);

	    NomMedico = new JLabel("Nombre del médico y/o nutriólogo:");
	    NomMedico.setForeground(Color.white);
	    NomMedico.setFont(Fuente2);
	    NomMedico.setBounds(25,80,300,25);
	    ApellidoPatMedico = new JTextField("",15);
	    ApellidoPatMedico.setBounds(280,80,150,25);	    
	    TextoApPat = new JLabel("Apellido Paterno");
	    TextoApPat.setForeground(Color.white);
	    TextoApPat.setFont(Fuente2);
	    TextoApPat.setBounds(280,100,300,25);

	    ApellidoMatMedico = new JTextField("",15);
	    ApellidoMatMedico.setBounds(450,80,150,25);

	    TextoApMat = new JLabel("Apellido Materno");
	    TextoApMat.setForeground(Color.white);
	    TextoApMat.setFont(Fuente2);
	    TextoApMat.setBounds(450,100,300,25);

	    NombreMedico = new JTextField("",15);
	    NombreMedico.setBounds(620,80,150,25);
	    TextoNom = new JLabel("Nombre(s)");
	    TextoNom.setForeground(Color.white);
	    TextoNom.setFont(Fuente2);
	    TextoNom.setBounds(620,100,300,25);
	    
	    FechaEvaluacion = new JLabel("Fecha de Evaluación:");
	    FechaEvaluacion.setForeground(Color.white);
	    FechaEvaluacion.setFont(Fuente2);
	    FechaEvaluacion.setBounds(790,80,300,25);
	    DiaEvaluacion = new JTextField("",2);
	    DiaEvaluacion.setBounds(950,80,50,25);
	    MesEvaluacion = new JTextField("",2);
	    MesEvaluacion.setBounds(1020,80,50,25);
	    AnioEvaluacion = new JTextField("",4);
	    AnioEvaluacion.setBounds(1090,80,50,25);
	    Dia = new JLabel("dd");
	    Dia.setForeground(Color.white);
	    Dia.setFont(Fuente2);
	    Dia.setBounds(950,100,50,25);
	    Mes = new JLabel("mm");
	    Mes.setForeground(Color.white);
	    Mes.setFont(Fuente2);
	    Mes.setBounds(1020,100,50,25);
	    Anio = new JLabel("aaaa");
	    Anio.setForeground(Color.white);
	    Anio.setFont(Fuente2);
	    Anio.setBounds(1090,100,50,25);


	    EncabezadoB = new JLabel("B. Cédula de identificación del paciente");
	    EncabezadoB.setForeground(Color.white);
	    EncabezadoB.setFont(Fuente);
	    EncabezadoB.setBounds(25,120,300,25);

	    NomPaciente = new JLabel("B.1 Nombre:");
	    NomPaciente.setForeground(Color.white);
	    NomPaciente.setFont(Fuente2);
	    NomPaciente.setBounds(25,155,100,25);
	    ApPatPac = new JTextField("Apellido Paterno",15);
	    ApPatPac.setBounds(130,155,150,25);
	    ApMatPac = new JTextField("Apellido Materno",15);
	    ApMatPac.setBounds(300,155,150,25);
	    NomPac = new JTextField("Nombre(s)",15);
	    NomPac.setBounds(470,155,150,25);

	    Sexo = new JLabel("B.2 Sexo:");
	    Sexo.setForeground(Color.white);
	    Sexo.setFont(Fuente2);
	    Sexo.setBounds(640,155,300,25);
	    Masculino = new JRadioButton("Hombre");
	    Masculino.setForeground(Color.white);
		Masculino.setBackground(new Color(100, 100, 100));
		Masculino.setBounds(720,155,100,25);
		Femenino = new JRadioButton("Mujer");
	    Femenino.setForeground(Color.white);
		Femenino.setBackground(new Color(100, 100, 100));
		Femenino.setBounds(840,155,100,25);

		FechaNac = new JLabel("B.3 Fecha de Nacimiento:");
	    FechaNac.setForeground(Color.white);
	    FechaNac.setFont(Fuente2);
	    FechaNac.setBounds(25,190,300,25);
	    DiaNac = new JTextField("",2);
	    DiaNac.setBounds(215,190,50,25);
	    MesNac = new JTextField("",2);
	    MesNac.setBounds(285,190,50,25);
	    AnioNac = new JTextField("",4);
	    AnioNac.setBounds(355,190,50,25);

	    Edad = new JLabel("B.4 Edad: ___ Años");
	    Edad.setForeground(Color.white);
	    Edad.setFont(Fuente2);
	    Edad.setBounds(425,190,300,25);

	    Direccion = new JLabel("B.5 Direccion:");
	    Direccion.setForeground(Color.white);
	    Direccion.setFont(Fuente2);
	    Direccion.setBounds(25,225,300,25);
	    Calle = new JTextField("",50);
	    Calle.setBounds(185,225,300,25);
	    TextoCalle = new JLabel("Calle:");
	    TextoCalle.setForeground(Color.white);
	    TextoCalle.setFont(Fuente2);
	    TextoCalle.setBounds(135,225,40,25);
	    NumExterior = new JTextField("",4);
	    NumExterior.setBounds(590,225,80,25);
	    TextoNumExt = new JLabel("No. Exterior:");
	    TextoNumExt.setForeground(Color.white);
	    TextoNumExt.setFont(Fuente2);
	    TextoNumExt.setBounds(490,225,100,25);
	    NumInterior = new JTextField("",4);
	    NumInterior.setBounds(690,225,80,25);
	    TextoNumInt = new JLabel("No. Interior");
	    TextoNumInt.setForeground(Color.white);
	    TextoNumInt.setFont(Fuente2);
	    TextoNumInt.setBounds(690,250,100,25);
	    Zona = new JTextField("",4);
	    Zona.setBounds(790,225,50,25);
	    TextoZona = new JLabel("Zona");
	    TextoZona.setForeground(Color.white);
	    TextoZona.setFont(Fuente2);
	    TextoZona.setBounds(790,250,100,25);
	    Del_Mun = new JTextField("",50);
	    Del_Mun.setBounds(860,225,150,25);
	    TextoDelg = new JLabel("Delegación/Municipio");
	    TextoDelg.setForeground(Color.white);
	    TextoDelg.setFont(Fuente2);
	    TextoDelg.setBounds(860,250,150,25);
	    CP = new JTextField("",50);
	    CP.setBounds(1030,225,110,25);
	    TextoCP = new JLabel("Código Postal");
	    TextoCP.setForeground(Color.white);
	    TextoCP.setFont(Fuente2);
	    TextoCP.setBounds(1030,250,100,25);

	    

	    TF = new JLabel("B.6 Teléfono Fijo (casa):");
	    TF.setForeground(Color.white);
	    TF.setFont(Fuente2);
	    TF.setBounds(25,260,300,25);
	    TelefonoF = new JTextField("",50);
	    TelefonoF.setBounds(200,260,150,25);

	    TM = new JLabel("B.7 Teléfono Móvil:");
	    TM.setForeground(Color.white);
	    TM.setFont(Fuente2);
	    TM.setBounds(370,260,300,25);
	    TelefonoM = new JTextField("",50);
	    TelefonoM.setBounds(520,260,150,25);

	    Pregunta1 = new JLabel("B.8 ¿Cuánto tiempo lleva viviendo en este domicilio? (indique meses o años)");
	    Pregunta1.setForeground(Color.white);
	    Pregunta1.setFont(Fuente2);
	    Pregunta1.setBounds(25,295,500,25);
	    AniosVivienda = new JTextField("",50);
	    AniosVivienda.setBounds(590,295,50,25);
	    MesesVivienda = new JTextField("",50);
	    MesesVivienda.setBounds(710,295,50,25);
	    AniosVida = new JLabel("Años:");
	    AniosVida.setForeground(Color.white);
	    AniosVida.setFont(Fuente);
	    AniosVida.setBounds(540,295,50,25);
	    MesesVida = new JLabel("Meses:");
	    MesesVida.setForeground(Color.white);
	    MesesVida.setFont(Fuente);
	    MesesVida.setBounds(650,295,80,25);

	    Pregunta2 = new JLabel("B.9 Estado/Entidad de Origen");
	    Pregunta2.setForeground(Color.white);
	    Pregunta2.setFont(Fuente2);
	    Pregunta2.setBounds(780,295,300,25);
	    EntidadOrigen = new JTextField("",50);
	    EntidadOrigen.setBounds(990,295,150,25);

	    EstadoCivil = new JLabel("B.10 Estado Civil:");
	    EstadoCivil.setForeground(Color.white);
	    EstadoCivil.setFont(Fuente2);
	    EstadoCivil.setBounds(25,330,300,25);
	    Casado = new JRadioButton("Casado");
	    Casado.setForeground(Color.white);
		Casado.setBackground(new Color(100, 100, 100));
		Casado.setBounds(160,330,110,25);
		UnionL = new JRadioButton("Unión Libre");
	    UnionL.setForeground(Color.white);
		UnionL.setBackground(new Color(100, 100, 100));
		UnionL.setBounds(290,330,110,25);
		Soltero = new JRadioButton("Soltero");
	    Soltero.setForeground(Color.white);
		Soltero.setBackground(new Color(100, 100, 100));
		Soltero.setBounds(420,330,110,25);
		Separado = new JRadioButton("Separado");
	    Separado.setForeground(Color.white);
		Separado.setBackground(new Color(100, 100, 100));
		Separado.setBounds(550,330,110,25);
		Divorciado = new JRadioButton("Divorciado");
	    Divorciado.setForeground(Color.white);
		Divorciado.setBackground(new Color(100, 100, 100));
		Divorciado.setBounds(680,330,110,25);
		Viudo = new JRadioButton("Viudo");
	    Viudo.setForeground(Color.white);
		Viudo.setBackground(new Color(100, 100, 100));
		Viudo.setBounds(810,330,110,25);
		NoSabe = new JRadioButton("No Sabe / No Responde");
	    NoSabe.setForeground(Color.white);
		NoSabe.setBackground(new Color(100, 100, 100));
		NoSabe.setBounds(940,330,200,25);

		Pregunta3 = new JLabel("B.11 ¿Qué nivel de estudios tiene?");
	    Pregunta3.setForeground(Color.white);
	    Pregunta3.setFont(Fuente2);
	    Pregunta3.setBounds(25,365,300,25);
	    Nota = new JLabel("(Pase al item B.14)");
	    Nota.setForeground(Color.white);
	    Nota.setFont(Fuente2);
	    Nota.setBounds(270,365,300,25);
	    NoEstudio = new JLabel("No estudió:");
	    NoEstudio.setForeground(Color.white);
	    NoEstudio.setFont(Fuente2);
	    NoEstudio.setBounds(420,365,300,25);
	    Num = new JRadioButton("0");
	    Num.setForeground(Color.white);
		Num.setBackground(new Color(100, 100, 100));
		Num.setBounds(570,365,50,25);
		Primaria = new JLabel("Primaria en años:");
	    Primaria.setForeground(Color.white);
	    Primaria.setFont(Fuente2);
	    Primaria.setBounds(640,365,300,25);
	    Num1 = new JRadioButton("1");
	    Num1.setForeground(Color.white);
		Num1.setBackground(new Color(100, 100, 100));
		Num1.setBounds(780,365,50,25);
		Num2 = new JRadioButton("2");
	    Num2.setForeground(Color.white);
		Num2.setBackground(new Color(100, 100, 100));
		Num2.setBounds(850,365,50,25);
		Num3 = new JRadioButton("3");
	    Num3.setForeground(Color.white);
		Num3.setBackground(new Color(100, 100, 100));
		Num3.setBounds(920,365,50,25);
		Num4 = new JRadioButton("4");
	    Num4.setForeground(Color.white);
		Num4.setBackground(new Color(100, 100, 100));
		Num4.setBounds(990,365,50,25);
		Num5 = new JRadioButton("5");
	    Num5.setForeground(Color.white);
		Num5.setBackground(new Color(100, 100, 100));
		Num5.setBounds(1060,365,50,25);
		Num6 = new JRadioButton("6");
	    Num6.setForeground(Color.white);
		Num6.setBackground(new Color(100, 100, 100));
		Num6.setBounds(1130,365,50,25);

		Secundaria = new JLabel("Secundaria en años:");
	    Secundaria.setForeground(Color.white);
	    Secundaria.setFont(Fuente2);
	    Secundaria.setBounds(420,400,300,25);
	    Num7 = new JRadioButton("7");
	    Num7.setForeground(Color.white);
		Num7.setBackground(new Color(100, 100, 100));
		Num7.setBounds(570,400,50,25);
		Num8 = new JRadioButton("8");
	    Num8.setForeground(Color.white);
		Num8.setBackground(new Color(100, 100, 100));
		Num8.setBounds(640,400,50,25);
		Num9 = new JRadioButton("9");
	    Num9.setForeground(Color.white);
		Num9.setBackground(new Color(100, 100, 100));
		Num9.setBounds(710,400,50,25);
		Preparatoria = new JLabel("Preparatoria (téc.) en años:");
	    Preparatoria.setForeground(Color.white);
	    Preparatoria.setFont(Fuente2);
	    Preparatoria.setBounds(780,400,300,25);
	    Num10 = new JRadioButton("10");
	    Num10.setForeground(Color.white);
		Num10.setBackground(new Color(100, 100, 100));
		Num10.setBounds(990,400,50,25);
		Num11 = new JRadioButton("11");
	    Num11.setForeground(Color.white);
		Num11.setBackground(new Color(100, 100, 100));
		Num11.setBounds(1060,400,50,25);
		Num12 = new JRadioButton("12");
	    Num12.setForeground(Color.white);
		Num12.setBackground(new Color(100, 100, 100));
		Num12.setBounds(1130,400,50,25);
		Licenciatura = new JLabel("Licenciatura en años:");
	    Licenciatura.setForeground(Color.white);
	    Licenciatura.setFont(Fuente2);
	    Licenciatura.setBounds(420,435,300,25);
	    Num13 = new JRadioButton("13");
	    Num13.setForeground(Color.white);
		Num13.setBackground(new Color(100, 100, 100));
		Num13.setBounds(570,435,50,25);
		Num14 = new JRadioButton("14");
	    Num14.setForeground(Color.white);
		Num14.setBackground(new Color(100, 100, 100));
		Num14.setBounds(640,435,50,25);
		Num15 = new JRadioButton("15");
	    Num15.setForeground(Color.white);
		Num15.setBackground(new Color(100, 100, 100));
		Num15.setBounds(710,435,50,25);
		Num16 = new JRadioButton("16");
	    Num16.setForeground(Color.white);
		Num16.setBackground(new Color(100, 100, 100));
		Num16.setBounds(780,435,50,25);
		Num17 = new JRadioButton("17");
	    Num17.setForeground(Color.white);
		Num17.setBackground(new Color(100, 100, 100));
		Num17.setBounds(850,435,50,25);
		Num18 = new JRadioButton("18");
	    Num18.setForeground(Color.white);
		Num18.setBackground(new Color(100, 100, 100));
		Num18.setBounds(920,435,50,25);
		Postgrado = new JLabel("Postgrado en años:");
	    Postgrado.setForeground(Color.white);
	    Postgrado.setFont(Fuente2);
	    Postgrado.setBounds(420,470,300,25);
	    Num19 = new JRadioButton("19");
	    Num19.setForeground(Color.white);
		Num19.setBackground(new Color(100, 100, 100));
		Num19.setBounds(570,470,50,25);
		Num20 = new JRadioButton("20");
	    Num20.setForeground(Color.white);
		Num20.setBackground(new Color(100, 100, 100));
		Num20.setBounds(640,470,50,25);
		Num21 = new JRadioButton("21");
	    Num21.setForeground(Color.white);
		Num21.setBackground(new Color(100, 100, 100));
		Num21.setBounds(710,470,50,25);
		Num22 = new JRadioButton("22");
	    Num22.setForeground(Color.white);
		Num22.setBackground(new Color(100, 100, 100));
		Num22.setBounds(780,470,50,25);
		Num23 = new JRadioButton("23");
	    Num23.setForeground(Color.white);
		Num23.setBackground(new Color(100, 100, 100));
		Num23.setBounds(850,470,50,25);
		Num24 = new JRadioButton("24");
	    Num24.setForeground(Color.white);
		Num24.setBackground(new Color(100, 100, 100));
		Num24.setBounds(920,470,50,25);
		Num25 = new JRadioButton("25");
	    Num25.setForeground(Color.white);
		Num25.setBackground(new Color(100, 100, 100));
		Num25.setBounds(990,470,50,25);

		Pregunta4 = new JLabel("B.12 ¿Sabes Leer?");
	    Pregunta4.setForeground(Color.white);
	    Pregunta4.setFont(Fuente2);
	    Pregunta4.setBounds(25,505,300,25);
	    OpcionS1 = new JRadioButton("Si");
	    OpcionS1.setForeground(Color.white);
		OpcionS1.setBackground(new Color(100, 100, 100));
		OpcionS1.setBounds(160,505,50,25);
		OpcionN1 = new JRadioButton("No");
	    OpcionN1.setForeground(Color.white);
		OpcionN1.setBackground(new Color(100, 100, 100));
		OpcionN1.setBounds(230,505,50,25);

	    Pregunta5 = new JLabel("B.13 ¿Sabes escribir?");
	    Pregunta5.setForeground(Color.white);
	    Pregunta5.setFont(Fuente2);
	    Pregunta5.setBounds(300,505,300,25);
	    OpcionS2 = new JRadioButton("Si");
	    OpcionS2.setForeground(Color.white);
		OpcionS2.setBackground(new Color(100, 100, 100));
		OpcionS2.setBounds(455,505,50,25);
		OpcionN2 = new JRadioButton("No");
	    OpcionN2.setForeground(Color.white);
		OpcionN2.setBackground(new Color(100, 100, 100));
		OpcionN2.setBounds(525,505,50,25);

		Pregunta6 = new JLabel("B.14 ¿A qué se dedica actualmente?");
	    Pregunta6.setForeground(Color.white);
	    Pregunta6.setFont(Fuente2);
	    Pregunta6.setBounds(25,540,300,25);
	    Desempleado = new JRadioButton("Desempleado");
	    Desempleado.setForeground(Color.white);
		Desempleado.setBackground(new Color(100, 100, 100));
		Desempleado.setBounds(280,540,200,25);
		JubiladoS = new JRadioButton("Jubilado(a) sin pensión");
	    JubiladoS.setForeground(Color.white);
		JubiladoS.setBackground(new Color(100, 100, 100));
		JubiladoS.setBounds(500,540,200,25);
		JubiladoC = new JRadioButton("Jubilado(a) con pensión");
	    JubiladoC.setForeground(Color.white);
		JubiladoC.setBackground(new Color(100, 100, 100));
		JubiladoC.setBounds(720,540,200,25);
		Profesionista = new JRadioButton("Profesionista independiente");
	    Profesionista.setForeground(Color.white);
		Profesionista.setBackground(new Color(100, 100, 100));
		Profesionista.setBounds(940,540,220,25);
		Jefe = new JRadioButton("Patrón(a) jefe(a) o empresario(a)");
	    Jefe.setForeground(Color.white);
		Jefe.setBackground(new Color(100, 100, 100));
		Jefe.setBounds(280,575,420,25);
		AmaCasa = new JRadioButton("Ama de casa");
	    AmaCasa.setForeground(Color.white);
		AmaCasa.setBackground(new Color(100, 100, 100));
		AmaCasa.setBounds(720,575,200,25);

		Pregunta7 = new JLabel("B.15 ¿De qué religión es usted?");
	    Pregunta7.setForeground(Color.white);
	    Pregunta7.setFont(Fuente2);
	    Pregunta7.setBounds(25,610,300,25);
	    Ninguna = new JRadioButton("Ninguna");
	    Ninguna.setForeground(Color.white);
		Ninguna.setBackground(new Color(100, 100, 100));
		Ninguna.setBounds(280,610,200,25);
		Catolica = new JRadioButton("Católica");
	    Catolica.setForeground(Color.white);
		Catolica.setBackground(new Color(100, 100, 100));
		Catolica.setBounds(500,610,200,25);
		Cristiana = new JRadioButton("Cristiana");
	    Cristiana.setForeground(Color.white);
		Cristiana.setBackground(new Color(100, 100, 100));
		Cristiana.setBounds(720,610,200,25);
		Judio = new JRadioButton("Judío");
	    Judio.setForeground(Color.white);
		Judio.setBackground(new Color(100, 100, 100));
		Judio.setBounds(940,610,220,25);

	    Guardar = new JButton("Guardar Información");
	    Guardar.setBounds(940,645,220,35);

	    GrupoSexo = new ButtonGroup();
	   	GrupoEstadoCivil = new ButtonGroup();
	    GrupoEstudios = new ButtonGroup();
	    GrupoLeer = new ButtonGroup();
	    GrupoEscribir = new ButtonGroup();
	    GrupoEmpleo = new ButtonGroup();
	    GrupoReligion = new ButtonGroup();

	    GrupoSexo.add(Masculino);
	    GrupoSexo.add(Femenino);
		Masculino.setActionCommand("Hombre");
		Femenino.setActionCommand("Mujer");

	    GrupoEstadoCivil.add(Casado);
	    GrupoEstadoCivil.add(UnionL);
	    GrupoEstadoCivil.add(Soltero);
	    GrupoEstadoCivil.add(Separado);
	    GrupoEstadoCivil.add(Divorciado);
	    GrupoEstadoCivil.add(Viudo);
	    GrupoEstadoCivil.add(NoSabe);
	    Casado.setActionCommand("Casado");
		UnionL.setActionCommand("Unión Libre");
		Soltero.setActionCommand("Soltero");
		Separado.setActionCommand("Separado");
		Divorciado.setActionCommand("Divorciado");
		Viudo.setActionCommand("Viudo");
		NoSabe.setActionCommand("No sabe / no responde");

	    GrupoEstudios.add(Num);
	    GrupoEstudios.add(Num1);
	    GrupoEstudios.add(Num2);
	    GrupoEstudios.add(Num3);
	    GrupoEstudios.add(Num4);
	    GrupoEstudios.add(Num5);
	    GrupoEstudios.add(Num6);
	    GrupoEstudios.add(Num7);
	    GrupoEstudios.add(Num8);
	    GrupoEstudios.add(Num9);
	    GrupoEstudios.add(Num10);
	    GrupoEstudios.add(Num11);
	    GrupoEstudios.add(Num12);
	    GrupoEstudios.add(Num13);
	    GrupoEstudios.add(Num14);
	    GrupoEstudios.add(Num15);
	    GrupoEstudios.add(Num16);
	    GrupoEstudios.add(Num17);
	    GrupoEstudios.add(Num18);
	    GrupoEstudios.add(Num19);
	    GrupoEstudios.add(Num20);
	    GrupoEstudios.add(Num21);
	    GrupoEstudios.add(Num22);
	    GrupoEstudios.add(Num23);
	    GrupoEstudios.add(Num24);
	    GrupoEstudios.add(Num25);
	    Num.setActionCommand("0");
		Num1.setActionCommand("1");
		Num2.setActionCommand("2");
		Num3.setActionCommand("3");
		Num4.setActionCommand("4");
		Num5.setActionCommand("5");
		Num6.setActionCommand("6");
		Num7.setActionCommand("7");
		Num8.setActionCommand("8");
		Num9.setActionCommand("9");
		Num10.setActionCommand("10");
		Num11.setActionCommand("11");
		Num12.setActionCommand("12");
		Num13.setActionCommand("13");
		Num14.setActionCommand("14");
		Num15.setActionCommand("15");
		Num16.setActionCommand("16");
		Num17.setActionCommand("17");
		Num18.setActionCommand("18");
		Num19.setActionCommand("19");
		Num20.setActionCommand("20");
		Num21.setActionCommand("21");
		Num22.setActionCommand("22");
		Num23.setActionCommand("23");
		Num24.setActionCommand("24");
		Num25.setActionCommand("25");

	    GrupoLeer.add(OpcionS1);
	    GrupoLeer.add(OpcionN1);
	    OpcionS1.setActionCommand("Si");
		OpcionN1.setActionCommand("No");

	    GrupoEscribir.add(OpcionS2);
	    GrupoEscribir.add(OpcionN2);
	    OpcionS2.setActionCommand("Si");
		OpcionN2.setActionCommand("No");

	    GrupoEmpleo.add(Desempleado);
	    GrupoEmpleo.add(JubiladoS);
	    GrupoEmpleo.add(JubiladoC);
	    GrupoEmpleo.add(Profesionista);
	    GrupoEmpleo.add(Jefe);
	    GrupoEmpleo.add(AmaCasa);
	    Desempleado.setActionCommand("Desempleado");
		JubiladoS.setActionCommand("Jubilado sin pensión");
		JubiladoC.setActionCommand("Jubilado con pensión");
		Profesionista.setActionCommand("Profesionista independiente");
		Jefe.setActionCommand("Patrón(a), Jefe(a) o empresario(a)");
		AmaCasa.setActionCommand("Ama de casa");

	    GrupoReligion.add(Ninguna);
	    GrupoReligion.add(Catolica);
	    GrupoReligion.add(Cristiana);
	    GrupoReligion.add(Judio);
	    Ninguna.setActionCommand("Ninguna");
		Catolica.setActionCommand("Católica");
		Cristiana.setActionCommand("Cristiana");
		Judio.setActionCommand("Judío");

		add(EtiquetaImagen);
	    add(EncabezadoA);
	    add(NomMedico);
	    add(ApellidoPatMedico);
	    add(ApellidoMatMedico);
	    add(NombreMedico);
	    add(TextoApPat);
	    add(TextoApMat);
	    add(TextoNom);
	    add(FechaEvaluacion);
	    add(DiaEvaluacion);
	    add(MesEvaluacion);
	    add(AnioEvaluacion);
	    add(Dia);
	    add(Mes);
	    add(Anio);
	    add(EncabezadoB);
	    add(NomPaciente);
	    add(ApPatPac);
	    add(ApMatPac);
	    add(NomPac);
	    add(Sexo);
	    add(Masculino);
	    add(Femenino);
	    add(FechaNac);
	    add(DiaNac);
	    add(MesNac);
	    add(AnioNac);
	    add(Edad);
	    add(Direccion);
	    add(Calle);
	    add(TextoCalle);
	    add(NumExterior);
	    add(TextoNumExt);
	    add(NumInterior);
	    add(TextoNumInt);
	    add(Zona);
	    add(TextoZona);
	    add(Del_Mun);
	    add(TextoDelg);
	    add(CP);
	    add(TextoCP);
	    add(TF);
	    add(TelefonoF);
	    add(TM);
	    add(TelefonoM);
	    add(Pregunta1);
	    add(AniosVivienda);
	    add(MesesVivienda);
	    add(AniosVida);
	    add(MesesVida);
	    add(Pregunta2);
	    add(EntidadOrigen);
	    add(EstadoCivil);
	    add(Casado);
	    add(UnionL);
	    add(Soltero);
	    add(Separado);
	    add(Divorciado);
	    add(Viudo);
	    add(NoSabe);
	    add(Pregunta3);
	    add(Nota);
	    add(NoEstudio);
	    add(Num);
	    add(Primaria);
	    add(Num1);
	    add(Num2);
	    add(Num3);
	    add(Num4);
	    add(Num5);
	    add(Num6);
	    add(Secundaria);
	    add(Num7);
	    add(Num8);
	    add(Num9);
	    add(Preparatoria);
	    add(Num10);
	    add(Num11);
	    add(Num12);
	    add(Licenciatura);
	    add(Num13);
	    add(Num14);
	    add(Num15);
	    add(Num16);
	    add(Num17);
	    add(Num18);
	    add(Postgrado);
	    add(Num19);
	    add(Num20);
	    add(Num21);
	    add(Num22);
	    add(Num23);
	    add(Num24);
	    add(Num25);
	    add(Pregunta4);
	    add(OpcionS1);
	    add(OpcionN1);
	    add(Pregunta5);
	    add(OpcionS2);
	    add(OpcionN2);
	    add(Pregunta6);
	    add(Desempleado);
	    add(JubiladoS);
	    add(JubiladoC);
	    add(Profesionista);
	    add(Jefe);
	    add(AmaCasa);
	    add(Pregunta7);
	    add(Ninguna);
	    add(Catolica);
	    add(Cristiana);
	    add(Judio);
		add(Guardar);
	}
}
