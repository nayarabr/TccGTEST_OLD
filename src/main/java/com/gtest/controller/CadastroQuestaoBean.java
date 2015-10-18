package com.gtest.controller;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gtest.model.Alternativa;
import com.gtest.model.Questao;
import com.gtest.model.Tema;

@Named
public class CadastroQuestaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Questao questao;
	
	private List<Tema> listaTemas; 
	
	private List<Alternativa> alternativas;
	
	public CadastroQuestaoBean() {
		questao = new Questao();
	}

	public void inicializar(){
		System.out.println("Inicializando...");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GtestPU");
		EntityManager manager = factory.createEntityManager();
		
		listaTemas = manager.createQuery("from Tema", Tema.class).getResultList();
		
		manager.close();
	}
	
	public void salvar() {
	}
	
	public Questao getQuestao() {
		return questao;
	}

	public List<Alternativa> getAlternativas() {
		return alternativas;
	}

	public List<Tema> getListaTemas() {
		return listaTemas;
	}
	
	
}
