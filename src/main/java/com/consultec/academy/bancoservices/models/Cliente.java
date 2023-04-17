package com.consultec.academy.bancoservices.models;

import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.abstracts.Persona;

import java.time.LocalDate;
import java.util.List;

public class Cliente extends Persona {

    List<Cuenta> listCuenta;

    public Cliente(int idDocumento, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(idDocumento, nombre, apellido, fechaNacimiento);
    }

    public List<Cuenta> getListCuenta() {
        return listCuenta;
    }

    public void setListCuenta(List<Cuenta> listCuenta) {
        this.listCuenta = listCuenta;
    }
}
