package org.tutev.web.erp.controller.stok;


import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
@Controller("stokController")
@Scope("session")
public class StokController implements Serializable {

	//http://localhost:8080/TutevERP/secure/stok/index.xhtml
	private static final long serialVersionUID = -1874781274764099362L;
	   

	private String urunAdi;
	
		
	@PostConstruct
	private void init() {
		setUrunAdi("Malzeme");
	}

	public String getUrunAdi() {
		return urunAdi;
	}	
	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
	
	}
