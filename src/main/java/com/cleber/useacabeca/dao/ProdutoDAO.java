package com.cleber.useacabeca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.cleber.useacabeca.modelo.Produto;

public class ProdutoDAO {
	
	Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public ProdutoDAO() {
		// TODO Auto-generated constructor stub
	}

	public void salva(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?,?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.execute();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int id = rs.getInt(1);
                    produto.setId(id);
                }
            }

        }
    }

}

/*
 * PARA CONTAR HISTORIA.
 * 
 * public List lista() throws SQLException { List produtos = new ArrayList();
 * 
 * String sql = "SELECT * FROM PRODUTO";
 * 
 * try (PreparedStatement prStmt = connection.prepareStatement(sql)) {
 * prStmt.execute();
 * 
 * converterQueryEmProdutos(produtos, prStmt); }
 * 
 * return produtos; }
 * 
 * public List busca(Produto produto) throws SQLException {
 * 
 * String sql = "SELECT * FROM PRODUTO WHERE DESCRICAO like ?"; List produtos =
 * new ArrayList();
 * 
 * try (PreparedStatement prdStmt = connection.prepareStatement(sql)) {
 * prdStmt.setString(1, produto.getDescricao()); prdStmt.execute();
 * 
 * converterQueryEmProdutos(produtos, prdStmt); }
 * 
 * return produtos; }
 * 
 * private void converterQueryEmProdutos(List produtos, PreparedStatement
 * prdStmt) throws SQLException {
 * 
 * try (ResultSet rs = prdStmt.getResultSet()) { while (rs.next()) { int id =
 * rs.getInt(1); String nomeProduto = rs.getString("nome"); String
 * descricaoProduto = rs.getString("descricao"); Produto produto = new
 * Produto(nomeProduto, descricaoProduto); produto.setId(id);
 * produtos.add(produto); } } } }
 */