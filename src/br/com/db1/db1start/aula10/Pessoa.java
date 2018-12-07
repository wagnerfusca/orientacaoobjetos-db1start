package br.com.db1.db1start.aula10;

import java.util.Date;
import java.util.List;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Double peso;
	private List<Endereco> enderecos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
