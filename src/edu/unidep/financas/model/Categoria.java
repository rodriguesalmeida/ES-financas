package edu.unidep.financas.model;

import javax.persistence.Entity;

@Entity
public class Categoria extends BaseEntityImpl {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
