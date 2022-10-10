package dao;

import entity.Contato;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ContatoJPADAOSimplificado implements ContatoDAO {
    public void adiciona(Contato contato) {
        EntityManager em = Persistence.createEntityManagerFactory("dev")
                .createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(contato);
        et.commit();
        em.close();
    }

    public List<Contato> getLista() {
        EntityManager em = Persistence.createEntityManagerFactory("dev")
                .createEntityManager();
        //List<Contato> l = em.createQuery("select c from Contato as c", Contato.class).getResultList();
        List<Contato> l = em.createQuery("from Contato", Contato.class).getResultList();
        //List<Contato> l = em.createNamedQuery("Contato.findAll", Contato.class).getResultList();
        em.close();
        return l;
    }

    public List<Contato> getListaPaginada(int pagina, int tamanhoPagina) {
        return null;
    }

}

