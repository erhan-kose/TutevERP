/**
 * 
 */
package org.tutev.web.erp.controller.stokhareket;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

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
	private String adSoyad;

	/**
	 * @return the adSoyad
	 */
	public String getAdSoyad() {
		return adSoyad;
	}

	/**
	 * @param adSoyad the adSoyad to set
	 */
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	@PostConstruct
	private void init() {
		setAdSoyad("Mehmet Emin was here !");
	}

}
