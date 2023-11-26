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



    public SuperService getBO(ServiceType types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerServiceimpl();

            default:
                return null;
        }
    }
}
