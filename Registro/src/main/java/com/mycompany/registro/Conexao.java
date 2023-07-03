package com.mycompany.registro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://postgres:2L6OyaLq3lQLsOE8s8YQ@containers-us-west-59.railway.app:5793/railway";
        String username = "postgres";
        String password = "2L6OyaLq3lQLsOE8s8YQ";

        Connection conexao = DriverManager.getConnection(url, username, password);
        return conexao;
    }
    
}
