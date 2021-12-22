package com.gayu.hibernateprojects;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate projects
 *
 */
public class Application {
	public static void main(String[] args) {

		Person objPerson = new Person();

		PersonName objPersonName = new PersonName();
		objPersonName.setFirstName("Gayathri");
		objPersonName.setMiddleName("Yethapur");
		objPersonName.setLastName("Kasi");

		objPerson.setPid(108);
		objPerson.setPersonName(objPersonName);
		objPerson.setPcolor("brown");

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction(); // objPerson=(Person)
		// session.get(Person.class, 100); // get the values from Table

		session.save(objPerson); // insert data into table

		tx.commit();

	}
}
