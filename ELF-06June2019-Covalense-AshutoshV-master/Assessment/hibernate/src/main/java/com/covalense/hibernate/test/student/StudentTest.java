package com.covalense.hibernate.test.student;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.dto.StudentBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String query = "Select firstName , totalMarks from StudentBean";
		Query query2 = session.createQuery(query);
		List<StudentBean> list = query2.getResultList();
		for (StudentBean studentBean : list) {
			log.info("" + studentBean.getFirstName());
			log.info(""+studentBean.getTotalMarks());
		}
	}

}
