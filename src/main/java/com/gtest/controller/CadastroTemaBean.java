package com.gtest.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtest.model.Tema;
import com.gtest.service.CadastroTemaService;
import com.gtest.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroTemaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroTemaService cadastroTemaService;
	
	private Tema tema;
	
	public CadastroTemaBean() {
		limpar();
	}

	private void limpar(){
		tema = new Tema();
	}
	
	public void salvar() {
		this.tema = cadastroTemaService.salvar(this.tema);
		limpar();
		FacesUtil.addInfoMessage("Tema salvo com sucesso!");
		
	}
	public Tema getTema() {
		return tema;
	}
	
}
