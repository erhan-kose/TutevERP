/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.web.erp.entity.fatura;

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
@Table(name="FTR_FATURA")
public class Fatura extends BaseEntity {

    private Long id;
    private String faturaNo;
    private String faturaTipi;
    private Date faturaTarihi;
    private Double miktar;
    private String musteriAdi;
    private Double faturaTutari;
    private Double birimFiyati;

    
    @Id
    @GeneratedValue(generator = "SQ_FATURA", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "SQ_FATURA", sequenceName = "SQ_FATURA")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FATURA_NO")
    public String getFaturaNo() {
        return faturaNo;
    }

    public void setFaturaNo(String faturaNo) {
        this.faturaNo = faturaNo;
    }

    @Column(name = "FATURA_TIPI")
    public String getFaturaTipi() {
        return faturaTipi;
    }

    public void setFaturaTipi(String faturaTipi) {
        this.faturaTipi = faturaTipi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "FATURA_TARIHI")
    public Date getFaturaTarihi() {
        return faturaTarihi;
    }

    public void setFaturaTarihi(Date faturaTarihi) {
        this.faturaTarihi = faturaTarihi;
    }

    @Column(name = "MIKTAR")
    public Double getMiktar() {
        return miktar;
    }

    public void setMiktar(Double miktar) {
        this.miktar = miktar;
    }

    @Column(name = "MUSTERI_ADI")
    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    @Column(name = "FATURA_TUTARI")
    public Double getFaturaTutari() {
        return faturaTutari;
    }

    public void setFaturaTutari(Double faturaTutari) {
        this.faturaTutari = faturaTutari;
    }

    @Column(name = "BIRIM_FIYATI")
    public Double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(Double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

}
