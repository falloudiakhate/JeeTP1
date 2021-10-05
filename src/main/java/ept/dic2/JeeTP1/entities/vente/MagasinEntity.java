package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "magasin", schema = "vente", catalog = "")
public class MagasinEntity {
    private int id;
    private String nom;
    private String telephone;
    private String email;
    private String adresse;
    private String ville;
    private String etat;
    private String codeZip;
    private Collection<CommandeEntity> commandesById;
    private Collection<EmployeEntity> employesById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NOM", nullable = false, length = 255)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 25)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ADRESSE", nullable = true, length = 255)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "VILLE", nullable = true, length = 255)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "ETAT", nullable = true, length = 25)
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Basic
    @Column(name = "CODE_ZIP", nullable = true, length = 5)
    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MagasinEntity that = (MagasinEntity) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (adresse != null ? !adresse.equals(that.adresse) : that.adresse != null) return false;
        if (ville != null ? !ville.equals(that.ville) : that.ville != null) return false;
        if (etat != null ? !etat.equals(that.etat) : that.etat != null) return false;
        if (codeZip != null ? !codeZip.equals(that.codeZip) : that.codeZip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (codeZip != null ? codeZip.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "magasinByMagasinId")
    public Collection<CommandeEntity> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<CommandeEntity> commandesById) {
        this.commandesById = commandesById;
    }

    @OneToMany(mappedBy = "magasinByMagasinId")
    public Collection<EmployeEntity> getEmployesById() {
        return employesById;
    }

    public void setEmployesById(Collection<EmployeEntity> employesById) {
        this.employesById = employesById;
    }
}
