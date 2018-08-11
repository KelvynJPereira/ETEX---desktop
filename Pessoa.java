package br.com.turyng.etex.pessoa;

import br.com.turyng.etex.face.Interface;

public class Pessoa implements Interface{
	
	private int id, cpf, rg;
	private String nome, sobrenome, nascimento, fone1, fone2, email, homlogacao, demisao, funcao;
	
	
	
	
	public void cadastrar() {
		
	}
	
	
	public void cadastrar(String user_nome, String user_sobrenome) {
		this.nome = user_nome;
		this.sobrenome = user_sobrenome;

	}
	
	public void editar() {
		
		
	}
	public void consultar() {
	
		
	}
	public void excluir() {
	
		
	}

}
