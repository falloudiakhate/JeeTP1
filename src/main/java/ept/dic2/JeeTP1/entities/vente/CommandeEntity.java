package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "commande", schema = "vente", catalog = "")
public class CommandeEntity {
    private int numero;
    private Integer clientId;
    private byte statut;
    private Date dateCommande;
    private Date dateLivraisonVoulue;
    private Date dateLivraison;
    private int magasinId;
    private int vendeurId;
    private Collection<ArticleCommandeEntity> articleCommandesByNumero;
    private ClientEntity clientByClientId;
    private MagasinEntity magasinByMagasinId;
    private EmployeEntity employeByVendeurId;

    @Id
    @Column(name = "NUMERO", nullable = false)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "CLIENT_ID", nullable = true, insertable = false, updatable = false)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "STATUT", nullable = false)
    public byte getStatut() {
        return statut;
    }

    public void setStatut(byte statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "DATE_COMMANDE", nullable = false)
    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Basic
    @Column(name = "DATE_LIVRAISON_VOULUE", nullable = false)
    public Date getDateLivraisonVoulue() {
        return dateLivraisonVoulue;
    }

    public void setDateLivraisonVoulue(Date dateLivraisonVoulue) {
        this.dateLivraisonVoulue = dateLivraisonVoulue;
    }

    @Basic
    @Column(name = "DATE_LIVRAISON", nullable = true)
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "MAGASIN_ID", nullable = false, insertable = false, updatable = false)
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Basic
    @Column(name = "VENDEUR_ID", nullable = false, insertable = false, updatable = false)
    public int getVendeurId() {
        return vendeurId;
    }

    public void setVendeurId(int vendeurId) {
        this.vendeurId = vendeurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommandeEntity that = (CommandeEntity) o;

        if (numero != that.numero) return false;
        if (statut != that.statut) return false;
        if (magasinId != that.magasinId) return false;
        if (vendeurId != that.vendeurId) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (dateCommande != null ? !dateCommande.equals(that.dateCommande) : that.dateCommande != null) return false;
        if (dateLivraisonVoulue != null ? !dateLivraisonVoulue.equals(that.dateLivraisonVoulue) : that.dateLivraisonVoulue != null)
            return false;
        if (dateLivraison != null ? !dateLivraison.equals(that.dateLivraison) : that.dateLivraison != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (int) statut;
        result = 31 * result + (dateCommande != null ? dateCommande.hashCode() : 0);
        result = 31 * result + (dateLivraisonVoulue != null ? dateLivraisonVoulue.hashCode() : 0);
        result = 31 * result + (dateLivraison != null ? dateLivraison.hashCode() : 0);
        result = 31 * result + magasinId;
        result = 31 * result + vendeurId;
        return result;
    }

    @OneToMany(mappedBy = "commandeByNumeroCommande")
    public Collection<ArticleCommandeEntity> getArticleCommandesByNumero() {
        return articleCommandesByNumero;
    }

    public void setArticleCommandesByNumero(Collection<ArticleCommandeEntity> articleCommandesByNumero) {
        this.articleCommandesByNumero = articleCommandesByNumero;
    }

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID")
    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "MAGASIN_ID", referencedColumnName = "ID", nullable = false)
    public MagasinEntity getMagasinByMagasinId() {
        return magasinByMagasinId;
    }

    public void setMagasinByMagasinId(MagasinEntity magasinByMagasinId) {
        this.magasinByMagasinId = magasinByMagasinId;
    }

    @ManyToOne
    @JoinColumn(name = "VENDEUR_ID", referencedColumnName = "ID", nullable = false)
    public EmployeEntity getEmployeByVendeurId() {
        return employeByVendeurId;
    }

    public void setEmployeByVendeurId(EmployeEntity employeByVendeurId) {
        this.employeByVendeurId = employeByVendeurId;
    }
}
