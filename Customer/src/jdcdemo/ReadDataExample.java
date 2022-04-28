package jdcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Connection connection = AppConnecionExample.getConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");

        if (resultSet!=null){
            System.out.println("Doc du lieu tu bang employee thanh cong");
        }
    }
}
