package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;


@Entity
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idcategorie;

    @Size(min=4,max=20)
    private String nomCategorie;
    @Size(min=8)
    private String description;
    @Lob
    private byte[] photo;
    private String nomPhoto;
    @OneToMany(mappedBy="categorie")
    private Collection<Velo> velos;

    public Long getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public Collection<Velo> getVelos() {
        return velos;
    }

    public void setVelos(Collection<Velo> velos) {
        this.velos = velos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categorie)) return false;
        Categorie categorie = (Categorie) o;
        return idcategorie.equals(categorie.idcategorie) && nomCategorie.equals(categorie.nomCategorie) && description.equals(categorie.description) && Arrays.equals(photo, categorie.photo) && nomPhoto.equals(categorie.nomPhoto) && velos.equals(categorie.velos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idcategorie, nomCategorie, description, nomPhoto, velos);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "idcategorie=" + idcategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", nomPhoto='" + nomPhoto + '\'' +
                ", velos=" + velos +
                '}';
    }
}
