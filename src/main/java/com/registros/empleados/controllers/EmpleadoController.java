package com.registros.empleados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "Prueba";
    }
}
