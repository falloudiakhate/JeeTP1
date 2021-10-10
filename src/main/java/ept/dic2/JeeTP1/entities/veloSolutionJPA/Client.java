package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client extends Personne {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idClient;

    @OneToMany(mappedBy="client")
    private Collection<Commande> commandes;
    public Long getIdClient() {
        return idClient;
    }
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

}