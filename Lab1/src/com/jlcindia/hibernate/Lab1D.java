package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1D {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
		
			SessionFactory sessionFactory= XHibernateUtil.getSessionFactory();
		    Session session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		
		    //Your Persistence Operations Here
		    Customer cust = session.load(Customer.class,3);
		    System.out.println(cust);
		    session.delete(cust);
		    tx.commit();
		    session.close();
		    }
		catch(Exception ex) {
			tx.rollback();
		    ex.printStackTrace();
		    }
	}

}
