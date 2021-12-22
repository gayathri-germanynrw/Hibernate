package com.gayu.hibernateprojects;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MappingRelations {
	public static void main(String[] args) {

		Laptop objLaptop = new Laptop();
		objLaptop.setLid(40);
		objLaptop.setLname("APPLE MAC");
		
		Student objStudent = new Student();

		objStudent.setRollno(105);
		objStudent.setName("Chandra");
		objStudent.setMarks("60");
 
		//objStudent.setLaptop(objLaptop);   // One to One Mapping
		
		objStudent.getLaptop().add(objLaptop); // one to many

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		

		session.save(objStudent); // insert data into table
		session.save(objLaptop);

		tx.commit();

		System.out.println(objStudent);
		System.out.println(objLaptop);

	}

}
