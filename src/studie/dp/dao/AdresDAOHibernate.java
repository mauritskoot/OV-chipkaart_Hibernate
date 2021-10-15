package studie.dp.dao;

import org.hibernate.SessionFactory;
import studie.dp.domain.Adres;
import studie.dp.domain.Reiziger;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class AdresDAOHibernate implements AdresDAO{
    protected SessionFactory sessionFactory;

    @Override
    public boolean save(Adres adres) throws SQLException {
        sessionFactory.getCurrentSession().save(adres);
        return true;
    }

    @Override
    public boolean update(Adres adres) {
        sessionFactory.getCurrentSession().update(adres);
        return true;
    }

    @Override
    public boolean delete(Adres adres) throws SQLException {
        sessionFactory.getCurrentSession().delete(adres);
        return true;
    }

    @Override
    public Adres findByReiziger(Reiziger reiziger) throws SQLException {
        Adres adres = new Adres;
//        sessionFactory.getCurrentSession().get(reiziger.getAdres());
        return adres;
    }

    @Override
    public List<Adres> findAll() throws SQLException {
        return sessionFactory.getCurrentSession().createQuery(adres.getname);
    }
}
