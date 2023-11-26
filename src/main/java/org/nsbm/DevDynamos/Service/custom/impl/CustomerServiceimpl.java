package org.nsbm.DevDynamos.Service.custom.impl;

import org.nsbm.DevDynamos.Dao.DaoFactory;
import org.nsbm.DevDynamos.Dao.DaoTypes;
import org.nsbm.DevDynamos.Dao.custom.CustomerDao;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Entity.CustomerEntity;
import org.nsbm.DevDynamos.Service.custom.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceimpl implements CustomerService {


private final CustomerDao customerDao= (CustomerDao) DaoFactory.getInstance().getDAO(DaoTypes.CUSTOMER);


    @Override
    public boolean save(CustomerDto dto) throws Exception {
        return customerDao.save(new CustomerEntity(dto.getId(),dto.getName(),dto.getNIc(),dto.getAddress(),dto.getContactNumber()));

    }

    @Override
    public boolean update(CustomerDto dto) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public String generateId() throws Exception {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() throws IOException {
        return null;
    }
}
