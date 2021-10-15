package studie.dp.dao;

import studie.dp.domain.OVChipkaart;
import studie.dp.domain.Reiziger;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class OVChipkaartDAOHibernate implements OVChipkaartDAO{
    private EntityManager entityManager;

    @Override
    public boolean save(OVChipkaart ovchipkaart) throws SQLException {
        return false;
    }

    @Override
    public boolean update(OVChipkaart ovchipkaart) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(OVChipkaart ovchipkaart) throws SQLException {
        return false;
    }

    @Override
    public List<OVChipkaart> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<OVChipkaart> findByReiziger(Reiziger reiziger) throws SQLException {
        return null;
    }
}
