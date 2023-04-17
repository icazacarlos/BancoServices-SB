package com.consultec.academy.bancoservices.dao;

import com.consultec.academy.bancoservices.bootstrap.DBConnection;
import com.consultec.academy.bancoservices.bootstrap.InitDatabase;
import com.consultec.academy.bancoservices.dao.interfaces.ICuentasDAO;
import com.consultec.academy.bancoservices.dao.mappers.CuentasMapper;
import com.consultec.academy.bancoservices.models.CuentaAhorro;
import com.consultec.academy.bancoservices.models.CuentaCorriente;
import com.consultec.academy.bancoservices.models.CuentaPlazoFijo;
import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import com.consultec.academy.bancoservices.models.cons.TipoCuentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.consultec.academy.bancoservices.models.cons.TipoCuentas.loadEnum;

public class CuentasDAO<T extends Cuenta> implements ICuentasDAO<T> {

    private static Connection connection;
    private static CuentasMapper mapper = new CuentasMapper();

    public CuentasDAO(){
        this.connection = DBConnection.getConnection();
        this.mapper = new CuentasMapper();
    }
    @Override
    public List<T> consultarTodo(){
        List<Cuenta> cuentas = new ArrayList<>();
        String selectAllQuery = "SELECT * FROM cuentas";

        try(PreparedStatement preparedStatement = connection.prepareStatement(selectAllQuery)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Cuenta cuenta = (Cuenta) mapper.toModel(resultSet);
                cuentas.add(cuenta);
            }
            return (List<T>) cuentas;
        }catch (SQLException e ){
            return (List<T>) (cuentas = new ArrayList<>());
        }
    }

    @Override
    public boolean agregarCuenta(T cuenta) {
        Connection connection = null;
        try{
            connection = getConnection();
            //String numeroCuenta, TipoCuentas tipoCuenta, double balance
            //str_cuenta IDENTITY NOT NULL PRIMARY KEY, str_tipoCuenta varchar(3) NOT NULL, flt_balance float
            String insertUserQuery = "INSERT INTO cuentas (numeroCuenta,tipoCuenta,balance) VALUES (?,?,?)";

            try(PreparedStatement preparedStatement = connection.prepareStatement(insertUserQuery)){
                preparedStatement.setString(1,cuenta.getNumeroCuenta());
                preparedStatement.setInt(2,cuenta.getTipoCuenta());
                preparedStatement.setDouble(3,cuenta.getBalance());

                preparedStatement.executeUpdate();
                return true;
            }catch (SQLException e ){
                return false;
            }
        }catch (ClassNotFoundException e){
            return false;
        }
    }

    @Override
    public T buscarCuentaPorID(T cuenta) {
        return null;
    }

    @Override
    public boolean actualizarBalance(T cuenta) {
        return false;
    }


    private static Connection getConnection() throws ClassNotFoundException {
        InitDatabase.init();
        return DBConnection.getConnection();
    }

    public <T> Object instaciarCuenta(int tipoCuenta, double balance){
        TipoCuentas tipoCuentas = loadEnum(tipoCuenta);
        switch (tipoCuentas) {
            case CA:
                return (T) new CuentaAhorro(balance);
            case CC:
                return (T) new CuentaCorriente(balance);
            case CP:
                return (T) new CuentaPlazoFijo(balance);
        }
        return null;
    }
}
