package com.stackroute;

import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcBasicDemo jdbc=new JdbcBasicDemo();
        jdbc.displayUser();
//        jdbc.getUserByName("pushkar");
        DatabaseMetaDataDemo databaseMetaDataDemo=new DatabaseMetaDataDemo();
        databaseMetaDataDemo.dBMetaData();
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultMetaData();
    }
}
