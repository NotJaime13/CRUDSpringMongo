package com.notjaime13.empleados.backend.services;

import java.util.List;

import com.notjaime13.empleados.backend.model.Empleado;

public interface IEmpleadoService {
    
    List<Empleado> buscar();
    Empleado buscarPorId(String id);
    Empleado guardar(Empleado empleado);
    void eliminar(String id);
      
}
