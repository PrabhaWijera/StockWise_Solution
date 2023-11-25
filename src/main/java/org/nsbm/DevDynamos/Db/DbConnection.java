package org.nsbm.DevDynamos.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static DbConnection dbConnection;

    private Connection connection;

    private DbConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://locahost:3306/StockeWiseSolutions?createDatabaseIfNotExist=true","root","1234");
    }
    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        return dbConnection==null?new DbConnection():dbConnection;
    }

    public Connection connection(){
        return connection;
    }
}
