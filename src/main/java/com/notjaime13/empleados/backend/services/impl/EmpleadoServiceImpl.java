package com.notjaime13.empleados.backend.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notjaime13.empleados.backend.dao.IEmpleadoDao;
import com.notjaime13.empleados.backend.model.Empleado;
import com.notjaime13.empleados.backend.services.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private IEmpleadoDao empleadoDao;

    @Override
    public List<Empleado> buscar() {
        return empleadoDao.findAll();
    }

    @Override
    public Empleado buscarPorId(String id) {
        
        Optional<Empleado> emple = empleadoDao.findById(id);

        if(emple.isPresent()){
            return emple.get();
        }
        return null;
        
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return empleadoDao.save(empleado);
    }

    @Override
    public void eliminar(String id) {
        empleadoDao.deleteById(id);
    }
    
}
