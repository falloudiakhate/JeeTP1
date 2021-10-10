package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {

    private String id;
    private String rue;
    private String ville;
    private String region;
    private String Pays;
    private String codePostal;

    @Id
    @Column(name = "ID", nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rue", nullable = true, length = 50)
    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    @Basic
    @Column(name = "ville", nullable = true, length = 50)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "region", nullable = true, length = 50)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "pays", nullable = true, length = 50)
    public String getPays() {
        return Pays;
    }

    public void setPays(String pays) {
        Pays = pays;
    }

    @Basic
    @Column(name = "codePostal", nullable = true, length = 50)
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id='" + id + '\'' +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", region='" + region + '\'' +
                ", Pays='" + Pays + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
