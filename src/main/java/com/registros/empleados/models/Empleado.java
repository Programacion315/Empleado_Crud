package com.registros.empleados.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
@ToString @EqualsAndHashCode
public class Empleado {

    @Getter @Setter @Column(name = "id")
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name = "email")
    private String correo;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Getter @Setter @Column(name = "password")
    private String password;


}
