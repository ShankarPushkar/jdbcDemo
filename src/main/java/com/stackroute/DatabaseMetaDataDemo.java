package com.stackroute;

import java.sql.*;

public class DatabaseMetaDataDemo {
    public void dBMetaData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
            DatabaseMetaData databaseMetaData= connection.getMetaData();
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getMaxColumnsInIndex());
            System.out.println(databaseMetaData.getConnection());
            System.out.println(databaseMetaData.getDriverVersion());
        } catch (
                SQLException E) {
            E.printStackTrace();
        }
    }
}
