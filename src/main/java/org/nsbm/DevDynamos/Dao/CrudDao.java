package org.nsbm.DevDynamos.Dao;

import org.nsbm.DevDynamos.Dao.exception.ConstraintViolationException;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface CrudDao  <Entity,ID>extends SuperDao {

    boolean save(Entity entity) throws Exception;

    boolean update(Entity entity) throws Exception;

    boolean delete(ID id) throws Exception;

    List<Entity> getAll() throws IOException;

    String generateId() throws Exception;



}
