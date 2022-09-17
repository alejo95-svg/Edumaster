package com.EduMaster.co.Modelo;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	//si es autoincrementable usar lo siguiente
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	@Basic
	private String nombre;
	private String apellidos;
	private Integer idGenero;
	private Integer telefono;
	private Integer celular;
	private String correo;
	private String fechaCreacion;
	private String fechaRetiro;
	private Integer idCargo;
	private Integer idRol;
	private String contraseña;
	private String activo;
	
	public Usuario() {
	
	}

	public Usuario(Integer cedula, String nombre, String apellidos, Integer idGenero, Integer telefono, Integer celular,
			String correo, String fechaCreacion, String fechaRetiro, Integer idCargo, Integer idRol, String contraseña,
			String activo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idGenero = idGenero;
		this.telefono = telefono;
		this.celular = celular;
		this.correo = correo;
		this.fechaCreacion = fechaCreacion;
		this.fechaRetiro = fechaRetiro;
		this.idCargo = idCargo;
		this.idRol = idRol;
		this.contraseña = contraseña;
		this.activo = activo;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(String fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	
}
