package org.tutev.web.erp.controller.stok;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.tutev.web.erp.entity.stok.StokKart;
import org.tutev.web.erp.service.StokService;
@Controller("stokController")
@Scope("session")
public class StokController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3730517198446680077L;

	//http://localhost:8080/TutevERP/secure/stok/index.xhtml
    	
	@Autowired         
	private transient StokService stokService;   //wired the beans automatically

	private StokKart stokKart;  //created variable  for stokKart object
	List<StokKart> stokListesi;  //created variable for List of stokKart objects
		
	@PostConstruct  
	private void init() {   ////the contract that guarantees that this method will be invoked only once in the bean lifecycle
		stokListesi=stokService.getAll();  //assigned values by using getAll method in StokService 
		
		//stokListele();
	}
    		
	public void stokListele() {
		setStokListesi(stokService.getAll());
	}
			
	public void stokKaydet() {
		System.out.println("Yeni Stok Kaydý");
		//stokService.save(stokKart);
		//yeniStokKart();
		stokService.save(stokKart);
		yeniStokKart();
		stokListele();
	}
	
			
	public void yeniStokKart() {      //create new stokKart object 
		stokKart = new StokKart();
	}


	
	///GET and SET METHODS for variables 

	public List<StokKart> getStokListesi() {
		return stokListesi;
	}



	public void setStokListesi(List<StokKart> stokListesi) {
		this.stokListesi = stokListesi;
	}
	
	
	public StokKart getStokKart() {   
		if(stokKart==null){
			yeniStokKart();
			}	
		return stokKart;
	}	
		
	public void setStokKart(StokKart stokKart) {
		this.stokKart=stokKart;
			
	}
}
