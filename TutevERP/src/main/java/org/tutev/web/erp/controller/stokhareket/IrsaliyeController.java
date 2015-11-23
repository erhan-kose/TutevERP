/**
 * 
 */
package org.tutev.web.erp.controller.stokhareket;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.tutev.web.erp.entity.stokhareket.Irsaliye;
import org.tutev.web.erp.service.stokhareket.IrsaliyeService;

/**
 * @author Mehmet Emin IŞIK
 *
 */
@Controller("irsaliyeController")
@Scope("session")
public class IrsaliyeController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3733668559784664851L;
	@Autowired
	private transient IrsaliyeService irsaliyeService;

	private Irsaliye irsaliye;
	List<Irsaliye> irsaliyeListesi;

	@SuppressWarnings("unused")
	private void irsaliyeKaydet() {
		irsaliyeService.save(irsaliye);
	}

	@PostConstruct
	private void init() {
		if (irsaliyeService.getAll() != null)
			irsaliyeListesi = irsaliyeService.getAll();
	}

	/**
	 * @return the irsaliye
	 */
	public Irsaliye getIrsaliye() {
		if (irsaliye == null) {
			irsaliye = new Irsaliye();
		}
		return irsaliye;
	}

	/**
	 * @param irsaliye
	 *            the irsaliye to set
	 */
	public void setIrsaliye(Irsaliye irsaliye) {
		this.irsaliye = irsaliye;
	}

	/**
	 * @return the irsaliyeListesi
	 */
	public List<Irsaliye> getIrsaliyeListesi() {
		return irsaliyeListesi;
	}

}
