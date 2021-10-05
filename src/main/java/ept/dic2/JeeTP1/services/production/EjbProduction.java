package ept.dic2.JeeTP1.services.production;

import ept.dic2.JeeTP1.entities.production.ProduitEntity;
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
public class EjbProduction implements EjbServiceProduction {

    private static Logger logger = Logger.getLogger(EjbProduction.class);


    @PersistenceContext(unitName = "JeeTP1Pu2")
    EntityManager em2;

    @Override
    public List<ProduitEntity> findAllProducts() {
        Query query = em2.createQuery("SELECT p FROM ProduitEntity p");
        return query.getResultList();
    }

    @PostConstruct
    public void init() {

        logger.info("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        logger.info("++++++++++++++++ PRODUCT LIST  +++++++++++++++++ \n" + this.findAllProducts().toString());
        logger.info("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}
