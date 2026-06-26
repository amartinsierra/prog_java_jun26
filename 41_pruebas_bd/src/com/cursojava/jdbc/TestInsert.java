package com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) {
		String url="jdbc:h2:file:C:/temp/agenda;AUTO_SERVER=TRUE";
		String usuario="sa";
		String password="";
		String sql="insert into contactos values(5,'contacto5','c5@gmail.com',50)";
		try(Connection con=DriverManager.getConnection(url, usuario, password);
				Statement st=con.createStatement()){
			st.execute(sql);
			System.out.println("Contacto añadido!!");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
