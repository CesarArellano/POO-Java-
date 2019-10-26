import java.sql.SQLException;

public class PruebaCon
{
	public static void main(String[] args) throws SQLException
	{
		Conectar conx = new Conectar();
		conx.getConnection();
		conx.LeerRegistros();
	}
}