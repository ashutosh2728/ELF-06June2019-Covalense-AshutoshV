package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetInfoUsingProjection {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection projection = Projections.property("name");
		Projection projection1 = Projections.property("salary");
		Projection projection2 = Projections.property("d+esignation");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection);
		projectionList.add(projection1);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		List<Object[]> employeeInfoBeans = criteria.list();

		for (Object[] object : employeeInfoBeans) {
			log.info("" + object[0]);
			log.info("" + object[1]);
			log.info("" + object[2]);
		}

	}
}
