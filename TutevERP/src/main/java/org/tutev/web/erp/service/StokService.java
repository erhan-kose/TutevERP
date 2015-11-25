package org.tutev.web.erp.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutev.web.erp.entity.stok.StokKart;

@Service("stokService")
public class StokService implements ServiceBase<StokKart>{

	
	 @Autowired
	 private transient BaseDao baseDao;
	  
	 @Override
	    public StokKart save(StokKart entity) {
		 	baseDao.save(entity);
	        return entity;
	 }
	 
	 @Override
	    public StokKart update(StokKart entity) {
		    baseDao.saveOrUpdate(entity);
	        return entity;
	 }       
	 
	 @Override
	 public Boolean delete(StokKart entity) {
		 try {
	        	baseDao.delete(entity);
	        } catch (Exception ex) {
	            return false;
	        }
	        return true;
	    }

	 
	    @Override
	    public StokKart getById(Long id) {
	        Session session = getSession();
	        StokKart stokKart=(StokKart) session.get(StokKart.class, id);
	        return stokKart;
	    }
	    @SuppressWarnings("unchecked")
	    @Override
	    public List<StokKart> getAll() {
	        Criteria criteria=getSession().createCriteria(StokKart.class);
	        return (List<StokKart>) criteria.list();
	    } 
		

       
	    @Override
	    public Session getSession() {
	    	return baseDao.getSession();
	    }
	 
	 
}
