package com.gtest.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.gtest.model.Nivel;

@Named
@ViewScoped
public class CadastroNivelBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Nivel nivel;
	
	public CadastroNivelBean() {
		nivel = new Nivel();
	}

	public void salvar() {
	}
	
	public Nivel getNivel() {
		return nivel;
	}

}