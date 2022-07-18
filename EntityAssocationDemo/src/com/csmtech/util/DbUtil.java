package com.csmtech.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Schlorship;
import com.csmtech.entity.Student;







public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			cnf=	new Configuration();
			cnf.addAnnotatedClass(Branch.class);
			cnf.addAnnotatedClass(Schlorship.class);
			cnf.addAnnotatedClass(Student.class);

			sessionFactory=cnf.buildSessionFactory();
		}
		return sessionFactory;
	}
}
