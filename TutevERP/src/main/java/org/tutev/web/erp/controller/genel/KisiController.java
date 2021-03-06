package org.tutev.web.erp.controller.genel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.tutev.web.erp.entity.genel.Kisi;
import org.tutev.web.erp.service.KisiService;

@Controller("kisiController")
@Scope("session")
public class KisiController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3607896108305768125L;

	@Autowired
	private transient KisiService kisiService;

	private Kisi kisi;
	List<Kisi> kisiListesi;

	@PostConstruct
	private void init() {
		kisiListesi=kisiService.getAll();
	}

	public void kisiKaydet() {
		
		kisi.setDogumTarihi(new Date());
		kisiService.save(kisi);
	}

	public Kisi getKisi() {
		if (kisi == null) {
			kisi = new Kisi();
		}
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	
	public List<Kisi> getKisiListesi() {
		return kisiListesi;
	}
}
