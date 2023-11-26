package org.nsbm.DevDynamos.Service.custom.impl;

import org.nsbm.DevDynamos.Dao.DaoFactory;
import org.nsbm.DevDynamos.Dao.DaoTypes;
import org.nsbm.DevDynamos.Dao.custom.CustomerDao;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Entity.CustomerEntity;
import org.nsbm.DevDynamos.Service.custom.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceimpl implements   {


private final CustomerDao customerDao= (CustomerDao) DaoFactory.getInstance().getDAO(DaoTypes.CUSTOMER);

    public static CustomerDto search(String id) {
    }




}
