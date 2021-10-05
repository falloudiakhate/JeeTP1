package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "article_commande", schema = "vente", catalog = "")
@IdClass(ArticleCommandeEntityPK.class)
public class ArticleCommandeEntity {
    private int numeroCommande;
    private int ligne;
    private int produitId;
    private int quantite;
    private BigDecimal prixDepart;
    private BigDecimal remise;
    private CommandeEntity commandeByNumeroCommande;

    @Id
    @Column(name = "NUMERO_COMMANDE", nullable = false, insertable = false, updatable = false)
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Id
    @Column(name = "LIGNE", nullable = false)
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    @Basic
    @Column(name = "PRODUIT_ID", nullable = false)
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

    @Basic
    @Column(name = "PRIX_DEPART", nullable = false, precision = 2)
    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Basic
    @Column(name = "REMISE", nullable = false, precision = 2)
    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommandeEntity that = (ArticleCommandeEntity) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;
        if (produitId != that.produitId) return false;
        if (quantite != that.quantite) return false;
        if (prixDepart != null ? !prixDepart.equals(that.prixDepart) : that.prixDepart != null) return false;
        if (remise != null ? !remise.equals(that.remise) : that.remise != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        result = 31 * result + produitId;
        result = 31 * result + quantite;
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        result = 31 * result + (remise != null ? remise.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "NUMERO_COMMANDE", referencedColumnName = "NUMERO", nullable = false)
    public CommandeEntity getCommandeByNumeroCommande() {
        return commandeByNumeroCommande;
    }

    public void setCommandeByNumeroCommande(CommandeEntity commandeByNumeroCommande) {
        this.commandeByNumeroCommande = commandeByNumeroCommande;
    }
}
