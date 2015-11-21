/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tutev.web.erp.service;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Bilisim-Hoca
 */
public interface ServiceBase<T> {
    
    T save(T entity);
    
    T update(T entity);
    
    Boolean delete(T entity);
    
    T getById(Long id);
    
    List<T> getAll();
    
    Session getSession();
}
