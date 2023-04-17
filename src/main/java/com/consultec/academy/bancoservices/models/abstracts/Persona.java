package com.consultec.academy.bancoservices.models.abstracts;

import java.time.LocalDate;

public class Persona {

    private final int idDocumento;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    protected Persona(int idDocumento, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.idDocumento = idDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
