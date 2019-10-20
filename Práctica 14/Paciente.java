public class Paciente
{
  private String NombreMedico, ApellidoPatMedico, ApellidoMatMedico,NombrePaciente, ApellidoPatPaciente, ApellidoMatPaciente,Sexo,Calle,Delegacion,TelefonoF,TelefonoM,EdoDeOrigen,EstadoCivil,Leer,Escribir,EmpleoActual,Religion;
  private int DiaEvaluacion, MesEvaluacion, AnioEvaluacion, DiaNac, MesNac, AnioNac, Edad,NumExterior,NumInterior,Zona,AniosVivienda,MesesVivienda,AniosEstudio;

  public Paciente(String NombreMedico,String ApellidoPatMedico, String ApellidoMatMedico, String NombrePaciente,String ApellidoPatPaciente, String ApellidoMatPaciente, String Sexo, String Calle, String Delegacion, String TelefonoF, String TelefonoM, String EdoDeOrigen, String EstadoCivil, String Leer, String Escribir,String EmpleoActual, String Religion,int DiaEvaluacion, int MesEvaluacion, int AnioEvaluacion,int DiaNac, int MesNac, int AnioNac, int Edad, int NumExterior, int NumInterior, int Zona, int AniosVivienda, int MesesVivienda, int AniosEstudio)
  {
    this.NombreMedico = NombreMedico;
    this.ApellidoPatMedico = ApellidoPatMedico;
    this.ApellidoMatMedico = ApellidoMatMedico;
    this.NombrePaciente = NombrePaciente;
    this.ApellidoPatPaciente = ApellidoPatPaciente;
    this.ApellidoMatPaciente = ApellidoMatPaciente;
    this.Sexo = Sexo;
    this.Calle = Calle;
    this.Zona = Zona;
    this.Delegacion = Delegacion;
    this.TelefonoF = TelefonoF;
    this.TelefonoM = TelefonoM;
    this.EdoDeOrigen = EdoDeOrigen;
    this.EstadoCivil = EstadoCivil;
    this.Leer = Leer;
    this.Escribir = Escribir;
    this.EmpleoActual = EmpleoActual;
    this.Religion = Religion;
    this.DiaEvaluacion = DiaEvaluacion;
    this.MesEvaluacion = MesEvaluacion;
    this.AnioEvaluacion = AnioEvaluacion;
    this.DiaNac = DiaNac;
    this.MesNac = MesNac;
    this.AnioNac = AnioNac;
    this.Edad = Edad;
    this.NumExterior = NumExterior;
    this.NumInterior = NumInterior;
    this.AniosVivienda = AniosVivienda;
    this.MesesVivienda = MesesVivienda;
    this.AniosEstudio = AniosEstudio;
  }
  public String Impresion()
  {
    String Contenido;
    Contenido = "Nombre Médico: "+NombreMedico+",Apellido Paterno Médico: "+ApellidoPatMedico+",Apellido Materno Médico: "+ApellidoMatMedico+",Nombre Paciente: "+NombrePaciente+",Apellido Paterno Paciente: "+ApellidoPatPaciente+",Apellido Materno Paciente: "+ApellidoMatPaciente+",Género: "+Sexo+",Calle: "+Calle+",Zona: "+Zona+",Delegación/Municipio: "+Delegacion+",Teléfono Fijo: "+TelefonoF+",Teléfono Móvil: "+TelefonoM+",Estado de Origen: "+EdoDeOrigen+",Estado Civil: "+EstadoCivil+",Sabe Leer: "+Leer+",Sabe Escribir: "+Escribir+",Empleo Actual: "+EmpleoActual+",Religion: "+Religion+",Fecha Evaluación: "+DiaEvaluacion+"/"+MesEvaluacion+"/"+AnioEvaluacion+",Fecha Nacimiento: "+DiaNac+"/"+MesNac+"/"+AnioNac+",Edad: "+Edad+",Número Exterior: "+NumExterior+",Número Interior: "+NumInterior+",Años de Vivir en Domicilio: "+AniosVivienda+",Meses de Vivir en Domicilio: "+MesesVivienda+",Años de Estudio: "+AniosEstudio;
    return Contenido;
   }
}
