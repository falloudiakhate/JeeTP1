package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ArticleCommandeEntityPK implements Serializable {
    private int numeroCommande;
    private int ligne;

    @Column(name = "NUMERO_COMMANDE", nullable = false, insertable = false, updatable = false)
    @Id
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Column(name = "LIGNE", nullable = false)
    @Id
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommandeEntityPK that = (ArticleCommandeEntityPK) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        return result;
    }
}
