import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ingredientes {

	int ID;
	String Nombres;
	int Precio;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}

	
	
	public void MostarIngredientes(JTable paramTablaTotalIngredientes) {
		
		ConexionBDD objetoConexion = new ConexionBDD();
		
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		String sql = "";
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio");
		
		paramTablaTotalIngredientes.setModel(modelo);
		
		
		sql = "Select * from Ingredientes;";
		
		String [] datos = new String [3];
		Statement miStatement;
		
		try {
			
			miStatement = objetoConexion.EstablecerConexion().createStatement();
			
			
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
			 
				
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				
				modelo.addRow(datos);
				
				
				
				
			}
			
			paramTablaTotalIngredientes.setModel(modelo);
			
			
			
			
		} catch (Exception e) {

			JOptionPane.showInternalMessageDialog(null, "Error: "+e.toString());
			
			
			
		
		}
		
		
		
	}
	
	
	
}
