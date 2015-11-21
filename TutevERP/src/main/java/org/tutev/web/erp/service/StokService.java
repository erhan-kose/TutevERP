package org.tutev.web.erp.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tutev.web.erp.entity.stok.StokKart;
public class StokService implements ServiceBase<StokKart>{
			
	 @Override
	    public StokKart save(StokKart entity) {
	        Session session = getSession();
	        Transaction t= session.getTransaction();
	        t.begin();
	        session.save(entity);
	        t.commit();
	        return entity;
	    }
	 
	 @Override
	    public StokKart update(StokKart entity) {
	        Session session = getSession();
	        Transaction t = session.getTransaction();
	        t.begin();
	        session.saveOrUpdate(entity);
	        t.commit();
	        return entity;
	    }
	 
	 @Override
	    public Boolean delete(StokKart entity) {
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
	    public StokKart getById(Long id) {
	        Session session = getSession();
	        StokKart kart = (StokKart) session.get(StokKart.class, id);
	        return kart;
	    }

	    @Override
	    public List<StokKart> getAll() {
	        Criteria criteria=getSession().createCriteria(StokKart.class);
	        return (List<StokKart>) criteria.list();
	    }

	    @Override
	    public Session getSession() {
	    	return null;
	    }
	 
	 
}
