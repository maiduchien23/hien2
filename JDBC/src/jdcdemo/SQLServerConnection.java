package jdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {

    public static Connection getSQLServerConnection() throws SQLException,ClassNotFoundException{
        String hostName = "localhost";
        String serverName = "LAPTOP-21F5N0OT\\SQLEXPRESS";
        String database = "Dbtest";
        String userName = "sa";
        String password = "sa";
        Connection conn = getSQLServerConnection(hostName,serverName,database,userName,password);

        return conn;

    }
    public static Connection getSQLServerConnection(String hostName,String serverName,
                                                    String database,String userName,
                                                    String password )
        throws SQLException, ClassNotFoundException{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String connectionString = "jdbc:sqlserver://" +hostName + ":1433" +
                ";instance=" +serverName +";databaseName=" + database;

        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = getSQLServerConnection();
        if (connection!=null){
            System.out.println("Ket noi db thanh cong");
        }else {
            System.out.println("Kiem tra lai ket noi database");
        }
    }
}
