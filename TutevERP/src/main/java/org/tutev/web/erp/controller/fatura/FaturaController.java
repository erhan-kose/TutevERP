package org.tutev.web.erp.controller.fatura;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller("faturaController")
@Scope("session")
public class FaturaController {

	private int faturaId;
	private String faturaAdi;
	
	
	@PostConstruct
	private void init() {
		setFaturaAdi("Fatura1");
		
		setFaturaId(1234);
		
	}
	
	public int getFaturaId() {
		return faturaId;
	}
	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}
	public String getFaturaAdi() {
		return faturaAdi;
	}
	public void setFaturaAdi(String faturaAdi) {
		this.faturaAdi = faturaAdi;
	}
	

	
	
}
