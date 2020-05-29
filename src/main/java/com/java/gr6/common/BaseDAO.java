package com.java.gr6.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BaseDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public Session getSession() {
		return (Session) entityManager.getDelegate();
	}
}
