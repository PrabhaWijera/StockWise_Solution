package org.nsbm.DevDynamos.Service.custom.impl;

import org.nsbm.DevDynamos.Dao.custom.CustomerDao;
import org.nsbm.DevDynamos.Entity.CustomerEntity;
import org.nsbm.DevDynamos.Service.custom.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceimpl implements CustomerService {

    @Override
    public boolean saveUser(Object o) throws Exception {
        return false;
    }

    @Override
    public boolean updateUser(Object o) throws Exception {
        return false;
    }

    @Override
    public boolean deleteUser(String id) throws Exception {
        return false;
    }

    @Override
    public String generateUserId() throws Exception {
        return null;
    }

    @Override
    public List getAllUsers() throws IOException {
        return null;
    }
}
