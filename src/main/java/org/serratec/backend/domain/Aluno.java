package org.serratec.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Tabela_alunos")
public class Aluno {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Long matricula;
	
	private String nome;
	
	private String telefone;
	
	public Aluno() {
	}
	
	public Aluno(Long matricula, String nome, String telefone) {
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
