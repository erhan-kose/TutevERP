/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.web.erp.service;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.tutev.web.erp.entity.genel.Kisi;

/**
 * 
 * @author Bilisim-Hoca
 */
public class KisiService implements ServiceBase<Kisi> {

	@Autowired
	private transient BaseService baseService;

	@Override
	public Kisi save(Kisi entity) {
		entity.setDurum(Boolean.TRUE);
		entity.setEklemeTarihi(new Date());
		entity.setEkleyen("CURR_USER");
		getSession().save(entity);
		return entity;
	}

	@Override
	public Kisi update(Kisi entity) {

		entity.setGuncellemeTarihi(new Date());
		entity.setGuncelleyen("CURR_USER");
		getSession().saveOrUpdate(entity);

		return entity;
	}

	@Override
	public Boolean delete(Kisi entity) {
		try {

			getSession().delete(entity);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public Kisi getById(Long id) {
		Session session = getSession();
		Kisi kisi = (Kisi) session.get(Kisi.class, id);
		return kisi;
	}

	@Override
	public List<Kisi> getAll() {
		Criteria criteria = getSession().createCriteria(Kisi.class);
		return (List<Kisi>) criteria.list();
	}

	@Override
	public Session getSession() {
		return baseService.getSession();
	}
}
