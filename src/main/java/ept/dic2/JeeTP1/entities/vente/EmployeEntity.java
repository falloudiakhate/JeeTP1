package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "employe", schema = "vente", catalog = "")
public class EmployeEntity {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String telephone;
    private byte actif;
    private int magasinId;
    private Integer managerId;
    private Collection<CommandeEntity> commandesById;
    private MagasinEntity magasinByMagasinId;
    private EmployeEntity employeByManagerId;
    private Collection<EmployeEntity> employesById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PRENOM", nullable = false, length = 50)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "NOM", nullable = false, length = 50)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 25)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "ACTIF", nullable = false)
    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
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
    @Column(name = "MANAGER_ID", nullable = true, insertable = false, updatable = false)
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeEntity that = (EmployeEntity) o;

        if (id != that.id) return false;
        if (actif != that.actif) return false;
        if (magasinId != that.magasinId) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (int) actif;
        result = 31 * result + magasinId;
        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeByVendeurId")
    public Collection<CommandeEntity> getCommandesById() {
        return commandesById;
    }

    public void setCommandesById(Collection<CommandeEntity> commandesById) {
        this.commandesById = commandesById;
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
    @JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
    public EmployeEntity getEmployeByManagerId() {
        return employeByManagerId;
    }

    public void setEmployeByManagerId(EmployeEntity employeByManagerId) {
        this.employeByManagerId = employeByManagerId;
    }

    @OneToMany(mappedBy = "employeByManagerId")
    public Collection<EmployeEntity> getEmployesById() {
        return employesById;
    }

    public void setEmployesById(Collection<EmployeEntity> employesById) {
        this.employesById = employesById;
    }

    @Override
    public String toString() {
        return "EmployeEntity{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", actif=" + actif +
                '}';
    }
}
