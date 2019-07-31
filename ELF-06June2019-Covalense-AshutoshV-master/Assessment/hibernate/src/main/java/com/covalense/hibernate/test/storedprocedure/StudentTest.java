package com.covalense.hibernate.test.storedprocedure;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.util.HibernateUtil;

public class StudentTest {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
    //  StoredProcedureQuery query =  session.createStoredProcedureCall("studentsp");
	
    StoredProcedureQuery query = session.createStoredProcedureCall("student");
    
 
 
	
	

}
