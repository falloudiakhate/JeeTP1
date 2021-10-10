package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private Date dateCommande;
    @OneToMany(mappedBy = "commande")
    private Collection<LigneCommande> items;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "magasin_by_magasin_id_ID")
    private Magasin magasinByMagasinId;

    public Magasin getMagasinByMagasinId() {
        return magasinByMagasinId;
    }

    public void setMagasinByMagasinId(Magasin magasinByMagasinId) {
        this.magasinByMagasinId = magasinByMagasinId;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Collection<LigneCommande> getItems() {
        return items;
    }

    public void setItems(Collection<LigneCommande> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commande)) return false;
        Commande commande = (Commande) o;
        return idCommande.equals(commande.idCommande) && dateCommande.equals(commande.dateCommande) && items.equals(commande.items) && client.equals(commande.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommande, dateCommande, items, client);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", items=" + items +
                ", client=" + client +
                '}';
    }
}