package com.mycompany.registro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection getConnection() throws SQLException {
        String senha = JOptionPane.showInputDialog(
                        null,
                        "A SUA SENHA DO POSTGRES:",
                        "SENHA",
                        1 //ICONE
                );
        
        String url = "jdbc:postgresql://localhost:5432/registro";
        String username = "postgres";
        String password = senha;

        Connection conexao = DriverManager.getConnection(url, username, password);
        return conexao;
    }
    
}
