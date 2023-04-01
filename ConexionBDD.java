import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionBDD {

	Connection miConexion = null;	
	public Connection EstablecerConexion() {

		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Vanilla Sweet","postgres","Lia1607");			
			Statement miStatment = miConexion.createStatement();
			
			JOptionPane.showInternalMessageDialog(null, "Se conecto Correctamente");
			
			
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error:"+e.toString() );
		
		}
		
		return miConexion;
		
		
	}
			
			
	
	
}
