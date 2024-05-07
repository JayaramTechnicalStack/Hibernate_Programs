package com.org.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Product p = new Product();
		
		p.setProductId(7);
		p.setProductName("Mobile");
		p.setPrice(80000.00);
		p.setBrand("Apple");

		session.save(p);

		Transaction tx = session.beginTransaction();
		tx.commit();

		session.close();
		System.out.println("Product object inserted Successfully...!");
		
		// insert
		
		/*
		 * Product p = new Product(); p.setProductId(5); p.setProductName("Mac");
		 * p.setPrice(89000.01); p.setBrand("Mac");
		 * 
		 * session.save(p);
		 */
		
		/*
		 * Transaction tx = session.beginTransaction(); tx.commit();
		 */

		// select
		// load method if record not found in database . will get ObjectNotFoundException
		/*
		 * Object obj = session.get(Product.class, new Integer(1));
		 * 
		 * Product product = (Product)obj;
		 * 
		 * System.out.println( "Product Id is: " + product.getProductId() +
		 * "Product Name is : " + product.getProductName() + "Product Price is :  " +
		 * product.getPrice() + "Product Brand is : " + product.getBrand());
		 */
		
		// update
		
		
		/*
		 * Object obj = session.load(Product.class, new Integer(6));
		 * 
		 * Product product = (Product) obj;
		 * 
		 * product.setProductName("TV"); product.setPrice(95000.30);
		 * product.setBrand("LG");
		 * 
		 * session.update(product);
		 * 
		 * Transaction tx = session.beginTransaction(); tx.commit();
		 */
		

		// Delete
		
		Object obj = session.load(Product.class, new Integer(5));

		Product product = (Product) obj;
		session.delete(product);
		Transaction tr = session.beginTransaction();
		tr.commit();
		 
		
		
	}

}
