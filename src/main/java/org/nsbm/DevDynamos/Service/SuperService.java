package org.nsbm.DevDynamos.Service;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface SuperService  <Dto,ID> {
    boolean saveUser(Dto dto) throws Exception;

    boolean updateUser(Dto dto) throws Exception;

    boolean deleteUser(String id) throws Exception;

    String generateUserId()throws Exception;

    List<Dto> getAllUsers() throws IOException;
}
