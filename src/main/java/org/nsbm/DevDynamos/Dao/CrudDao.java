package org.nsbm.DevDynamos.Dao;

import org.nsbm.DevDynamos.Dao.exception.ConstraintViolationException;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface CrudDao <T extends Serializable,ID extends Serializable> extends SuperDao{

    T save(T entity) throws ConstraintViolationException, SQLException,ClassNotFoundException;

    boolean update(T entity) throws ConstraintViolationException, SQLException,ClassNotFoundException;

    boolean deleteByPk(String pk)throws ConstraintViolationException, SQLException,ClassNotFoundException;

    List<T> findAll();

    T findByPk(ID pk) throws SQLException,ClassNotFoundException;

    boolean existByPk(String pk);

    long count();



}
