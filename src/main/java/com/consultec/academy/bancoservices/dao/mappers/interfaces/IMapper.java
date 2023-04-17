package com.consultec.academy.bancoservices.dao.mappers.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IMapper <T>{

    ResultSet toResultSet(T element);

    T toModel(ResultSet resultSet) throws SQLException;
}
