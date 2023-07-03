/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        try {
            Connection connection = conexao.getConnection();
            System.out.println("Conexão estabelecida com sucesso!");
            connection.close(); 
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer a conexão: " + e.getMessage());
        }
    }
}
