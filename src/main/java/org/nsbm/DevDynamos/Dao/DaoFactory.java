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
        return daoFactory==null? new DaoFactory():daoFactory;
    }

    public Object getDAO( DaoTypes daoTypes){
        switch (daoTypes){
            //give connections
            case CUSTOMER:
                return   new CustomerDaoimpl( );

            case ITEM:
                return  new ItemDaoimpl( );

            case ORDER:
                return  new OrdersDaoimpl( );

            case EMPLOYEE:
                return   new EmployeeDaoimpl( );

            case SUPPLIERS:
                return   new SupplyerDaoimpl( );

            default:
               return null;

        }
    }
}
