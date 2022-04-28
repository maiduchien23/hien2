package jdcdemo.mvc.model;

import jdcdemo.mvc.entity.Users;

import java.sql.SQLException;

public interface LoginDAO {
    String checkLoginStatement(Users users) throws SQLException, ClassNotFoundException;

    String checkLoginPreparedStatement(Users users) throws SQLException, ClassNotFoundException;
}
