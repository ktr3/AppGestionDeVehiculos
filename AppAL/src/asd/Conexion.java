package asd;

import java.sql.*;

import javax.swing.JOptionPane;


public class Conexion {

	
	Connection con;
	
	public void agregar(String query) {
		try {
			
			Statement st = con.createStatement(); 
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Ejecutado con exito");
			
		}catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Fallo al ejecutar");
			
		}
	}
	
	public void agregarSinMensaje(String query) {
		try {
			
			Statement st = con.createStatement(); 
			st.executeUpdate(query);
			
		}catch (Exception e) {
			
		}
	}
	
	public Connection conectar() {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root", "root");
	
		}catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Fallo al conectar");
		}
		return con;
	}


		
}
