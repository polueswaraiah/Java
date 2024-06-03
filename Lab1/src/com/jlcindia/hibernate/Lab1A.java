package com.jlcindia.hibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class Lab1A {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			//Step 1: get the SessionFactory Object.
			SessionFactory sessionFactory= XHibernateUtil.getSessionFactory();
			
			//Step 2: Open the Session
			Session session = sessionFactory.openSession();
			
			//Step 3: Begin Transaction
			tx=session.beginTransaction();
			
			//Step4: Do Your Ops
			Customer cust = new Customer("Rama","ra@jlc",8888,"Noida");
		    session.save(cust);
		    
		    //Step 5: End Tx
		    // tx.commit(); //***
		    
		    //Step 6: Close Session
		   session.close();
		    
		    }
		catch(Exception ex) {
			
			//Step 5: End Tx
			//tx.rollback();
			ex.printStackTrace();
			} 

	}

}
