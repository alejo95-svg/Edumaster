package com.edumaster.co.modelo;

import java.math.BigInteger;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "capacitacion")
public class Capacitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String Descripcion;
	private Time Duracion;
	private Integer Id_tipo;
	private BigInteger Id_encargado;
	private Integer Id_tipo_estudio;
	
	
	public Capacitacion() {
		
	}


	public Capacitacion(Integer iD, String descripcion, Time duracion, Integer id_tipo, BigInteger id_encargado,
			Integer id_tipo_estudio) {
		super();
		ID = iD;
		Descripcion = descripcion;
		Duracion = duracion;
		Id_tipo = id_tipo;
		Id_encargado = id_encargado;
		Id_tipo_estudio = id_tipo_estudio;
	}


	public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public Time getDuracion() {
		return Duracion;
	}


	public void setDuracion(Time duracion) {
		Duracion = duracion;
	}


	public Integer getId_tipo() {
		return Id_tipo;
	}


	public void setId_tipo(Integer id_tipo) {
		Id_tipo = id_tipo;
	}


	public BigInteger getId_encargado() {
		return Id_encargado;
	}


	public void setId_encargado(BigInteger id_encargado) {
		Id_encargado = id_encargado;
	}


	public Integer getId_tipo_estudio() {
		return Id_tipo_estudio;
	}


	public void setId_tipo_estudio(Integer id_tipo_estudio) {
		Id_tipo_estudio = id_tipo_estudio;
	}

		
}
