package com.consultec.academy.bancoservices.dao.interfaces;

import com.consultec.academy.bancoservices.models.abstracts.Cuenta;

import java.util.List;

public interface ICuentasDAO<T extends Cuenta>{
    public  List<T> consultarTodo();
    public boolean agregarCuenta(T cuenta);
    public T buscarCuentaPorID(T cuenta);
    public boolean actualizarBalance(T cuenta);
}
