package org.tutev.web.erp.entity.ik;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.tutev.web.erp.entity.base.BaseEntity;

@Entity
@Table(name = "GNL_PERBILGI")
public class PersonelBilgi  extends BaseEntity{
	
	private Long Id;
	private String ad;
	private String soyad;
	private String Uyrugu;
	private String cinsiyet;
	private Long kimlikNo;
	private String departman;
	private String isGurubu;
	private Date girisTarihi;
	private String istihtamDurum;
	
	
	

	public PersonelBilgi(String ad, String soyad, String uyrugu,
			String cinsiyet, Long kimlikNo, String departman, String isGurubu,
			Date girisTarihi, String istihtamDurum) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		Uyrugu = uyrugu;
		this.cinsiyet = cinsiyet;
		this.kimlikNo = kimlikNo;
		this.departman = departman;
		this.isGurubu = isGurubu;
		this.girisTarihi = girisTarihi;
		this.istihtamDurum = istihtamDurum;
	}

	@Id
	@SequenceGenerator(name = "GNL_PERBILGI", sequenceName = "GNL_PERBILGI", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "GNL_PERBILGI", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Column(name = "ad", length = 80)
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Column(name = "soyad", length = 80)
	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Column(name = "uyrugu", length = 80)
	public String getUyrugu() {
		return Uyrugu;
	}

	public void setUyrugu(String uyrugu) {
		Uyrugu = uyrugu;
	}

	@Column(name = "cinsiyet", length = 80)
	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Column(name = "kimlikno", length = 80)
	public Long getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(Long kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	@Column(name = "departman", length = 80)
	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	@Column(name = "isgurubu", length = 80)
	public String getIsGurubu() {
		return isGurubu;
	}

	public void setIsGurubu(String isGurubu) {
		this.isGurubu = isGurubu;
	}

	@Column(name = "giristarihi", length = 80)
	@Temporal(TemporalType.DATE)
	public Date getGirisTarihi() {
		return girisTarihi;
	}

	public void setGirisTarihi(Date girisTarihi) {
		this.girisTarihi = girisTarihi;
	}

	@Column(name = "istihtamdurum", length = 80)
	public String getIstihtamDurum() {
		return istihtamDurum;
	}

	public void setIstihtamDurum(String istihtamDurum) {
		this.istihtamDurum = istihtamDurum;
	}

	@Override
	public String toString() {
		return String
				.format("PersonelBilgi [Id=%s, ad=%s, soyad=%s, Uyrugu=%s, cinsiyet=%s, kimlikNo=%s, departman=%s, isGurubu=%s, girisTarihi=%s, istihtamDurum=%s]",
						Id, ad, soyad, Uyrugu, cinsiyet, kimlikNo, departman,
						isGurubu, girisTarihi, istihtamDurum);
	}
	
	


}
