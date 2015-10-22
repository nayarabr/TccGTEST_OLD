package com.gtest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "questao")
public class Questao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Tema tema;
	private int dificuldade;
	private String enunciado;
//	private StatusQuestao status;

	private List<Alternativa> alternativas  = new ArrayList<>();
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@NotNull
	@OneToOne
	@JoinColumn(name = "tema_id", nullable = false)
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	@NotNull
	@Column(nullable = false)
	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	@NotNull
	@Column(nullable = false, columnDefinition = "text")
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

//	@Enumerated(EnumType.STRING)
//	@Column(nullable = false, length = 10)
//	public StatusQuestao getStatus() {
//		return status;
//	}
//
//	public void setStatus(StatusQuestao status) {
//		this.status = status;
//	}
	
	@OneToMany(mappedBy = "alternativa", cascade = CascadeType.ALL, orphanRemoval = true) //cascade: hibernate já associa as alternativas automaticamente
	public List<Alternativa> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questao other = (Questao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
