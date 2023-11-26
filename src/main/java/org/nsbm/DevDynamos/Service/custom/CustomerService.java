package org.nsbm.DevDynamos.Service.custom;

import org.nsbm.DevDynamos.Dao.CrudDao;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Entity.CustomerEntity;
import org.nsbm.DevDynamos.Service.SuperService;

import java.io.IOException;
import java.util.List;

public interface CustomerService extends SuperService {
    boolean save(CustomerDto dto) throws Exception;

    boolean update(CustomerDto dto) throws Exception;

    boolean delete(String id) throws Exception;

    String generateId()throws Exception;

    List<CustomerDto> getAllCustomers() throws IOException;
}
