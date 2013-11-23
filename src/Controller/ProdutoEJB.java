/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Util.Conexao;
import Util.ConfigProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Suporte4
 */
public class ProdutoEJB {
    Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    Conexao conexao= new Conexao();
    Connection con=conexao.getCon();
    Statement st= conexao.getSt();
    ResultSet rs= conexao.getRs();
    ConfigProperties prop= new ConfigProperties();
    
    public void salva(String descricao, String referencia) {
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(prop.ler("findQtdeProduto", "queries.properties"));
            int qtdeProdutos = Integer.parseInt(rs.getString("qtde") + 1);
            System.out.println(qtdeProdutos + descricao + referencia);
            PreparedStatement ps = con.prepareStatement("INSERT INTO PRODUTO (CODPRODUTO, DESCRICAO, REFERENCIA,"
                    + "DISPONIVEL) VALUES " + "('" + qtdeProdutos + "', '" + descricao + "','"
                    + referencia + ",'S');");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("erro no sql");
        } catch (NullPointerException e) {
            System.out.println("Erro ao salvar produto 'null'");
        }
    }
    
    
}
