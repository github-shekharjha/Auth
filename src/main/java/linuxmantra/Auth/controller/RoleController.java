package linuxmantra.Auth.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import linuxmantra.Auth.beans.*;
public class RoleController {
	
	public long saveRole(Role role) {
		long retVal=1;
		SessionFactory factory=HibernateUtil.getSessionFatory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		try {
			session.save(role);
			tr.commit();
			session.close();	
			factory.close();
			System.out.println("Succeed");
		
		}
		catch(Exception ex) {
			tr.rollback();
			retVal=0;
			session.close();
			factory.close();
			System.out.println(ex);
		}
		return retVal;
	}
	
}
