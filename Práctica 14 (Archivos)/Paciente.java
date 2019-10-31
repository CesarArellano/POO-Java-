public class Paciente
{
    private String NombreMedico, ApellidoPatMedico, ApellidoMatMedico,NombrePaciente, ApellidoPatPaciente, ApellidoMatPaciente,Sexo,Calle,Delegacion,CodigoPostal,TelefonoF,TelefonoM,EdoDeOrigen,EstadoCivil,Leer,Escribir,EmpleoActual,Religion;
    private int DiaEvaluacion, MesEvaluacion, AnioEvaluacion, DiaNac, MesNac, AnioNac, Edad,NumExterior,NumInterior,Zona,AniosVivienda,MesesVivienda,AniosEstudio;

    public Paciente(String NombreMedico,String ApellidoPatMedico, String ApellidoMatMedico, String NombrePaciente,String ApellidoPatPaciente, String ApellidoMatPaciente, String Sexo, String Calle, String Delegacion,String CodigoPostal, String TelefonoF, String TelefonoM, String EdoDeOrigen, String EstadoCivil, String Leer, String Escribir,String EmpleoActual, String Religion,int DiaEvaluacion, int MesEvaluacion, int AnioEvaluacion,int DiaNac, int MesNac, int AnioNac, int Edad, int NumExterior, int NumInterior, int Zona, int AniosVivienda, int MesesVivienda, int AniosEstudio)
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
        this.CodigoPostal = CodigoPostal;
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
        Contenido = "Nombre Médico: "+NombreMedico+"\nApellido Paterno Médico: "+ApellidoPatMedico+"\nApellido Materno Médico: "+ApellidoMatMedico+"\nNombre Paciente: "+NombrePaciente+"\nApellido Paterno Paciente: "+ApellidoPatPaciente+"\nApellido Materno Paciente: "+ApellidoMatPaciente+"\nGénero: "+Sexo+"\nCalle: "+Calle+"\nZona: "+Zona+"\nDelegación/Municipio: "+Delegacion+"\nCódigo Postal: "+CodigoPostal+"\nTeléfono Fijo: "+TelefonoF+"\nTeléfono Móvil: "+TelefonoM+"\nEstado de Origen: "+EdoDeOrigen+"\nEstado Civil: "+EstadoCivil+"\nSabe Leer: "+Leer+"\nSabe Escribir: "+Escribir+"\nEmpleo Actual: "+EmpleoActual+"\nReligion: "+Religion+"\nFecha Evaluación: "+DiaEvaluacion+"/"+MesEvaluacion+"/"+AnioEvaluacion+"\nFecha Nacimiento: "+DiaNac+"/"+MesNac+"/"+AnioNac+"\nEdad: "+Edad+"\nNúmero Exterior: "+NumExterior+"\nNúmero Interior: "+NumInterior+"\nAños de Vivir en Domicilio: "+AniosVivienda+"\nMeses de Vivir en Domicilio: "+MesesVivienda+"\nAños de Estudio: "+AniosEstudio+"\n";
        return Contenido;
    }
}
