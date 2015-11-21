package org.tutev.web.erp.service;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tutev.web.erp.entity.genel.Kisi;
import org.tutev.web.erp.entity.ik.PersonelBilgi;

public class PersonelBigiService implements ServiceBase<PersonelBilgi> {
	
	
	

	@Override
	public PersonelBilgi save(PersonelBilgi entity) {
		 Session session = getSession();
	        Transaction t= session.getTransaction();
	        t.begin();
	        entity.setDurum(Boolean.TRUE);
	        entity.setEklemeTarihi(new Date());
	        entity.setEkleyen("CURR_USER");
	        session.save(entity);
	        t.commit();
	        return entity;
	}

	@Override
	public PersonelBilgi update(PersonelBilgi entity) {
		  Session session = getSession();
	        Transaction t= session.getTransaction();
	        t.begin();
	        entity.setGuncellemeTarihi(new Date());
	        entity.setGuncelleyen("CURR_USER");
	        session.saveOrUpdate(entity);
	        t.commit();
	        return entity;
	}

	@Override
	public Boolean delete(PersonelBilgi entity) {
		 try {
	            Session session = getSession();
	            Transaction t= session.getTransaction();
	            t.begin();
	            session.delete(entity);
	            t.commit();
	            session.getTransaction().commit();
	        } catch (Exception e) {
	            return false;
	        }

	        return true;
	}

	@Override
	public PersonelBilgi getById(Long id) {
		 Session session = getSession();
		 PersonelBilgi personel=(PersonelBilgi)session.get(PersonelBilgi.class, id);
		 return personel;
		 
	}

	@Override
	public List<PersonelBilgi> getAll() {
		    Criteria criteria=getSession().createCriteria(Kisi.class);
	        return (List<PersonelBilgi>) criteria.list();
	}

	@Override
	public Session getSession() {
		return null;
	}
	
	
	
}
