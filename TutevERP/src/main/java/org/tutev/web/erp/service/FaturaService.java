/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.web.erp.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tutev.web.erp.entity.fatura.Fatura;

/**
 *
 * @author Bilisim-Hoca
 */
public class FaturaService implements ServiceBase<Fatura> {

    @Override
    public Fatura save(Fatura entity) {
        Session session = getSession();
        Transaction t = session.beginTransaction();
        t.begin();
        session.save(entity);
        t.commit();
        return entity;
    }

    @Override
    public Fatura update(Fatura entity) {
        Session session = getSession();
        Transaction t = session.getTransaction();
        t.begin();
        session.saveOrUpdate(entity);
        t.commit();
        return entity;

    }

    @Override
    public Boolean delete(Fatura entity) {
        try {
            Session session = getSession();
            Transaction t = session.getTransaction();
            t.begin();
            session.delete(entity);
            t.commit();
        } catch (Exception ex) {
            return false;
        }

        return true;

    }

    @Override
    public Fatura getById(Long id) {
        Session session=getSession();
        return (Fatura) session.get(Fatura.class, id);
    }

    @Override
    public List<Fatura> getAll() {
        Session session=getSession();
        Criteria criteria=session.createCriteria(Fatura.class);
        return criteria.list();
    }

    @Override
    public Session getSession() {
    	return null;
    }

}
