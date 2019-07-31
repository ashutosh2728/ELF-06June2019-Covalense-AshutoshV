package com.covalense.hibernate.test.products;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.dto.ProductsBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class NameRestriction {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ProductsBean.class).add(Restrictions.ilike("productName", "a%"));
		List<ProductsBean> list=criteria.list();
		for (ProductsBean productsBean : list) {
			log.info(""+productsBean.getProductId());
			log.info(""+productsBean.getProductName());
			log.info(""+productsBean.getPrice());
			log.info(""+productsBean.getColor());
			log.info(""+productsBean.getWeight());
		}
	}
}
