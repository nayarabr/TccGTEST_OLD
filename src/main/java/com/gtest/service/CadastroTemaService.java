package com.gtest.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.gtest.model.Tema;
import com.gtest.repository.Temas;

public class CadastroTemaService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private Temas temas;
	
	public Tema salvar(Tema tema) {
		return temas.guardar(tema);
	}
}
