package com.notjaime13.empleados.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.notjaime13.empleados.backend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String>{
    
}
