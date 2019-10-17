public class Paciente
{
  private String NombreMedico, ApellidoPatMedico, ApellidoMatMedico,NombrePaciente, ApellidoPatPaciente, ApellidoMatPaciente,Sexo,Calle,Zona,Delegacion,TelefonoF,TelefonoM,EdoDeOrigen,EstadoCivil,Leer,Escribir,EmpleoActual,Religion;
  private int DiaEvaluacion, MesEvaluacion, AnioEvaluacion, DiaNac, MesNac, AnioNac, Edad,NumExterior,NumInterior,Vivienda,AniosEstudios;

  public Paciente(String NombreMedico,String ApellidoPatMedico, String ApellidoMatMedico, String NombrePaciente,String ApellidoPatMedico, String ApellidoMatPaciente, String Sexo, String Calle, String Zona, String Delegacion, String TelefonoF, String TelefonoM, String EdoDeOrigen, String EstadoCivil, String Leer, String Escribir,String EmpleoActual, String Religion,int DiaEvaluacion, int MesEvaluacion, int AnioEvaluacion,int DiaNac, int MesNac, int AnioNac, int Edad, int NumExterior, int NumInterior, int Vivienda, int AniosEstudios)
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
    this.Vivienda = Vivienda;
    this.AniosEstudios = AniosEstudios;
  }
  public String toString()
  {
    String Contenido;
    Contenido = NombreMedico+","+ApellidoPatMedico+","+ApellidoMatMedico+","+NombrePaciente+","+ApellidoPatPaciente+","+ApellidoMatPaciente+","+Sexo+","+Calle+","+Zona+",",+Delegacion+","+TelefonoF+","+TelefonoM+","+EdoDeOrigen+","+EstadoCivil+","+Leer+","+Escribir+","+EmpleoActual+","+Religion+","+DiaEvaluacion+","+MesEvaluacion+","+AnioEvaluacion+","+DiaNac+","+MesNac+","+AnioNac+","+Edad+","+NumExterior+","+NumInterior+","+Vivienda+","+AniosEstudios;
    return Contenido;
   }
}
