package ept.dic2.JeeTP1.entities.production;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produit", schema = "production", catalog = "")
public class ProduitEntity {
    private int id;
    private String nom;
    private short anneeModel;
    private BigDecimal prixDepart;
    private MarqueEntity marqueByMarqueId;
    private CategorieEntity categorieByCategorieId;

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
    @Column(name = "ANNEE_MODEL", nullable = false)
    public short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(short anneeModel) {
        this.anneeModel = anneeModel;
    }

    @Basic
    @Column(name = "PRIX_DEPART", nullable = false, precision = 2)
    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduitEntity that = (ProduitEntity) o;
        return id == that.id && anneeModel == that.anneeModel && Objects.equals(nom, that.nom) && Objects.equals(prixDepart, that.prixDepart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, anneeModel, prixDepart);
    }

    @ManyToOne
    @JoinColumn(name = "MARQUE_ID", referencedColumnName = "ID", nullable = false)
    public MarqueEntity getMarqueByMarqueId() {
        return marqueByMarqueId;
    }

    public void setMarqueByMarqueId(MarqueEntity marqueByMarqueId) {
        this.marqueByMarqueId = marqueByMarqueId;
    }

    @ManyToOne
    @JoinColumn(name = "CATEGORIE_ID", referencedColumnName = "ID", nullable = false)
    public CategorieEntity getCategorieByCategorieId() {
        return categorieByCategorieId;
    }

    public void setCategorieByCategorieId(CategorieEntity categorieByCategorieId) {
        this.categorieByCategorieId = categorieByCategorieId;
    }

    @Override
    public String toString() {
        return "ProduitEntity{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", anneeModel=" + anneeModel +
                ", prixDepart=" + prixDepart +
                '}';
    }
}
