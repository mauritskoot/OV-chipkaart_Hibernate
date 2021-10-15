package studie.dp.dao;

import studie.dp.domain.Reiziger;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class ReizigerDAOHibernate implements ReizigerDAO{
    private EntityManager entityManager;

    @Override
    public boolean save(Reiziger reiziger) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Reiziger reiziger) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Reiziger reiziger) throws SQLException {
        return false;
    }

    @Override
    public Reiziger findById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Reiziger> findByGbdatum(String datum) throws SQLException {
        return null;
    }

    @Override
    public List<Reiziger> findAll() throws SQLException {
        return null;
    }
}
