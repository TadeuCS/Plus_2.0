/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Conexao {
 
    private Connection con;
    private Statement st;
    private ResultSet rs;
    Util.Properties prop= new Properties();

    public Conexao() {
    }
    

    public void conecta() throws IOException, SQLException {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://" + prop.lerPropriedades("ip") + ":3050/" + prop.lerPropriedades("diretorio"),
                    prop.lerPropriedades("user"),
                    prop.lerPropriedades("senha"));
            st = con.createStatement();
        } catch (ClassNotFoundException ex)//caso o driver não seja localizado  
        {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!");
        } catch (SQLException ex)//caso a conexão não possa se realizada  
        {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados");
        }
    }

    public void desconecta()throws Exception{
        con.close();
    }
}

