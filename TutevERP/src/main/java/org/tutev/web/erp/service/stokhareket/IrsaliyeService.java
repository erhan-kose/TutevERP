/**
 * 
 */
package org.tutev.web.erp.service.stokhareket;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tutev.web.erp.entity.stokhareket.Irsaliye;
import org.tutev.web.erp.service.ServiceBase;

/**
 * @author Bilisim-Hoca
 * @param <Irsaliye>
 * 
 */
public class IrsaliyeService implements ServiceBase<Irsaliye> {

	@Override
	public Irsaliye save(Irsaliye entity) {
		Session session = getSession();
		Transaction t = session.getTransaction();
		t.begin();
		entity.setDurum(Boolean.TRUE);
		entity.setEklemeTarihi(new Date());
		entity.setEkleyen("CURR_USER");
		session.save(entity);
		t.commit();
		return entity;
	}

	@Override
	public Irsaliye update(Irsaliye entity) {
		Session session = getSession();
		Transaction t = session.getTransaction();
		t.begin();
		entity.setGuncellemeTarihi(new Date());
		entity.setGuncelleyen("CURR_USER");
		session.saveOrUpdate(entity);
		t.commit();
		return entity;
	}

	@Override
	public Boolean delete(Irsaliye entity) {
		try {
			Session session = getSession();
			Transaction t = session.getTransaction();
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
	public Irsaliye getById(Long id) {
		Session session = getSession();
		Irsaliye irsaliye = (Irsaliye) session.get(Irsaliye.class, id);
		return irsaliye;
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
