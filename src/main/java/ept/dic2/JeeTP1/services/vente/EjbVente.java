package ept.dic2.JeeTP1.services.vente;

import ept.dic2.JeeTP1.entities.vente.EmployeEntity;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Singleton
@Startup
public class EjbVente implements EjbServiceVente {

    private static Logger logger = Logger.getLogger(EjbVente.class);


    @PersistenceContext(unitName = "JeeTP1Pu1")
    EntityManager em1;


    @Override
    public List<EmployeEntity> findAllEmployees() {
        Query query = em1.createQuery("SELECT e FROM EmployeEntity e");
        return query.getResultList();
    }


    @PostConstruct
    public void init() {

        logger.info("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        logger.info("++++++++++++++++ EMPLOYE LIST ++++++++++++++++++\n" + this.findAllEmployees().toString());
        logger.info("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

    }
}
