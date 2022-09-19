package com.edumaster.co.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edumaster.co.modelo.Capacitacion;

@Repository
public interface ICapacitacion extends CrudRepository<Capacitacion, Integer>{

}
