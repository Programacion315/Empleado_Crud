package com.registros.empleados.controllers;

import com.registros.empleados.dao.EmpleadoDao;
import com.registros.empleados.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunMisc;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired //
    private EmpleadoDao empleadoDao;

    @RequestMapping(value = "api/empleados/{id}", method = RequestMethod.GET) //Metodo por defecto
    public Empleado getEmpleado(@PathVariable Long id){
        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
    }

    @RequestMapping(value = "api/empleados")
    public List<Empleado> getEmpleados(){

        return empleadoDao.getEmpleados();
    }

    @RequestMapping(value = "api/empleado1")
    public Empleado editarEmpleado(){

        Empleado empleado = new Empleado();
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
    }

    @RequestMapping(value = "api/empleados/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){

        empleadoDao.eliminar(id);
    }

    @RequestMapping(value = "empleado3")
    public Empleado buscar(){

        Empleado empleado = new Empleado();
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
    }
}
