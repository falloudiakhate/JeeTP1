package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "vente", catalog = "")
public class ClientEntity extends Personne {

    private String adresse;
    private String ville;
    private String etat;
    private String codeZip;
    private Collection<CommandeEntity> commandesById;



    @Basic
    @Column(name = "ADRESSE", nullable = true, length = 255)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "VILLE", nullable = true, length = 50)
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

    @OneToMany(mappedBy = "clientByClientId")
    public Collection<CommandeEntity> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<CommandeEntity> commandesById) {
        this.commandesById = commandesById;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientEntity)) return false;
        if (!super.equals(o)) return false;
        ClientEntity that = (ClientEntity) o;
        return adresse.equals(that.adresse) && ville.equals(that.ville) && etat.equals(that.etat) && codeZip.equals(that.codeZip) && commandesById.equals(that.commandesById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adresse, ville, etat, codeZip, commandesById);
    }

    @Override
    public String toString() {
        return super.toString() + "ClientEntity{" +
                "adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", etat='" + etat + '\'' +
                ", codeZip='" + codeZip + '\'' +
                '}';
    }
}
