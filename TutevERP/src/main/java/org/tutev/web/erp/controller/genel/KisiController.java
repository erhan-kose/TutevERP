package org.tutev.web.erp.controller.genel;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("kisiController")
@Scope("session")
public class KisiController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3607896108305768125L;

	private String isimSoyisim;
	
	
	@PostConstruct
	private void init() {
		setIsimSoyisim("Taner ABC");
	}
		
	public String getIsimSoyisim() {
		return isimSoyisim;
	}	
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}
}
