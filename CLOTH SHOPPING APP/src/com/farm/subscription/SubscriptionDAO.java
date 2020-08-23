package com.farm.subscription;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.farm.factory.HibernateUtil;

public class SubscriptionDAO {

	public void subscriptionDetails(String fname, String lname, String email)
	{
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Subscription subscription = new Subscription();
			subscription.setFname(fname);
			subscription.setLname(lname);
			subscription.setEmail(email);
			session.save(subscription);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
	}
	
}
