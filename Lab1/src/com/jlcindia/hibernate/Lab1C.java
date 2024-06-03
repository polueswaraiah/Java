package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try {
			SessionFactory sessionFactory= XHibernateUtil.getSessionFactory();
		    Session session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		
		    //Your Persistence Operations Here
		    Customer cust = session.load(Customer.class,1);
		    System.out.println(cust);
		    cust.setCname("EswaRukku");
		    cust.setEmail("Eswar@jlc");
		    cust.setPhone(1111);
		    cust.setCity("Delhi");
		
		    //session.update(cust);
		    tx.commit();
		    session.close();
		    }
		catch(Exception ex) {
			tx.rollback();
		    ex.printStackTrace();
		    }
		}
}
