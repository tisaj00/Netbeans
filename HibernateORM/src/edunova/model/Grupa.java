
package edunova.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Grupa extends Entitet implements Serializable {
    
    @ManyToOne
    private Smjer smjer;
    
    private String naziv;
    
    @Temporal(TemporalType.DATE)
    private Date datumPocetka;
    
    @ManyToOne
    private Predavac predavac;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "grupa_polaznik", 
        joinColumns = { @JoinColumn(name = "grupa_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "polaznik_id") }
    )
    private List<Polaznik> polaznici = new ArrayList<>();

   

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
    
}
