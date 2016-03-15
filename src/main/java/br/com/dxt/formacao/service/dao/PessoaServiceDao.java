package br.com.dxt.formacao.service.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.dxt.formacao.domain.Pessoa;
import br.com.dxt.formacao.domain.PessoaFisica;
import br.com.dxt.formacao.service.PessoaService;

public class PessoaServiceDao implements PessoaService {

	private Connection abreConexao() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			//return DriverManager.getConnection("jdbc:hsqldb:mem:.", "sa",
			return DriverManager.getConnection("jdbc:hsqldb:file/pessoa.db", 
					"sa", "123456");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void createTable() {
		String sql = "CREATE TABLE PESSOA(" + "NOME VARCHAR(255),"
				+ "IDADE INTEGER)";
		Connection con = null;
		PreparedStatement ps = null;

		con = this.abreConexao();
		try {
			ps = con.prepareStatement(sql);
			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
		}

	}

	@Override
	public Pessoa salvarPessoa(Pessoa p) {
		Connection con = null;
		PreparedStatement ps = null;

		con = this.abreConexao();
		try {
			ps = con.prepareStatement("insert into pessoa(nome, idade)"
					+ " values (?, ?)");
			ps.setString(1, p.nome);
			//ps.setInt(2, p.age);
			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
		}
		return p;
	}

	@Override
	public List<Pessoa> buscarTodasPessoas() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT nome, idade FROM pessoa";
				
		con = this.abreConexao();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			List<Pessoa> resultado = new ArrayList<Pessoa>();
			
			while (rs.next()) {
				Pessoa pf = new PessoaFisica();
				pf.nome = rs.getString("nome");
				//p.age = rs.getInt("idade");
				resultado.add(pf);
			}
			return resultado;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
		}
	}

}
