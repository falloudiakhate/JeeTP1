package ept.dic2.JeeTP1.entities.production;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock", schema = "production", catalog = "")
@IdClass(StockEntityPK.class)
public class StockEntity {
    private int magasinId;
    private int produitId;
    private int quantite;
    private ProduitEntity produitByProduitId;

    @Id
    @Column(name = "MAGASIN_ID", nullable = false)
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Id
    @Column(name = "PRODUIT_ID", nullable = false, insertable = false, updatable = false)
    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Basic
    @Column(name = "QUANTITE", nullable = false)
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockEntity that = (StockEntity) o;
        return magasinId == that.magasinId && produitId == that.produitId && quantite == that.quantite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magasinId, produitId, quantite);
    }

    @ManyToOne
    @JoinColumn(name = "PRODUIT_ID", referencedColumnName = "ID", nullable = false)
    public ProduitEntity getProduitByProduitId() {
        return produitByProduitId;
    }

    public void setProduitByProduitId(ProduitEntity produitByProduitId) {
        this.produitByProduitId = produitByProduitId;
    }
}
