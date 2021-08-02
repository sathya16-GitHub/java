package co.td.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.td.spring.core.collections.beans.Hospital;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

Hospital h = (Hospital)context.getBean("hospital1");
System.out.println(h.getHospitalName());
System.out.println(h.getDepartments().getClass());
System.out.println(h.getDepartments());
	}

}
