package com.edumaster.co.modelo;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usuario")
public class Usuario {
	@Id
	private BigInteger Cedula;
	@Basic
	private String Nombre;
	private String Apellidos;
	private Integer Id_genero;
	private BigInteger Telefono;
	private BigInteger Celular;
	private String Correo;
	private Date Fecha_creacion;
	private Date Fecha_retiro;
	private Integer Id_cargo;
	private Integer Id_rol;
	private String Contraseña;
	private String Activo;
	
	public Usuario() {
	
	}

	public Usuario(BigInteger cedula, String nombre, String apellidos, Integer id_genero, BigInteger telefono,
			BigInteger celular, String correo, Date fecha_creacion, Date fecha_retiro, Integer id_cargo, Integer id_rol,
			String contraseña, String activo) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Apellidos = apellidos;
		Id_genero = id_genero;
		Telefono = telefono;
		Celular = celular;
		Correo = correo;
		Fecha_creacion = fecha_creacion;
		Fecha_retiro = fecha_retiro;
		Id_cargo = id_cargo;
		Id_rol = id_rol;
		Contraseña = contraseña;
		Activo = activo;
	}

	public BigInteger getCedula() {
		return Cedula;
	}

	public void setCedula(BigInteger cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public Integer getId_genero() {
		return Id_genero;
	}

	public void setId_genero(Integer id_genero) {
		Id_genero = id_genero;
	}

	public BigInteger getTelefono() {
		return Telefono;
	}

	public void setTelefono(BigInteger telefono) {
		Telefono = telefono;
	}

	public BigInteger getCelular() {
		return Celular;
	}

	public void setCelular(BigInteger celular) {
		Celular = celular;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public Date getFecha_creacion() {
		return Fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		Fecha_creacion = fecha_creacion;
	}

	public Date getFecha_retiro() {
		return Fecha_retiro;
	}

	public void setFecha_retiro(Date fecha_retiro) {
		Fecha_retiro = fecha_retiro;
	}

	public Integer getId_cargo() {
		return Id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		Id_cargo = id_cargo;
	}

	public Integer getId_rol() {
		return Id_rol;
	}

	public void setId_rol(Integer id_rol) {
		Id_rol = id_rol;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getActivo() {
		return Activo;
	}

	public void setActivo(String activo) {
		Activo = activo;
	}
	
	
	
}
