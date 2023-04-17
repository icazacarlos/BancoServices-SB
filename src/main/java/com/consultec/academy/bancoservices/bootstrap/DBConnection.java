package com.consultec.academy.bancoservices.bootstrap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DBConnection {

    // NOTE: You should NEVER store your credentials in your jar. Use application properties!
    //private final String URL = "jdbc:h2:~/test/FILE_LOCK=NO";
    private final String URL = "jdbc:h2:mem:";
    private final String USER = "sa";
    private final String PASS = "";

    private static DBConnection instance;
    private Connection connection;

    private DBConnection(){
        try {
            connection = DriverManager.getConnection(URL,USER,PASS);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        if(Objects.isNull(instance)){
            instance = new DBConnection();
        }
        return instance.connection;
    }

}
