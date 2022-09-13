package com.cs.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		Developer01 developer1 =new Developer01();
	    developer1.setId(1001);
	    developer1.setNameSurname("Sedat KURNALI");
	    developer1.setJob("Full Stack Java Developer");
	    developer1.setCompany(null);
	    developer1.setExperience(0);
	    developer1.setSalary(0);
	    
	    Developer01 developer2 =new Developer01();
	    developer2.setId(1002);
	    developer2.setNameSurname("Merve CULHA");
	    developer2.setJob("Full Stack Mobile Developer");
	    developer2.setCompany(null);
	    developer2.setExperience(0);
	    developer2.setSalary(0);
	    
	    Configuration con = new
                Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer01.class);


	    SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        
        session.save(developer1);
        session.save(developer2);
        
        tx.commit();

        session.close();

        sf.close();
	}

}
