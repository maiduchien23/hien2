package jdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static Connection getMySQLConnection()throws SQLException,ClassNotFoundException{
        String hostName = "localhost";
        String databaseName = "productmanagement";
        String userName = "root";
        String password = "";
        return getMySQLConnection();
    }
    public static Connection getMySQLConnection(String hostName, String databaseName,
                                                String userName, String password) throws SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://"+hostName;
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }
    public static void main(String[] args) throws  SQLException,ClassNotFoundException{
        Connection conn = MySQLConnection.getMySQLConnection();
        if (conn!=null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
