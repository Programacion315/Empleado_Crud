package com.registros.empleados.controllers;

import com.registros.empleados.models.Empleado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpleadoController {

    @RequestMapping(value = "empleado/{id}")
    public Empleado getEmpleado(@PathVariable Long id){
        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
    }

    @RequestMapping(value = "empleados")
    public List<Empleado> getEmpleados(){

        List<Empleado> empleados = new ArrayList<Empleado>();

        Empleado empleado = new Empleado();
        empleado.setId(1L);
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        Empleado empleado2 = new Empleado();
        empleado2.setId(2L);
        empleado2.setNombre("Maria");
        empleado2.setApellido("Herran");
        empleado2.setCorreo("maria@hotmail");
        empleado2.setTelefono("8646454");

        Empleado empleado3 = new Empleado();
        empleado3.setId(3L);
        empleado3.setNombre("Esmeralda");
        empleado3.setApellido("Herran");
        empleado3.setCorreo("esme@hotmail");
        empleado3.setTelefono("645645");

        empleados.add(empleado);
        empleados.add(empleado2);
        empleados.add(empleado3);

        return empleados;
    }

    @RequestMapping(value = "empleado1")
    public Empleado editarEmpleado(){

        Empleado empleado = new Empleado();
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
    }

    @RequestMapping(value = "empleado2")
    public Empleado eliminar(){

        Empleado empleado = new Empleado();
        empleado.setNombre("Jorge");
        empleado.setApellido("Huergo");
        empleado.setCorreo("Jorge@hot");
        empleado.setTelefono("87425244");

        return empleado;
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
