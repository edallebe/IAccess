package com.example.iaccess;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionClass {
    protected static String database = "horario";
    protected static String ip = "127.0.0.1";
    protected static String port = "3306";
    protected static String user = "root";
    protected static String password = "095707";

    Connection conectar = null;

    public Connection conetor(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //String a="jdbc:mysql://"+ip+ ":" +port +"/" + database;
            conectar= DriverManager.getConnection("jdbc:mysql://10.0.2.2:3306/"+database, user, password);
            System.out.println("Conectado");
        }catch (Exception e){
            Log.e("error", Objects.requireNonNull(e.getMessage()));
            System.out.println("Error");
        }
        return conectar;
    }
}
