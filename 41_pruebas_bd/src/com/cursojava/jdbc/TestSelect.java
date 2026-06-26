package com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {

	public static void main(String[] args) {
		String url="jdbc:h2:file:C:/temp/agenda;AUTO_SERVER=TRUE";
		String usuario="sa";
		String password="";
		String sql="select * from contactos";
		try(Connection con=DriverManager.getConnection(url, usuario, password);
				Statement st=con.createStatement()){
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
