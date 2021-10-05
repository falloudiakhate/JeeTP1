package ept.dic2.JeeTP1.services.production;

import ept.dic2.JeeTP1.entities.production.ProduitEntity;
import ept.dic2.JeeTP1.entities.vente.EmployeEntity;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EjbServiceProduction {

    public List<ProduitEntity> findAllProducts();

}
