package org.nsbm.DevDynamos.Convertor;

import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Entity.CustomerEntity;

public class Convertor {

    CustomerDto fromCustomerEntity(CustomerEntity customerEntity){
        return new CustomerDto(customerEntity.getId(), customerEntity.getName(), customerEntity.getAddress(), customerEntity.getNIc(), customerEntity.getContactNumber());
    }
    CustomerEntity toCustomerDto(CustomerDto customerDto){
        return new CustomerEntity(customerDto.getId(), customerDto.getName(), customerDto.getAddress(), customerDto.getNIc(), customerDto.getContactNumber());
    }
}
