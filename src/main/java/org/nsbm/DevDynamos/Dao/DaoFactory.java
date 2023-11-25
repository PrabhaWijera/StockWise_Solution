package org.nsbm.DevDynamos.Dao;

import javafx.scene.control.Alert;
import org.nsbm.DevDynamos.Controllers.CustomerController;
import org.nsbm.DevDynamos.Dao.custom.impl.*;

import java.sql.Connection;

public class DaoFactory {
    //factory design pattern
    private static DaoFactory daoFactory;

    private DaoFactory(){

    }
    public static  DaoFactory getInstance(){
        return daoFactory==null?(daoFactory=new DaoFactory()): daoFactory;
    }

    public <T extends SuperDao>T getDAO(Connection connection,DaoTypes daoTypes){
        switch (daoTypes){
            //give connections
            case CUSTOMER:
                return (T) new CustomerDaoimpl(connection);

            case ITEM:
                return (T) new ItemDaoimpl(connection);

            case ORDER:
                return (T) new OrdersDaoimpl(connection);

            case EMPLOYEE:
                return (T) new EmployeeDaoimpl(connection);

            case SUPPLIERS:
                return (T) new SupplyerDaoimpl(connection);

            default:
               return null;

        }
    }
}
