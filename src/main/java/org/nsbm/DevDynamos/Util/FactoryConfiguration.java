package org.nsbm.DevDynamos.Util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nsbm.DevDynamos.Entity.CustomerEntity;

import java.io.IOException;
import java.util.Properties;


public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;//create session factory

    private FactoryConfiguration() {
        //add configuration
        Configuration configuration=new Configuration();
        //add propety
        Properties properties=new Properties();

        //add already cretae hibernate file to propeperties in current thread
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("resouces/hibernate.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //add properties to configure
        configuration.setProperties(properties);

        //add annotaion class to configure



        configuration = new Configuration().configure()
                .addAnnotatedClass(CustomerEntity.class);



        //build session factory
        sessionFactory = configuration.buildSessionFactory();

    }

    public static FactoryConfiguration getInstance() {
        return factoryConfiguration == null ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;

    }
    public Session getSession() {
        return sessionFactory.openSession();//open session and return it
    }

}
