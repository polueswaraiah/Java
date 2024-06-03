package com.jlcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class XHibernateUtil {
	static SessionFactory sessionFactory;
	static {
		try {
	    
			StandardServiceRegistryBuilder ssrbuilder=new StandardServiceRegistryBuilder();
		    ServiceRegistry serviceReg=ssrbuilder.configure().build();
		    Metadata metadata=new MetadataSources(serviceReg).getMetadataBuilder().build();
		    sessionFactory=metadata.getSessionFactoryBuilder().build();
		    }
		catch(Exception ex) {
			ex.printStackTrace();
			}
		}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		}
	}

