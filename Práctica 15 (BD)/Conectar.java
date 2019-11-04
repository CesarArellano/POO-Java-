import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;

public class Conectar
{
    //clase que me permite realizar la conexión y las consultas SQL;
    static Connection conn;
    //Java Database Connectivity (JDBC) Permite a un programa en java, conectarse a un sistema manejador de base de datos y generar consultas SQL.
    static final String driver = "com.mysql.jdbc.Driver";
    //Parámetros para entrar al servidor;
    static final String user = "root";
    static final String password = "admin";
    //nombre de la base de datos a conectar;
    static final String url = "jdbc:mysql://localhost/Clinica?useSSL=false";
    static int UltimoID;
    static ResultSet LastID;

    public Conectar()
    {
        conn = null;
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            //Se avisa de la conexión exitosa
            JOptionPane.showMessageDialog(null,"Se conectó a la base de datos: Clinica","Notificación",JOptionPane.INFORMATION_MESSAGE);
            if(conn != null)
                System.out.println("Se conectó a la base de datos: Clinica");
        }
        //Error en el driver;
        catch(ClassNotFoundException e)
        {
            System.out.println("Error al cargar el controlador.");
            e.printStackTrace();
        }
        //Error de conexión;
        catch(SQLException e)
        {
            System.out.println("No se conectó");
        }
    }
    public Connection getConnection()
    {
        return conn;
    }
    //Terminar la conexión a BD;
    public void DesConnection()
    {
        conn = null;
        if(conn == null)
        {
            System.out.println("Terminar conexión");
        }
    }
    public void GuardarRegistros() throws SQLException
    {
        try
        {
            PreparedStatement InsertarDatosMedico = conn.prepareStatement("INSERT INTO Medico VALUES(null,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            PreparedStatement InsertarDatosPaciente = conn.prepareStatement("INSERT INTO Paciente VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement InsertarDomicilio = conn.prepareStatement("INSERT INTO Domicilio VALUES(?,?,?,?,?,?,?,?,?)");

            // Inserto parámetros de medico al comando INSERT INTO;
            InsertarDatosMedico.setString(1,ManejadorEventos.NombreMedico);
            InsertarDatosMedico.setString(2,ManejadorEventos.ApellidoPatMedico);
            InsertarDatosMedico.setString(3,ManejadorEventos.ApellidoMatMedico);

            // Agrego registro a la tabla Medico en la base de datos;
            InsertarDatosMedico.executeUpdate();

            // Obtener último ID del Medico para pasarselo como referencia al nuevo paciente.
            LastID = InsertarDatosMedico.getGeneratedKeys();
            if (LastID != null && LastID.next()) 
                UltimoID = LastID.getInt(1);

            // Inserto parámetros de paciente al comando INSERT INTO;
            InsertarDatosPaciente.setInt(1,UltimoID);
            InsertarDatosPaciente.setString(2,ManejadorEventos.NomPac);
            InsertarDatosPaciente.setString(3,ManejadorEventos.ApPatPac);
            InsertarDatosPaciente.setString(4,ManejadorEventos.ApMatPac);
            InsertarDatosPaciente.setString(5,ManejadorEventos.Sexo);
            InsertarDatosPaciente.setString(6,ManejadorEventos.FNacimiento);
            InsertarDatosPaciente.setInt(7,ManejadorEventos.EdadPaciente);
            InsertarDatosPaciente.setString(8,ManejadorEventos.TelefonoFijo);
            InsertarDatosPaciente.setString(9,ManejadorEventos.TelefonoMovil);
            InsertarDatosPaciente.setString(10,ManejadorEventos.EntidadOrigen);
            InsertarDatosPaciente.setString(11,ManejadorEventos.EstadoCivil);
            InsertarDatosPaciente.setInt(12,ManejadorEventos.AniosEstudios);
            InsertarDatosPaciente.setString(13,ManejadorEventos.Leer);
            InsertarDatosPaciente.setString(14,ManejadorEventos.Escribir);
            InsertarDatosPaciente.setString(15,ManejadorEventos.Ocupacion);
            InsertarDatosPaciente.setString(16,ManejadorEventos.Religion);
            InsertarDatosPaciente.setString(17,ManejadorEventos.FEvaluacion);

            // Agrego registro a la tabla Paciente en la base de datos;
            InsertarDatosPaciente.executeUpdate();

            // Inserto parámetros de domicilio al comando INSERT INTO;
            InsertarDomicilio.setInt(1,UltimoID);
            InsertarDomicilio.setString(2,ManejadorEventos.Calle);
            InsertarDomicilio.setInt(3,ManejadorEventos.NumExterior);
            InsertarDomicilio.setInt(4,ManejadorEventos.NumInterior);
            InsertarDomicilio.setInt(5,ManejadorEventos.Zona);
            InsertarDomicilio.setString(6,ManejadorEventos.Del_Mun);
            InsertarDomicilio.setString(7,ManejadorEventos.CP);
            InsertarDomicilio.setInt(8,ManejadorEventos.AniosVivienda);
            InsertarDomicilio.setInt(9,ManejadorEventos.MesesVivienda);

            // Agrego registro a la tabla Domicilio en la base de datos;
            InsertarDomicilio.executeUpdate();

            System.out.println("Un nuevo paciente fue ingresado");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}