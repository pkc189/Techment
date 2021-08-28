package com.techment;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class OurLogic 
{
	public static void main(String args[])
	{
	    //  ApplicationContext context = new ClassPathXmlApplicationContext("object.xml");

	      
		Resource res = new ClassPathResource("object.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		CreateTable st =(CreateTable)factory.getBean("id3");
		st.createTable();
	}
}
