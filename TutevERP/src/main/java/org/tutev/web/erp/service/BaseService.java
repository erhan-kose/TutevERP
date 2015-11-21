/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.web.erp.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author win7
 */
@Repository("baseService")
public class BaseService {

	@Autowired
	private transient SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(Object o) {
		getSession().save(o);
	}

	public void update(Object o) {
		getSession().update(o);
	}

	public void delete(Object o) {
		getSession().delete(o);
	}

	public Object getById(Long id, Class cls) {
		return getSession().get(cls, id);
	}
}
