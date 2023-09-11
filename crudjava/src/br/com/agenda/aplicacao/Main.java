package br.com.agenda.aplicacao;

import java.util.Date;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.contato.Contato;

public class Main {

	public static void main(String[] args) {
		
			
		ContatoDAO contatoDao = new ContatoDAO();
			
		Contato contato = new Contato();
		contato.setNome("gersin2");
		contato.setIdade(15);
		contato.setDataCadastro(new Date());
			
		contatoDao.save(contato);
			
			
		
	}

}
