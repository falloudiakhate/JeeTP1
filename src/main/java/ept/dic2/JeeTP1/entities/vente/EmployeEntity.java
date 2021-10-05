package ept.dic2.JeeTP1.entities.vente;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employe", schema = "vente", catalog = "")
public class EmployeEntity extends Personne {

    private byte actif;
    private int magasinId;
    private Integer managerId;
    private Collection<CommandeEntity> commandesById;
    private MagasinEntity magasinByMagasinId;
    private EmployeEntity employeByManagerId;
    private Collection<EmployeEntity> employesById;

    public EmployeEntity() {
        super();
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

        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null) return false;

        return true;
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
    public int hashCode() {
        return Objects.hash(super.hashCode(), actif, magasinId, managerId, commandesById, magasinByMagasinId, employeByManagerId, employesById);
    }

    @Override
    public String toString() {
        return "EmployeEntity{" +
                "id=" + super.getId() +
                ", nom='" + super.getNom() + '\'' +
                ", prenom='" + super.getPrenom() + '\'' +
                ", telephone='" + super.getTelephone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                "actif=" + actif +
                '}';
    }
}
