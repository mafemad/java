package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
}
