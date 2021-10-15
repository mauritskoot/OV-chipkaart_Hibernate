package studie.dp.dao;

import studie.dp.domain.OVChipkaart;
import studie.dp.domain.Product;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class ProductDAOHibernate implements ProductDAO{
    private EntityManager entityManager;

    @Override
    public boolean save(Product product) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Product product) throws SQLException {
        return false;
    }

    @Override
    public List<Product> findByOVChipkaart(OVChipkaart ovChipkaart) throws SQLException {
        return null;
    }

    @Override
    public List<Product> findAll() throws SQLException {
        return null;
    }
}
