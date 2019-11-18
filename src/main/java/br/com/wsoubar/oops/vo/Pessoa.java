package br.com.wsoubar.oops.vo;

public class Pessoa {
	
	/**
	 * Construtor com todos os campos
	 * @param nome Nome da Pessoa
	 * @param sobrenome Sobrenome da Pessoa
	 * @param idade Idade da Pessoa
	 */
	public Pessoa(String nome, String sobrenome, Integer idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	String nome;
	String sobrenome;
	Integer idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

}
