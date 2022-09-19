package com.edumaster.co.interfaceService;

import java.util.List;
import java.util.Optional;

import com.edumaster.co.modelo.Capacitacion;

public interface ICapacitacionService {
	public List<Capacitacion>listar();
	public Optional<Capacitacion>listarId(int id);
	public int save(Capacitacion c);
	public void delete(int id);
}
