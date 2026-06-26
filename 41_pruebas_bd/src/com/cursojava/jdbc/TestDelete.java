package com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDelete {

	public static void main(String[] args) {
		// Solicita el email del contacto y lo elimina
		String url="jdbc:h2:file:C:/temp/agenda;AUTO_SERVER=TRUE";
		String usuario="sa";
		String password="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce el mail: ");
		String email=scan.nextLine();
		//String sql="delete from contactos where email='"+email+"'";
		String sql="delete from contactos where email=?";
		try(Connection con=DriverManager.getConnection(url, usuario, password);
				PreparedStatement st=con.prepareStatement(sql)){
			st.setString(1, email);
			int res=st.executeUpdate();
			System.out.println("Se han eliminado "+res+" filas");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
