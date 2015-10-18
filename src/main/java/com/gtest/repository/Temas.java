package com.gtest.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gtest.model.Tema;

public class Temas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Tema guardar(Tema tema) {
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		tema = manager.merge(tema);
		trx.commit();
		return tema;
	}
}
