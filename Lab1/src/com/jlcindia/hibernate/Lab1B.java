package com.jlcindia.hibernate;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab1B {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			SessionFactory sessionFcatory=XHibernateUtil.getSessionFactory();
			Session session=sessionFcatory.openSession();
			tx=session.beginTransaction();
			
			//Your Persistance Operation Here
			Customer cust=session.load(Customer.class, 3);
			System.out.println(cust);
			
			tx.commit();
			session.close();
		}
		catch(Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		
	}

}
