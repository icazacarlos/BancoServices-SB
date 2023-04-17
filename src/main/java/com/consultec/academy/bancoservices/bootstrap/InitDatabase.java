package com.consultec.academy.bancoservices.bootstrap;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabase {

    private InitDatabase(){}

    public static void init() throws ClassNotFoundException {

        //Creamos la carga del Driver
        //Class.forName("org.h2.Driver");

        //Habilitamos y creamos una conexion hacia la base de datos
        Connection connection = DBConnection.getConnection();

        /*try(Statement statement = connection.createStatement()) {
            statement.execute(getCustomersTruncate());
        }catch (SQLException e){
            e.printStackTrace();
        }*/

        try(Statement statement = connection.createStatement()) {
            statement.execute(getCustomersCreateQuery());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    /*private static String getCustomersTruncate(){
        return "DROP TABLE IF EXISTS cuentas;";
    }*/
    private static String getCustomersCreateQuery(){
        return "CREATE TABLE IF NOT EXISTS cuentas (id_account IDENTITY NOT NULL PRIMARY KEY, numeroCuenta varchar(255) NOT NULL, tipoCuenta INTEGER NOT NULL, balance DOUBLE PRECISION NOT NULL);";
    }
}
