package org.nsbm.DevDynamos.Dao.custom.impl;

import org.nsbm.DevDynamos.Dao.custom.CustomerDao;
import org.nsbm.DevDynamos.Entity.CustomerEntity;

import java.io.IOException;
import java.util.List;

public class CustomerDaoimpl implements CustomerDao {
    @Override
    public boolean save(CustomerEntity customerEntity) throws Exception {
        return false;
    }

    @Override
    public boolean update(CustomerEntity customerEntity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public List<CustomerEntity> getAll() throws IOException {
        return null;
    }

    @Override
    public String generateId() throws Exception {
        return null;
    }
}
