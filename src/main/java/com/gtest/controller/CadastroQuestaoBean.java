package com.gtest.controller;

import java.io.Serializable;
import java.util.List;

import com.gtest.model.Alternativa;
import com.gtest.model.Questao;

public class CadastroQuestaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Questao questao;
	
	private List<Alternativa> alternativas;
	
	public CadastroQuestaoBean() {
		questao = new Questao();
	}

	public void salvar() {
	}
	
	public Questao getQuestao() {
		return questao;
	}

	public List<Alternativa> getAlternativas() {
		return alternativas;
	}
	
	
}
