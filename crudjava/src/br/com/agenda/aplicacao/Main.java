package br.com.agenda.aplicacao;

import java.util.Date;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.contato.Contato;

public class Main {

	public static void main(String[] args) {
		
			
		ContatoDAO contatoDao = new ContatoDAO();
		
		//criacção de usuario
		
		Contato contato = new Contato();
		contato.setNome("gersin4");
		contato.setIdade(15);
		contato.setDataCadastro(new Date());
			
		contatoDao.save(contato);
			
		//visualização de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
			System.out.println("idade: " + c.getIdade());
			System.out.println("data: " + c.getDataCadastro());
			System.out.println("-----------------------------");
		}
		
		//atualizar dados 
		Contato c1 = new Contato();
		c1.setNome("joazin da massa");
		c1.setIdade(23);
		c1.setDataCadastro(new Date());
		c1.setId(1);//numero do banco de dados
		
		contatoDao.update(c1);
		
		//deletar contato pelo id
		contatoDao.deleteById(1);
		
	}

}
