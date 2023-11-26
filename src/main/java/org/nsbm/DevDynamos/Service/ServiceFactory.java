package org.nsbm.DevDynamos.Service;

import org.nsbm.DevDynamos.Service.custom.impl.CustomerServiceimpl;

public class ServiceFactory {
    private static ServiceFactory boFactory;
    private ServiceFactory(){

    }
    public static ServiceFactory getBOFactory(){
        if (boFactory==null){
            return new ServiceFactory();
        }
        return boFactory;
    }



    public <T extends SuperService> T   getBO(ServiceType types) {
        switch (types) {
            case CUSTOMER:
                return (T)new CustomerServiceimpl();

            default:
                return null;
        }
    }
}
