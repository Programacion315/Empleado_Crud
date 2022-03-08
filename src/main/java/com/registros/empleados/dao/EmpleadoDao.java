package com.registros.empleados.dao;

import com.registros.empleados.models.Empleado;

import java.util.List;

public interface EmpleadoDao {

    List<Empleado> getEmpleados();

    void eliminar(Long id);

    void registrar(Empleado empleado);
}
