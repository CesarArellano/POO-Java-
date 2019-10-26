import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

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
	static final String url = "jdbc:mysql://localhost/test";

	public Conectar()
	{
		conn = null;
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			//Se avisa de la conexión exitosa
			JOptionPane.showMessageDialog(null,"Se conecto","Mensaje",JOptionPane.INFORMATION_MESSAGE);
			if(conn != null)
				System.out.println("Se conectó");
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
	//Método a llamar en main para hacer la conexión;
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
	public void LeerRegistros() throws SQLException
	{
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery ("select * from Medico");
		while(rs.next())
		{
			//Número de campo de la tabla;
			System.out.println(rs.getInt("id")+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+"");
		}
	}
}