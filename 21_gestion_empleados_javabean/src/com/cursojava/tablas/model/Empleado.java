package com.cursojava.tablas.model;

public class Empleado {
	private int codigo;
	private String nombre;
	private double salario;
	private String departamento;
	public Empleado(int codigo, String nombre, double salario, String departamento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", salario=" + salario + ", departamento="
				+ departamento + "]";
	}
	
	
}
