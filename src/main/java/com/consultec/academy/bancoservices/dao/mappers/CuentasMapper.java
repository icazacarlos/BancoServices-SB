package com.consultec.academy.bancoservices.dao.mappers;

import com.consultec.academy.bancoservices.dao.mappers.interfaces.IMapper;
import com.consultec.academy.bancoservices.models.CuentaAhorro;
import com.consultec.academy.bancoservices.models.CuentaCorriente;
import com.consultec.academy.bancoservices.models.CuentaPlazoFijo;
import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.consultec.academy.bancoservices.models.cons.TipoCuentas.loadEnum;

public class CuentasMapper <T extends Cuenta> implements IMapper<T> {

    @Override
    public ResultSet toResultSet(T element) {
        return null;
    }

    @Override
    public T toModel(ResultSet resultSet) throws SQLException {
        TipoCuentas tipoCuentas = loadEnum(resultSet.getInt("tipoCuenta"));
        Cuenta cuenta = null;
        switch (tipoCuentas) {
            case CA:
                cuenta = (T) new CuentaAhorro(resultSet.getDouble("balance"));
                cuenta.setNumeroCuenta(resultSet.getString("numeroCuenta"));
                return (T) cuenta;
            case CC:
                cuenta = (T) new CuentaCorriente(resultSet.getDouble("balance"));
                cuenta.setNumeroCuenta(resultSet.getString("numeroCuenta"));
                return (T) cuenta;
            case CP:
                cuenta = (T) new CuentaPlazoFijo(resultSet.getDouble("balance"));
                cuenta.setNumeroCuenta(resultSet.getString("numeroCuenta"));
                return (T) cuenta;
        }
        return null;
    }
}
