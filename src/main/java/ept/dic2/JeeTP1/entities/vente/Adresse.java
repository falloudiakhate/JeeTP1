package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {

    private String adresse;

    @Basic
    @Column(name = "adresse", nullable = false, length = 50)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
