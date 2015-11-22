/**
 * 
 */
package org.tutev.web.erp.service.stokhareket;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutev.web.erp.entity.stokhareket.Irsaliye;
import org.tutev.web.erp.service.BaseDao;
import org.tutev.web.erp.service.ServiceBase;

/**
 * @author Bilisim-Hoca
 * @param <Irsaliye>
 * 
 */
@Service("irsaliyeService")
public class IrsaliyeService implements ServiceBase<Irsaliye> {

	@Autowired
	public transient BaseDao baseDao;
	
	@Override
	public Irsaliye save(Irsaliye entity) {
		baseDao.save(entity);
		return entity;
	}

	@Override
	public Irsaliye update(Irsaliye entity) {
		baseDao.saveOrUpdate(entity);
		return entity;
	}

	@Override
	public Boolean delete(Irsaliye entity) {
		try {
			baseDao.delete(entity);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public Irsaliye getById(Long id) {
		Session session = getSession();
		return (Irsaliye) session.get(Irsaliye.class, id);
	}

	@Override
	public List<Irsaliye> getAll() {
		// Criteria Where
		Criteria criteria = getSession().createCriteria(Irsaliye.class);
		return (List<Irsaliye>) criteria.list();
	}

	@Override
	public Session getSession() {
		return null;
	}

}
