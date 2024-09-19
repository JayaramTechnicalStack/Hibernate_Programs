package com.orm;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		 Configuration cfg = new Configuration(); 
		 
		 cfg.configure("hibernate.cfg.xml"); // it helps to us load the configuration properties in cfg file 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 
		 Session session1 = factory.openSession(); // session 
		 
			
			/*
			 * Student s = new Student();
			 * 
			 * s.setSname("vijay"); s.setSaddr("Chennai"); s.setCourse("devops");
			 * 
			 * session1.save(s);
			 * 
			 * Transaction tx = session1.beginTransaction(); tx.commit();
			 */
		 
			
		// Transaction tx= session1.beginTransaction();
		 
			Object obj3 = session1.get(Student.class, new Integer(5));

			Student s3 = (Student) obj3;
			
			System.out.println("Session 1 : Student Id :" + s3.getStno() +
					  " Student Name : " + s3.getSname() + " Student Address: " + s3.getSaddr() +
					 "   Student Course : " + s3.getCourse());
			
			
			 Session session2 = factory.openSession();
			 
			Object obj4 = session2.get(Student.class, new Integer(5));

			Student s4 = (Student) obj4;
			
			System.out.println("Session 2 : Student Id :" + s4.getStno() +
					  " Student Name : " + s4.getSname() + " Student Address: " + s4.getSaddr() +
					 "   Student Course : " + s4.getCourse());
			
			/*
			 * System.out.println("Session 2 : Student Id :" + s3.getStno() +
			 * " Student Name : " + s3.getSname() + " Student Address: " + s3.getSaddr() +
			 * "   Student Course : " + s3.getCourse());
			 * 
			 * s3.setSaddr("Pune"); s3.setCourse("html"); session1.update(s3); tx.commit();
			 */
			
			/*
			 * session1.delete(s3); Transaction trn = session1.beginTransaction();
			 * trn.commit();
			 */
			 
		 
		 //load ObjectNotFoundException 
		 
		 // NullPointerException
		 
		
		 
			/*
			 * Object obj = session1.get(Student.class, new Integer(4)); // null
			 * 
			 * Student s1 = (Student) obj; // null
			 * 
			 * System.out.println("Session 1 :Student Id :" + s1.getStno() +
			 * " Student Name : " + s1.getSname() + " Student Address: " + s1.getSaddr() +
			 * "   Student Course : " + s1.getCourse());
			 */
		 
			/*
			 * Object obj = session1.get(Student.class, new Integer(3)); // null
			 * 
			 * Student s1 =(Student)obj;
			 * 
			 * System.out.println("Session 1 :Student Id :"+s1.getStno() +
			 * " Student Name : " +s1.getSname() + " Student Address: "+s1.getSaddr() +
			 * "   Student Course : "+s1.getCourse());
			 * 
			 * Session session2 = factory.openSession();
			 * 
			 * Object obj2 = session2.get(Student.class, new Integer(3)); // null
			 * 
			 * Student s2 =(Student)obj2;
			 * 
			 * System.out.println("Session 2 :Student Id :"+s2.getStno() +
			 * " Student Name : " +s2.getSname() + " Student Address: "+s2.getSaddr() +
			 * "   Student Course : "+s2.getCourse()); session2.evict(s2);
			 * 
			 * Object obj3 = session2.get(Student.class, new Integer(3)); // null
			 * 
			 * Student s3 =(Student)obj3;
			 * 
			 * System.out.println("Session 2 :Student Id :"+s3.getStno() +
			 * " Student Name : " +s3.getSname() + " Student Address: "+s3.getSaddr() +
			 * "   Student Course : "+s3.getCourse());
			 */
		 
			/*
			 * Scanner sc = new Scanner(System.in);
			 * System.out.println("Enter Student Name :"); String student_name = sc.next();
			 * System.out.println("Enter Student Address"); String student_addr = sc.next();
			 * 
			 * System.out.println("Enter Student Course"); String student_course =
			 * sc.next();
			 * 
			 * //insert operation
			 * 
			 * Student s1=new Student(); //s1.setStno(5); s1.setSname(student_name);
			 * s1.setSaddr(student_addr); s1.setCourse(student_course); session1.save(s1);
			 * 
			 * 
			 * 
			 * Transaction tx= session1.beginTransaction();
			 * 
			 * tx.commit(); session1.close();
			 * 
			 * System.out.println(" object saved sucessfully");
			 */
			  
			  
				  
				  
			/*
			 * Object obj = session1.load(Student.class, new Integer(10)); // null
			 * 
			 * Student s1 =(Student)obj;
			 * 
			 * System.out.println("Session 1 :Student Id :"+s1.getStno() +
			 * " Student Name : " +s1.getSname() + " Student Address: "+s1.getSaddr() +
			 * "   Student Course : "+s1.getCourse());
			 */
					/*
					 * Object obj2 = session2.get(Student.class, new Integer(3));
					 * 
					 * 
					 * Student s2=(Student)obj2;
					 * System.out.println("Session 2 : Student Id :"+s2.getStno() +
					 * " Student Name : " +s2.getSname() + " Student Address: "+s2.getSaddr() +
					 * "   Student Course : "+s2.getCourse());
					 */
				 
			 
				  
					
					  
					  
					 
				/*
				 * session.delete(s1);
				 * 
				 * 
				 * Transaction tx=session.beginTransaction();
				 * 
				 * tx.commit();
				 */
	}
	
}

