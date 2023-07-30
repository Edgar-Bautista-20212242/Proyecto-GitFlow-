package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
	 private static final String  Controlador = "com.mysql.jdbc.Driver";
	 private static final String  Url = "jdbc:mysql://localhost:3306/facturacion";
	 private static final String  usuario = "root";
	 private static final String  contra = "2004";
	 
	public Connection  conexion () 
	{

		Connection Conexion = null; 
		
		try {
			
			Class.forName(Controlador);
			Conexion= DriverManager.getConnection(Url,usuario,contra);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error al cargar controlador");
		}
		catch (SQLException e) 
		{

		}
		
		return Conexion; 
	}
}

