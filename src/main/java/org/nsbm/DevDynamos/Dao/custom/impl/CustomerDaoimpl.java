package org.nsbm.DevDynamos.Dao.custom.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.nsbm.DevDynamos.Dao.DaoFactory;
import org.nsbm.DevDynamos.Dao.custom.CustomerDao;
import org.nsbm.DevDynamos.Dao.exception.ConstraintViolationException;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Entity.CustomerEntity;
import org.nsbm.DevDynamos.Service.custom.CustomerService;
import org.nsbm.DevDynamos.Util.FactoryConfiguration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoimpl implements CustomerDao  {


    public static CustomerService customerService;

    public Connection connection;

    public CustomerDaoimpl(Connection connection){
        this.connection=connection;
    }

    public static CustomerDto search(String id) {
        return null;
    }

    @Override
    public CustomerEntity save(CustomerEntity entity) throws ConstraintViolationException, SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean update(CustomerEntity entity) throws ConstraintViolationException, SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteByPk(String pk) throws ConstraintViolationException, SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<CustomerEntity> findAll() {
        return null;
    }

    @Override
    public CustomerEntity findByPk(String pk) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean existByPk(String pk) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

}
