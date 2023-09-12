package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.contato.Contato;

public class ContatoDAO {

public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar um conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//executa uma query
			pstm = conn.prepareStatement(sql);
			// adiciona os valores da query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			//executa a query
			pstm.execute();
			
			System.out.println("boa fi deu certo");
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			//fecha conexão
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

public List<Contato> getContatos() {
	
	String sql = "SELECT * FROM contatos";
	
	List<Contato> contatos = new ArrayList<Contato>();
	
	Connection conn = null;
	PreparedStatement pstm = null;
	//Classe que recupera os dados do banco
	ResultSet rset = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		rset = pstm.executeQuery();
		
		while (rset.next()) {
			
			Contato contato = new Contato();
			
			//Recuperar o id
			contato.setId(rset.getInt("id"));
			//Recuperar o nome 
			contato.setNome(rset.getString("nome"));
			//Recuperar a idade
			contato.setIdade(rset.getInt("idade"));
			//recuperar data de cadastro
			contato.setDataCadastro(rset.getDate("datacadastro"));
			
			contatos.add(contato);
			}
		}catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			return contatos;
}

public void update (Contato contato) {
	String sql = "UPDATE contatos SET nome = ?, idade = ?, datacadastro = ?" + "WHERE id = ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		//criar conexão com banco 
		conn = ConnectionFactory.createConnectionToMySQL();
		
		//executar a query
		pstm = conn.prepareStatement(sql);
		
		//adicionar valores para atualizar
		pstm.setString(1, contato.getNome());
		
		pstm.setInt(2, contato.getIdade());
		
		pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
				
		pstm.setInt(4, contato.getId());
		
		pstm.execute();
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public void deleteById(int id) {
	String sql = "DELETE FROM contatos WHERE id = ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, id);
		
		pstm.execute();
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}