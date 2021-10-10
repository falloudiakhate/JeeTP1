package ept.dic2.JeeTP1.entities.veloSolutionJPA;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client extends Personne{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return idClient.equals(client.idClient) && commandes.equals(client.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, commandes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", commandes=" + commandes +
                '}';
    }
}
