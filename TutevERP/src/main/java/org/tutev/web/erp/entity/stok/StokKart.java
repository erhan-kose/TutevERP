package org.tutev.web.erp.entity.stok;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.tutev.web.erp.entity.base.BaseEntity;

@Entity                                         //Specifies that the class is an entity-it must have a no-argument constructor
@Table(name = "STK_KART")                     // to specify the details of the table that will be used to persist the entity in the database
public class StokKart extends BaseEntity{   
	  
	
	
	
	 private Long id;
	 private String kod ;
	 private String kategori;
	 private String urunAd;
	 private String marka;
	 private String barkod;
	 private String paraBirim;
	 private BigDecimal girisBirimFiyat;
	 private BigDecimal cikisBirimFiyat;
	 private String olcuBirim;
	 private Double urunMiktar;	
	   
	 public StokKart() {
	    }
			
			
	 public StokKart(Long id, String kod, String kategori, String urunAd,
			String marka, String barkod, String paraBirim,
			BigDecimal girisBirimFiyat, BigDecimal cikisBirimFiyat,
			String olcuBirim, Double urunMiktar) {			
			
		super();
		this.id = id;
		this.kod = kod;
		this.kategori = kategori;
		this.urunAd = urunAd;
		this.marka = marka;
		this.barkod = barkod;
		this.paraBirim = paraBirim;
		this.girisBirimFiyat = girisBirimFiyat;
		this.cikisBirimFiyat = cikisBirimFiyat;
		this.olcuBirim = olcuBirim;
		this.urunMiktar = urunMiktar;
	}
	
	@Id   //Each entity bean will have a primary key
	@SequenceGenerator(name = "SQ_STK",sequenceName = "SQ_STK",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "SQ_STK",strategy = GenerationType.SEQUENCE)
	@Column(name = "SQ_STK")  //to specify the details of the column to which a field or property will be mapped 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "STK_Kod",length=80)
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	@Column(name = "STK_Kategori")
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	
	@Column(name = "STK_UrunAd")
	public String getUrunAd() {
		return urunAd;
	}
	public void setUrunAd(String urunad) {
		this.urunAd = urunad;
	}
	@Column(name = "STK_Marka")
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	@Column(name = "STK_Barkod")
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	
	@Column(name = "STK_ParaBirim")
	public String getParaBirim() {
		return paraBirim;
	}
	public void setParaBirim(String paraBirim) {
		this.paraBirim = paraBirim;
	}
	@Column(name = "STK_GirisBirimFiyat")
	public BigDecimal getGirisBirimFiyat() {
		return girisBirimFiyat;
	}
	public void setGirisBirimFiyat(BigDecimal girisBirimFiyat) {
		this.girisBirimFiyat = girisBirimFiyat;
	}
	@Column(name = "STK_CikisBirimFiyat")
	public BigDecimal getCikisBirimFiyat() {
		return cikisBirimFiyat;
	}
	public void setCikisBirimFiyat(BigDecimal cikisBirimFiyat) {
		this.cikisBirimFiyat = cikisBirimFiyat;
	}
	
	@Column(name = "STK_OlcuBirim",length=20)
	public String getOlcuBirim() {
		return olcuBirim;
	}
	public void setOlcuBirim(String olcuBirim) {
		this.olcuBirim = olcuBirim;
	}
	
	@Column(name = "STK_UrunMiktar",length=80)
	public Double getUrunMiktar() {
		return urunMiktar;
	}
	public void setUrunMiktar(Double urunMiktar) {
		this.urunMiktar = urunMiktar;
	}
	@Override
	public String toString() {
		return "StokKart [id=" + id + ", kod=" + kod + ", kategori=" + kategori
				+ ", urunAd=" + urunAd + ", marka=" + marka + ", barkod="
				+ barkod + ", paraBirim=" + paraBirim + ", girisBirimFiyat="
				+ girisBirimFiyat + ", cikisBirimFiyat=" + cikisBirimFiyat
				+ ", olcuBirim=" + olcuBirim + ", urunMiktar=" + urunMiktar
				+ "]";
	}
	  
		
	
	}
	  
	  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
