package com.org.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria cr = session.createCriteria(Product.class);
		
		//cr.add(Restrictions.gt("price", 20000.0));
		
		// cr.add(Restrictions.lt("price", 110000.0));
		
		 //cr.add(Restrictions.between("price",20000.0,70000.0));
		
		 //cr.add(Restrictions.like("brand", "hp%"));
			
		// To sort records in descening order
		//cr.addOrder(Order.desc("price"));
		
		// To sort records in ascending  order
			cr.addOrder(Order.asc("price"));
		
		
			/*
			 * Criterion price = Restrictions.gt("price", 20000.0); Criterion productName =
			 * Restrictions.like("productName", "Tv%");
			 */
			/*
			 * LogicalExpression orExp = Restrictions.or(price, productName); cr.add(orExp);
			 */		 	 
		
			/*
			 * LogicalExpression andExp = Restrictions.and(price, productName);
			 * cr.add(andExp);
			 */
		 
		
		

		
		List results = cr.list();
		
		/*
		 * Iterator itr = results.iterator(); while(itr.hasNext()) { Product p
		 * =(Product) itr.next(); System.out.println("Product Id is :"+
		 * p.getProductId());
		 * System.out.println("Product name is :"+p.getProductName());
		 * System.out.println("Product price is :" +p.getPrice());
		 * System.out.println("Product brand is : "+p.getBrand());
		 * System.out.println("**********"); }
		 */
		
		
		/*
		 * cr.setProjection(Projections.avg("price")); List avgPrice = cr.list();
		 * System.out.println("Average price of Products:" + avgPrice.get(0));
		 */
		
		
		/*
		 * cr.setProjection(Projections.rowCount()); List count = cr.list();
		 * System.out.println("Row Count :" + count.get(0));
		 */
		
		/*
		 * cr.setProjection(Projections.max("price"));
		 * 
		 * List maxPrice = cr.list(); System.out.println("Max product price:" +
		 * maxPrice);
		 */
		
		
		/*
		 * cr.setProjection(Projections.min("price"));
		 * 
		 * List minPrice = cr.list(); System.out.println("Min product price:" +
		 * minPrice);
		 */
		
		
		  cr.setProjection(Projections.sum("price"));
		  List sumPrice = cr.list();
		  System.out.println("Sum of  product price:"+sumPrice);
		 
	}

}
