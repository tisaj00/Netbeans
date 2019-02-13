/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacija.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Josip
 */
public class Radnik {
    
    private int id;
    private BigDecimal oib;
    private String ime;
    private String prezime;
    private String spol;
    private Date datum_rodenja;
    private BigDecimal mobitel;
    private BigDecimal osnovica_po_satu;
    private String opcina_prebivalista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getOib() {
        return oib;
    }

    public void setOib(BigDecimal oib) {
        this.oib = oib;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    

    public Date getDatum_rodenja() {
        return datum_rodenja;
    }

    public void setDatum_rodenja(Date datum_rodenja) {
        this.datum_rodenja = datum_rodenja;
    }

    public BigDecimal getMobitel() {
        return mobitel;
    }

    public void setMobitel(BigDecimal mobitel) {
        this.mobitel = mobitel;
    }

    public BigDecimal getOsnovica_po_satu() {
        return osnovica_po_satu;
    }

    public void setOsnovica_po_satu(BigDecimal osnovica_po_satu) {
        this.osnovica_po_satu = osnovica_po_satu;
    }

    public String getOpcina_prebivalista() {
        return opcina_prebivalista;
    }

    public void setOpcina_prebivalista(String opcina_prebivalista) {
        this.opcina_prebivalista = opcina_prebivalista;
    }

    @Override
    public String toString() {
        return id + "   " + ime + "   " + prezime + "   " + spol + "   " + datum_rodenja ;
    }
    
    
    
}
