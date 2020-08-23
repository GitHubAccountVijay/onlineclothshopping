package com.farm.contactus;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.farm.factory.HibernateUtil;

public class ContactusDAO {
	public void addContactDetails(String fullname, String email, String phone, String comment)
	{
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			ContactUs contactUs = new ContactUs();
			contactUs.setFullname(fullname);
			contactUs.setEmail(email);
			contactUs.setPhone(phone);
			contactUs.setComment(comment);
			session.save(contactUs);
			transaction.commit();
			
		} catch (Exception e) {
			
		}
		finally {
			session.close();
		}
		
		
	}
}
