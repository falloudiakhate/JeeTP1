package ept.dic2.JeeTP1.entities.production;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StockEntityPK implements Serializable {
    private int magasinId;
    private int produitId;

    @Column(name = "MAGASIN_ID", nullable = false)
    @Id
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Column(name = "PRODUIT_ID", nullable = false, updatable = false, insertable = false)
    @Id
    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockEntityPK that = (StockEntityPK) o;
        return magasinId == that.magasinId && produitId == that.produitId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magasinId, produitId);
    }
}
