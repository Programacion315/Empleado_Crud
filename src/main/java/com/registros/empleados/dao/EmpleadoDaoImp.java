package com.registros.empleados.dao;

import com.registros.empleados.models.Empleado;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Repository //Conexion BD, acceder repositorio de las based de datos
@Transactional //Armas las consultas
public class EmpleadoDaoImp implements  EmpleadoDao{

    @PersistenceContext
    private EntityManager entityManager; //Nos ayudara a la conexion base de datos

    @Override
    @Transactional
    public List<Empleado> getEmpleados() {

        String query = "FROM Empleado";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {

        Empleado empleado = entityManager.find(Empleado.class,id);
        entityManager.remove(empleado);
    }

    @Override
    public void registrar(Empleado empleado) {
        entityManager.merge(empleado);
    }
}
