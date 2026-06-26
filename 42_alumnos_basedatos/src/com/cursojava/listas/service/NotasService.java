package com.cursojava.listas.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cursojava.listas.model.Alumno;

public class NotasService {
	final String URL="jdbc:h2:file:C:/temp/escuela;AUTO_SERVER=TRUE";
	final String USUARIO="sa";
	final String PASS="";
	public boolean guardarAlumno(Alumno alumno)
	{
		if(existe(alumno.getNombre(), alumno.getCurso())) {
			return true;
		}
		String sql = "INSERT INTO alumnos VALUES(?, ?, ?, ?)";		
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				PreparedStatement st = con.prepareStatement(sql)) {
			st.setInt(1, alumno.getId());
			st.setString(2, alumno.getNombre());
			st.setString(3, alumno.getCurso());
			st.setDouble(4, alumno.getNota());
			int res = st.executeUpdate();		
			
			return true;
		} catch(SQLException ex) {
			//ex.printStackTrace();
			return false;
		}
	}
	
	public List<Alumno> alumnosPorCurso(String curso)
	{
		String sql = "SELECT * FROM alumnos WHERE curso = ?";
		List<Alumno> lista = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				PreparedStatement st = con.prepareStatement(sql)) {
			st.setString(1, curso);
			ResultSet rs = st.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int nota = rs.getInt("nota");
				Alumno a = new Alumno(id, nombre, curso, nota);
				lista.add(a);
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return lista;
	}
	
	public double notaMedia()
	{
		String sql = "SELECT AVG(nota) FROM alumnos";
		double nota = 0.0;
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				Statement st = con.createStatement()) {
			
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next())
			{
				nota = rs.getDouble(1);
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return nota;
	}
	
	public Optional<Alumno> getAlumnoMayorNota()
	{
		String sql = "SELECT * FROM alumnos ORDER BY nota DESC LIMIT 1";
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				Statement st = con.createStatement()) {
			
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String curso = rs.getString("curso");
				int nota = rs.getInt("nota");
				return Optional.of(new Alumno(id, nombre, curso, nota));
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return Optional.empty();
	}
	
	public int eliminarAlumno(int id)
	{
		String sql = "DELETE FROM alumnos WHERE id = ?";
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				PreparedStatement st = con.prepareStatement(sql)) {
			st.setInt(1, id);
			return st.executeUpdate();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	
	public boolean existe(String nombre, String curso)
	{
		String sql = "SELECT * FROM alumnos WHERE nombre = ? AND curso = ?";
		
		try(Connection con = DriverManager.getConnection(URL, USUARIO, PASS);
				PreparedStatement st = con.prepareStatement(sql)) {
			st.setString(1, nombre);
			st.setString(2, curso);
			
			return st.executeUpdate() > 0;
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
		
		
	}
}
