package footballPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conn;
	private static String server="jdbc:*";
	private static String user="izquierdo";
	private static String pass="izquierdo";
	
	public static boolean AbrirConexion(){
		try {
			conn = DriverManager.getConnection(server, user, pass);
			System.out.println("---Conectado a la base de datos.---");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public static void CerrarConexion(){
		try {
			if (conn!=null) {
				conn.close();
				System.out.println("---Desconectado de la base de datos.---");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection obtenConexion() {
		return conn;
	}
}
