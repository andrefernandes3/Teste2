package model;

import java.util.List;

public class Fila {
	private int id;
	private String nome;
	private List <Chamado> chamados;
	
	public Fila(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}
	
	public Fila (){}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public int getId() {
		return id;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
