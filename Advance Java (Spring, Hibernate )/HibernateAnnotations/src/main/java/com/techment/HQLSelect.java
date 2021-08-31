package com.techment;

import java.util.Iterator;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration configuration = new Configuration();
configuration.configure("hibernate.cfg.xml");


SessionFactory sessionFactory = configuration.buildSessionFactory();
Session session = sessionFactory.openSession();

Query query= session.createQuery("select s from Student s");

List l = query.list();

System.out.println("Output");
//studentList.forEach(s->System.out.println(s.getDept()+" "+s.getName()));



l.forEach(System.out::println);		



System.out.println("only specific");

Query query2= session.createQuery("select s.studentId,s.name from Student s");

List<Student> l2 = query2.list();



Iterator it = l2.iterator();

while(it.hasNext())
{
	Object o[] = (Object[])it.next();

	System.out.println(o[0]+ " "+o[1]);

	System.out.println("----------------");
}	


session.close();
sessionFactory.close();

	}

}
