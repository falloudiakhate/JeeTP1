package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="idVelo")
    private Velo velo;
    private int quantite;
    private double prix;
    @ManyToOne
    @JoinColumn(name="idCommande")
    private Commande commande;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Velo getVelo() {
        return velo;
    }
    public void setProduit(Velo velo) {
        this.velo = velo;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setVelo(Velo velo) {
        this.velo = velo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LigneCommande)) return false;
        LigneCommande that = (LigneCommande) o;
        return quantite == that.quantite && Double.compare(that.prix, prix) == 0 && id.equals(that.id) && velo.equals(that.velo) && commande.equals(that.commande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, velo, quantite, prix, commande);
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", velo=" + velo +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", commande=" + commande +
                '}';
    }
}
