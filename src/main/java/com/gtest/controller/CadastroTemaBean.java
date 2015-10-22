package com.gtest.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtest.model.Tema;
import com.gtest.service.CadastroTemaService;

@Named("cadastroTemaBean")
@ViewScoped
public class CadastroTemaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroTemaService cadastroTemaService;

	@Inject
	private Tema tema;

	public CadastroTemaBean() {
		tema = new Tema((long) Math.random(), "Nayra");
	}

	// private void limpar() {
	// tema = new Tema();
	// }
	//
	// public CadastroTemaBean() {
	// limpar();
	// }
	//
	public void salvar() {
		// this.tema = cadastroTemaService.salvar(this.tema);
		// limpar();
		// FacesUtil.addInfoMessage("Tema salvo com sucesso!");

	}

	public CadastroTemaService getCadastroTemaService() {
		return cadastroTemaService;
	}

	public void setCadastroTemaService(CadastroTemaService cadastroTemaService) {
		this.cadastroTemaService = cadastroTemaService;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Tema getTema() {
		return tema;
	}

}
